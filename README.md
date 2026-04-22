# 🌿 MyWellness Studio - Test Automation Framework

A robust and scalable **UI Automation Testing Framework** built using **Selenium WebDriver, Java, and TestNG**. This project is designed to ensure high-quality testing of the *MyWellness Studio* application with maintainability, readability, and reusability at its core.

---

## 🚀 Tech Stack

* **Language:** Java
* **Automation Tool:** Selenium WebDriver
* **Testing Framework:** TestNG
* **Build Tool:** Maven
* **Design Pattern:** Page Object Model (POM)

---

## 📁 Project Structure

```
src/test/java
│
├── AppBuilder
├── Auth
├── ClinicInfo
├── Config
├── CustomPlans
├── Dashboard
├── Journey
├── JourneyRequest
├── Patient
├── Post
├── Rewards
├── RolesAndPermission
├── SpecialOffers
├── Stories
├── Tasks
├── TeamDirectory
└── Videos

src/test/resources

config.properties
pom.xml
README.md
```

---

## 🧩 Key Features

* ✅ Modular and scalable framework design
* ✅ Separation of test logic using POM
* ✅ Cross-browser testing capability (extendable)
* ✅ Easy configuration via `config.properties`
* ✅ Organized test modules based on application features
* ✅ Reusable utility methods and components
* ✅ Test execution control using TestNG XML

---

## ⚙️ Setup Instructions

### Prerequisites

* Java JDK 8 or above
* Maven installed
* IDE (IntelliJ / Eclipse)
* Chrome/Edge browser

### Installation Steps

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/mywellness-studio.git
   ```

2. Navigate to the project directory:

   ```bash
   cd mywellness-studio
   ```

3. Install dependencies:

   ```bash
   mvn clean install
   ```

---

## ▶️ Test Execution

Run tests using Maven:

```bash
mvn test
```

Or execute via TestNG XML files from your IDE.

---

## 📌 Configuration

All environment-specific configurations are handled in:

```
config.properties
```

Example:

```
baseUrl=https://example.com
browser=chrome
```

---

## 📊 Reporting (Optional Enhancement)

Currently uses TestNG default reports. Can be extended with:

* Extent Reports
* Allure Reports

---

## 🔮 Future Enhancements

* 🔹 Integration with CI/CD tools (Jenkins, GitHub Actions)
* 🔹 Parallel test execution for faster runs
* 🔹 Docker containerization for environment consistency
* 🔹 Cross-browser testing using Selenium Grid
* 🔹 API testing integration (RestAssured)
* 🔹 Logging using Log4j
* 🔹 Screenshot capture on test failure
* 🔹 Data-driven testing using Excel/JSON
* 🔹 BDD integration using Cucumber


## ✨ Author

Ashish Rai
|| QA Engineer


