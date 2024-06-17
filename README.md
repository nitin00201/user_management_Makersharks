# Steps to Run the Application

1. **Open the Project Folder**
   - Use your favorite IDE (e.g., VS Code, JetBrains, etc.) to open the project folder.

2. **Configure Database Settings**
   - Navigate to the `application.properties` file.
   - Update the database `username`, `password`, and `database name` according to your setup.

3. **Run the Application**
   - Start the application by running it through your IDE or using the command line.

4. **Access the Application**
   - The application will be available at port `8081`.

# Application Details

## Technologies Used
- Spring Web
- Spring Data JPA
- MySQL Driver
- Lombok

## API Endpoints

- **Fetch User Data**: `GET http://localhost:8081/api/user/fetch`
  - Description: Retrieve user data by username.
  - Example: `http://localhost:8081/api/user/fetch?username=test1`
  - Response:
    ```json
    {
        "id": 52,
        "username": "test1",
        "email": "test1@mail.com",
        "password": "test1password"
    }
    ```

- **Register User**: `POST http://localhost:8081/api/user/register`
  - Description: Register a new user. The email must be unique.
  - Example request body:
    ```json
    {
        "username": "test1",
        "email": "test1@mail.com",
        "password": "test1password"
    }
    ```
  - Response:
    - Success: `"user registered successfully"`
    - Failure: `"an error occurred"`
