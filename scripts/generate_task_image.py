from openai import OpenAI
import os
import requests
from io import BytesIO
from PIL import Image

# Paths for task file and generated image
task_file_path = os.path.join("tasks", "new_task.md")
image_path = os.path.join("tasks", "task_image.png")

def generate_image_from_description(description, client):
    # Generate image using DALL-E 3 based on the task description
    prompt = f"Create an illustration for this task: {description[:200]}..."
    response = client.images.generate(
        model="dall-e-3",
        prompt=prompt,
        size="1024x1024",
        quality="standard",
        n=1,
    )

    # Download the generated image
    image_url = response.data[0].url
    image_response = requests.get(image_url)
    image = Image.open(BytesIO(image_response.content))
    image.save(image_path)
    return image_path

def insert_image_into_markdown(image_path, markdown_path):
    # Read the existing task description and add the image at the top
    with open(markdown_path, "r") as f:
        markdown_content = f.read()
    image_markdown = f"![Task Image](./task_image.png)\n\n"
    new_markdown_content = image_markdown + markdown_content

    # Write the updated content back to the markdown file
    with open(markdown_path, "w") as f:
        f.write(new_markdown_content)

def main(api_key):
    client = OpenAI(api_key=api_key)

    # Read the task description from the markdown file
    with open(task_file_path, "r") as f:
        task_description = f.read()

    # Generate the image and add it to the markdown file
    generate_image_from_description(task_description, client)
    insert_image_into_markdown(image_path, task_file_path)
    print("Image generated and added to the task file.")

if __name__ == "__main__":
    # Ensure the OpenAI API key is provided as an environment variable
    api_key = os.getenv("OPENAI_API_KEY")
    if not api_key:
        print("Error: OpenAI API key not found.")
    else:
        main(api_key)
