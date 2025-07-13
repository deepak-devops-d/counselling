# Base image
FROM node:18-alpine

# Working directory
WORKDIR /app

# Copy dependencies first
COPY package*.json ./
RUN npm install

# Copy the rest of the app
COPY . .

# Expose port
EXPOSE 5000

# Start command
CMD ["node", "index.js"]
