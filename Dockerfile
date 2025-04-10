FROM python:3.9-slim

# Set environment variables
ENV PYTHONDONTWRITEBYTECODE 1
ENV PYTHONUNBUFFERED 1

# Set the working directory inside the container
WORKDIR /app

# Copy dependencies first to leverage Docker cache
COPY requirements.txt /app/

# Install the Python dependencies
RUN pip install --upgrade pip && pip install -r requirements.txt

# Copy the rest of the project files
COPY . /app/

# Expose the port for Gunicorn
EXPOSE 8000

# Command to run Gunicorn with 3 workers
CMD ["gunicorn", "counselling.wsgi:application", "--workers", "3", "--bind", "0.0.0.0:8000"]

