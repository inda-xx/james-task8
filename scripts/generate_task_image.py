import openai
import os
from PIL import Image
import requests
from io import BytesIO

# Set the OpenAI API key and file paths
api_key = os.getenv("OPENAI_API_KEY")
task_file_path = os.path.join("tasks", "new_task.md")
image_path = os.path.join("tasks", "task_image.png")

def generate_image_from_description(description):
    openai.api_key = api_key
    prompt = f"Create an illustration for the following task: {description[:200]}..."
    response = openai.Image.create(prompt=prompt, size="1024x1024")

    # Save the image
    image_url = response["data"][0]["url"]
    image_response = requests.get(image_url)
    image = Image.open(BytesIO(image_response.content))
    image.save(image_path)
    return image_path

def insert_image_into_markdown(image_path, markdown_path):
    with open(markdown_path, "r") as f:
        markdown_content = f.read()
    image_markdown = f"![Task Image](./task_image.png)\n\n"
    new_markdown_content = image_markdown + markdown_content

    # Write updated content to the markdown file
    with open(markdown_path, "w") as f:
        f.write(new_markdown_content)

def main():
    # Read task description from markdown
    with open(task_file_path, "r") as f:
        task_description = f.read()

    # Generate image and add to markdown file
    image_path = generate_image_from_description(task_description)
    insert_image_into_markdown(image_path, task_file_path)
    print("Image generated and added to task file.")

if __name__ == "__main__":
    main()
