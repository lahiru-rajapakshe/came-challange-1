# came-challange-1

This is a Java console application that implements the Merge Sort algorithm. The program sorts arrays of integers in ascending order using a custom implementation without relying on built-in sorting functions.

## Copyright

Copyright (c) 2025 Lahiru Rajapakshe. All rights reserved.

## What You'll Need

To run this program, you need to have Java installed on your computer:

- **Java JDK 8 or newer**
  - You can get it from [Oracle's website](https://www.oracle.com/java/technologies/downloads/) or download [OpenJDK](https://openjdk.org/)
  - To check if you have Java installed, open your terminal and type: `java -version`

## How to Run

Here's how you can clone this repository and run the program on your machine.

### Step 1: Clone the Repository

```bash
git clone <repository-url>
cd came-challlange-1
```

### Step 2: Compile the Code

```bash
javac src/Main.java
```

### Step 3: Run the Program

```bash
java -cp src Main
```

The program will run several test cases and display the results. You'll see tests for:
- Mixed positive and negative numbers
- Arrays with duplicates
- Already sorted arrays
- Reverse sorted arrays
- Empty arrays
- Single element arrays
- Arrays with identical values

## Features

The merge sort implementation includes:

- **Custom Implementation**: No built-in sorting methods used
- **Divide and Conquer**: Recursively divides the array into halves
- **Efficient Merging**: Combines sorted subarrays in linear time
- **Time Complexity**: O(n log n) for all cases
- **Space Complexity**: O(n) for auxiliary arrays
- **Handles All Cases**: Works with positive numbers, negative numbers, zeros, and duplicates

## How It Works

The `sortAndPrint()` function accepts an array of integers and:
1. Recursively divides the array into smaller subarrays
2. Sorts each subarray
3. Merges the sorted subarrays back together
4. Prints the final sorted array to stdout

## Learn More About Java

If you want to learn more about Java programming, check out the [Official Java Documentation](https://docs.oracle.com/en/java/).

