# Cracking the Coding Interview
## Interview Questions
I will be devising my own solutions/algorithms to various questions in the "Cracking the Coding Interview" book by Gayle Laakman. Yes, there is a solutions page however, my approach will be to code from scratch avoiding the solutions until many hours have passed (or I become frustrated enough :stuck_out_tongue_winking_eye:)

I feel creating the repository and pushing my progress to the remote repo aids in staying consistent, is doing many algorithmic-type leetcode style problems can be very draining for some and the progress can halt fast if there isn't enough stimulation. Thanks for checking out this repository!

There project structure is in Maven format, so all the source code can be found in src/main/java directory.

# Arrays and Strings
## isUnique
**Task:** Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures?
time complexity:
space compleity: O(1)
#### HashTable implementation
In this implementation, I utilize a Hash table datastructure to act as a "memory" system to recall if the string has a character that has been seen before, resulting in the string not being unique. We iterature through the string, and store each character into a hash table at every iteration (except the first, because they can be no stored characters before the 1st iteration). At every iteration, we then call the **containsKey()**  method on the hash table, to see if the hash table contains the current character we are currently iterating over.
https://github.com/alpizano/cracking-the-coding-interview/blob/master/UniqueString/src/main/java/me/alpizano/HashTableImplementation.java

#### BitVector implementation
