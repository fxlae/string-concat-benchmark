# JMH benchmark for different ways of doing string concatenation in Java

A comparison of different ways doing string concatenation in Java.

## Usage
``` bash
mvn clean package
java -jar target/benchmarks.jar
```

## Results

Tested with OpenJDK 8 Server VM.  
`n` is the amount of concatenated strings.

### n = 2

| benchmark                             | op/s     | %      |
|---------------------------------------|----------|--------|
| "+"-operator                          | 25872900 | 100,0  |
| StringBuilder                         | 25593753 | 98,9   |
| String.concat                         | 19545611 | 75,5   |
| SLF4J MessageFormat                   | 4855345  | 18,8   |
| String.format                         | 1331638  | 5,1    |

### n = 3

| benchmark                             | op/s     | %      |
|---------------------------------------|----------|--------|
| StringBuilder                         | 17567702 | 100,0  |
| "+"-operator                          | 17371130 | 98,9   |
| String.concat                         | 9038529  | 51,4   |
| SLF4J MessageFormat                   | 4207069  | 23,9   |
| String.format                         | 950366   | 5,4    |

### n = 4

| benchmark                             | op/s     | %      |
|---------------------------------------|----------|--------|
| "+"-operator                          | 13505387 | 100,0  |
| StringBuilder                         | 13388376 | 99,1   |
| String.concat                         | 4987565  | 36,9   |
| SLF4J MessageFormat                   | 2707925  | 20,1   |
| String.format                         | 757348   | 5,6    |

### n = 5

| benchmark                             | op/s     | %      |
|---------------------------------------|----------|--------|
| "+"-operator                          | 10894846 | 100,0  |
| StringBuilder                         | 10844971 | 99,5   |
| String.concat                         | 3359191  | 30,8   |
| SLF4J MessageFormat                   | 2428274  | 22,3   |
| String.format                         | 612309   | 5,6    |