## Testing can mean many different things
- It certainly includes running a completed program with **various inputs**
- It also includes any evaluation performed by human or computer to assess quality
- Some evaluations should occur before coding even begins
- The earlier we find a problem, the easier and cheaper it is to fix

### The goal of testing is to find errors

## Review
- A review is a meeting in which several people examine a design document or section of code
- It is a common and effective form of human-based testing

## Test Cases
- A **test case** is a set of input and user actions, coupled with the expected results
- Often test cases are organized formally into **test suites** which are stored and reused as needed

## Defect and Regression Testing
- Defect testing is the execution of test cases to uncover errors
- The act of fixing an error may introduce new errors
- After fixing a set of errors we should perform **regression testing** – running previous test suites to ensure new errors haven't been introduced


## Black-Box Testing 
- In black-box testing, test cases are developed without considering the internal logic
- They are based on the input and expected output
- Input can be organized into **equivalence categories**

## White-Box Testing
- White-box testing (aka glass-box testing) focuses on the internal structure of the code
- The goal is to ensure that every path through the code is tested – statement coverage test
- Paths through the code are governed by any conditional or looping statements in a program

### A good testing effort will include both black-box and white-box tests
