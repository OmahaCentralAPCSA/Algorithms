# Algorithms

From Litvin & Litvin *Java Methods* an algorithm is: A more or less compact, general, and abstract step-by-step recipe that describes how to perform a certain task or solve a certain problem.  

You likely learned the algorithms for adding, subtracting, multiplying and dividing numbers in elementary school.  

## :pencil2: Describing Algorithms
Pseudocode and Flowcharts are two commonly used methods to describe an algorithm.  

- Pseudocode is a sequence of statements, but unlike a programming language, there is no formal syntax.
- Flowcharts can graphically represent the control flow

## :name_badge: Properties of Algorithms
- Compactness: an algorithm can use iterations or recursion to repeat the same steps multiple times.  
- Generality: the same algorithm applies to any 'size' of task or any input value  
- Abstractness: an algorithm does not depend on a particular computer language or platform.   


## :page_facing_up: Example:
Calculate `1^2 + 2^2 + ... + n^2` 

Pseudocode: 

```
input: n

sum = 0
k = 1
Repeat the following three steps while k <= n:
  sq = k * k
  sum = sum + sq
  k = k + 1

output: sum 

```
The above example is :one: General. :two: Compact, since it is the same length regardless of the value of n. :three: Abstract since it is not language specific.  That is our task, we have to convert this into whatever language we choose.  In our case: :coffee: 

---

## Euclid's Algorithm
- An algorithm to find the greatest common factor (gcf) between two positive integers.   

[Khan Academy explanation of Euclid's Algorithm](https://www.khanacademy.org/computing/computer-science/cryptography/modarithmetic/a/the-euclidean-algorithm)

In pseudo-code:   
If A = 0 then GCD(A,B)=B, since the GCD(0,B)=B, and we can stop.  
If B = 0 then GCD(A,B)=A, since the GCD(A,0)=A, and we can stop.  
Write A in quotient remainder form (A = B⋅Q + R)
Find GCD(B,R) using the Euclidean Algorithm since GCD(A,B) = GCD(B,R)

### A worked out example also helps understand the algorithm too:

```
Find the GCD of 270 and 192  
A=270, B=192  
A ≠0  
B ≠0  
Use long division to find that 270/192 = 1 with a remainder of 78. We can write this as: 270 = 192 * 1 +78

Find GCD(192,78), since GCD(270,192)=GCD(192,78)  
A=192, B=78  
A ≠0  
B ≠0  
Use long division to find that 192/78 = 2 with a remainder of 36. We can write this as:  
192 = 78 * 2 + 36    

Find GCD(78,36), since GCD(192,78)=GCD(78,36)  
A=78, B=36  
A ≠0  
B ≠0 
Use long division to find that 78/36 = 2 with a remainder of 6. We can write this as:  
78 = 36 * 2 + 6  

Find GCD(36,6), since GCD(78,36)=GCD(36,6)  
A=36, B=6  
A ≠0  
B ≠0  
Use long division to find that 36/6 = 6 with a remainder of 0. We can write this as:  
36 = 6 * 6 + 0   

Find GCD(6,0), since GCD(36,6)=GCD(6,0)  
A=6, B=0  
A ≠0  
B =0, GCD(6,0)=6    

So we have shown:  
GCD(270,192) = GCD(192,78) = GCD(78,36) = GCD(36,6) = GCD(6,0) = 6  
GCD(270,192) = 6  

```

## :100: Perfect Numbers
A perfect number is a positive integer equal to the sum of all its divisors (including 1 but excluding itself).  

Examples:  
6 = 1 + 2 + 3  
28 = 1 + 2 + 4 + 7 + 14  
...

:pushpin: Write a program that calculates the first 4 perfect numbers (which includes 6 and 28)  


## Mersenne Primes
A Mersenne Prime is a prime number that is in the form of `2^n - 1`.  

So:  
2 = 2^1 - 1  
3 = 2^2 - 1  
7 = 2^3 - 1  
31 = 2^4 - 1  
... 

Leonhard Euler proved that any EVEN perfect number must have that form (2^(n-1))(2^n - 1)  

2^3 - 1 = 7 (which is prime)  
2^2(2^3 - 1) = 28 (which is a perfect number)  

:pushpin: Write a program that finds the first 6 Mersenne Primes and then calculates their corresponding perfect numbers.  



