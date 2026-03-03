# **Project Documentation**

## **Project Title**

**Quiz Game – Java Console Application**

---

## **1. Introduction**

The Quiz Game is a console-based Java application developed to demonstrate fundamental programming concepts such as modular design, user input handling, conditional logic, and score management. The application presents multiple-choice questions to the user and evaluates their responses to calculate a final score.

---

## **2. Objectives**

* To design a simple quiz system using Java
* To implement structured question storage
* To validate user input effectively
* To evaluate answers and maintain a score
* To display final results clearly

---

## **3. Scope of the Project**

This project focuses on:

* Console-based interaction
* Multiple-choice questions
* Basic scoring logic

The project does not include:

* Graphical user interface
* Database or file-based storage
* Network or web-based features

---

## **4. System Requirements**

### **4.1 Hardware Requirements**

* Any system capable of running Java
* Minimum 2 GB RAM

### **4.2 Software Requirements**

* Java Development Kit (JDK)
* Command-line interface or any Java-supported IDE

---

## **5. Application Workflow**

1. The application loads a predefined set of quiz questions.
2. Questions are randomized to ensure variation.
3. Each question is displayed with four options (A, B, C, D).
4. The user selects an answer within the given time.
5. The response is validated and evaluated.
6. The score is updated accordingly.
7. The final score is displayed after quiz completion.

---

## **6. Data Structure Used**

* Questions are stored using a structured collection.
* Each question contains:

  * Question text
  * Four answer options
  * One correct answer

This approach ensures consistency and easy scalability.

---

## **7. Functional Description**

### **7.1 Question Handling**

* Creation and storage of quiz questions
* Retrieval of all questions for the quiz
* Randomization of question order

### **7.2 User Input Handling**

* Prompts user to enter an option (A, B, C, or D)
* Removes unnecessary spaces
* Converts input to a standard format
* Rejects invalid input safely

### **7.3 Answer Evaluation**

* Compares user input with the correct answer
* Displays appropriate feedback for correct and incorrect responses

### **7.4 Score Management**

* Maintains user score throughout the quiz
* Increments score for correct answers only
* Displays final score at the end

---

## **8. Scoring Criteria**

| Condition        | Score |
| ---------------- | ----- |
| Correct Answer   | +1    |
| Incorrect Answer | 0     |

---

## **9. Limitations**

* Supports a limited number of predefined questions
* No persistent storage of quiz results
* Console-based interface only

---

## **10. Future Enhancements**

* Add more questions dynamically
* Introduce difficulty levels
* Implement negative marking
* Store questions and scores in files or databases
* Develop a graphical user interface

---

## **11. Conclusion**

The Quiz Game project successfully demonstrates the use of Java programming fundamentals in building a structured and interactive console application. It provides a strong foundation for understanding input validation, control flow, and modular programming.

