# Stage 1: Build the React app
FROM node:18-alpine as builder
WORKDIR /app
COPY package*.json ./
RUN npm install
RUN npm install react-scripts  # 👈 Explicitly install if missing
COPY . .
RUN npm run build
