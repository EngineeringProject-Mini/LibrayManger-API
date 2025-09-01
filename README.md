# LibraryManger API

This is a simple implemention of an a Library Management System that allows members to borrow and return books, manages book inventory, tracks loans, and supports catalog search.  

---

## 🚀 Getting Started

### 1. Generate Project with Spring Initializr
1. Go to [Spring Initializr](https://start.spring.io/).
2. Fill in the details:
   - Project: Maven
   - Language: Java
   - Spring Boot Version: (latest stable, e.g., 3.x.x)
   - Group: librarymangmentsystem
   - Artifact: 
   - Name: librarymangmentsystem
   - Packaging: Jar
   - Java: 17 (or your installed version)
3. Add dependencies:
   - Spring Web
   - - Lombok
4. Click Generate, and extract the downloaded project.

---

### 2. Open in IntelliJ IDEA
1. Open IntelliJ IDEA.
2. Import the project by selecting the extracted folder.
3. Wait until Maven builds the project and dependencies are downloaded.

---

### 3. Run the Application
1. Locate the main class:  
   src/main/java/elevaorsystem.java
2. Right-click and select Run 'LibrarymangmentsystemApplication'.
3. The application will start on http://localhost:8080 by default.

---

## 🛠️ Tech Stack
- Java 17+
- Spring Boot
- Maven
- REST API
---

## 📚 Library Management System - API Endpoints

### 1. **Add Library Items**

```http
POST /api/library/items
```

* Adds new items (books, magazines, etc.) with copies to the library.
<img width="1366" height="768" alt="Screenshot (396)" src="https://github.com/user-attachments/assets/5dcec52d-313d-433d-8053-e33c33e51a76" />

---

### 2. **Add Library Member**

```http
POST /api/library/members
```

* Registers a new library member.
<img width="1366" height="768" alt="Screenshot (397)" src="https://github.com/user-attachments/assets/f1285e5d-c1c6-4ec1-a725-e551bca89a04" />

---

### 3. **Search Items by Title**

```http
GET /api/library/search/title?query=xyz
```

* Searches the catalog for items by title.
<img width="1366" height="768" alt="Screenshot (398)" src="https://github.com/user-attachments/assets/0cc22a9f-ac3b-4807-8bea-d062308bbd7c" />
<img width="1366" height="768" alt="Screenshot (399)" src="https://github.com/user-attachments/assets/84bf25c5-1651-4175-a803-b468538127be" />

---

### 4. **Search Items by Author**

```http
GET /api/library/search/author?query=xyz
```

* Searches the catalog for items by author name.
<img width="1366" height="768" alt="Screenshot (400)" src="https://github.com/user-attachments/assets/add14972-9053-461d-a287-365644c5a1f6" />

---

### 5. **Checkout an Item Copy**

```http
POST /api/library/checkout?memberId=MEM01&copyId=B001-c1
```

* Allows a member to checkout a specific copy of an item.
<img width="1366" height="768" alt="Screenshot (401)" src="https://github.com/user-attachments/assets/d40085b0-b6fb-4d1c-ab8c-9e853ebf8c24" />

---

### 6. **Return an Item Copy**

```http
POST /api/library/return?copyId=B001-c1
```

* Returns a borrowed copy back to the library.

---

### 7. **Place a Hold on an Item**

```http
POST /api/library/hold?memberId=MEM02&itemId=B002
```

* Places a hold on an item for a member if it is not currently available.

---

Would you like me to also **add sample request/response JSON** for each endpoint (so your README looks more professional for interview/projects)?
