# Cracking the Coding Interview
## Interview Questions
I will be devising my own solutions/algorithms to various questions in the "Cracking the Coding Interview" book by Gayle Laakmann McDowell. Yes, there is a solutions page however, my approach will be to code from scratch avoiding the solutions until many hours have passed (or I become frustrated enough :stuck_out_tongue_winking_eye:)

I feel creating the repository and pushing my progress to the remote repo aids in staying consistent, is doing many algorithmic-type leetcode style problems can be very draining for some and the progress can halt fast if there isn't enough stimulation. Thanks for checking out this repository!

There project structure is in Maven format, so all the source code can be found in src/main/java directory.

# Arrays and Strings
### isUnique
**Task:** Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?

time complexity: O(N)

space complexity: O(1)

#### HashTable implementation
In this implementation, I utilize a Hash table datastructure to act as a "memory" system to recall if the string has a character that has been seen before, resulting in the string not being unique. We iterature through the string, and store each character into a hash table at every iteration (except the first, because they can be no stored characters before the 1st iteration). At every iteration, we then call the **containsKey()**  method on the hash table, to see if the hash table contains the current character we are currently iterating over.

https://github.com/alpizano/cracking-the-coding-interview/blob/master/UniqueString/src/main/java/me/alpizano/HashTableImplementation.java


#### BitVector implementation
Likewise, a bit vector can be implemented to reduce space usage by a factor of 8. The assumption that only the 26 characters of a -z (lowercase) will be used.

https://github.com/alpizano/cracking-the-coding-interview/blob/master/ArraysAndStrings/IsUnique/src/main/java/me/alpizano/BitVectorImplementation.java


### CheckPermutation
**Task:** Given two strings, write a method to decide if one is a permutation of the other.

time complexity: 

space complexity: 

#### Using the java standard library Collection and List Interface
In this implementation, I utilize the Collections framework in Java and utilize the List interface, instantiated on the concrete ArrayList list class, that allows for dyamic resizing. Because we are checking permutations, that is order matters, we can can first check if both strings are the same length. If not, we can instantly return false as we know these strings cannot be permutations because they have a different set length of characters. Else, we can continue to iterate through each string and add each character to a List.

We can then easily **sort** both lists using the Collections class and call the **equals** method to determine if they are permutations!

https://github.com/alpizano/cracking-the-coding-interview/blob/master/ArraysAndStrings/CheckPermutation/src/main/java/com/alpizano/SortingComparisonImplementation.java

# Linked Lists
### Return Kth to Last
time complexity: 

space complexity: 

https://github.com/alpizano/cracking-the-coding-interview/tree/master/LinkedLists/KthToLast/src/main/java


### Remove Dups
time complexity: 

space complexity: 
https://github.com/alpizano/cracking-the-coding-interview/tree/master/LinkedLists/RemoveDups/src/main/java


# Trees And Graphs
### Route Between Nodes
**Task:** Given a directed graph, design an algorithm to find out whether there is a router betwee two nodes.

time complexity: 

space complexity: 
#### Depth-First Search implementation

https://github.com/alpizano/cracking-the-coding-interview/tree/master/TreesAndGraphs/RouteBetweenNodes/src/main/java
