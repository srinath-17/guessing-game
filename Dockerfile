# Use a base Java image
FROM openjdk:latest

# Set the working directory in the container
WORKDIR /app

# Copy the Java source code into the container
COPY GuessingGame.java /app

# Compile the Java source code
RUN javac GuessingGame.java

# Command to run the Java application
CMD ["java", "GuessingGame"]
