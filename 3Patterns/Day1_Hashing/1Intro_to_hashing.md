# Pattern 01: Hashing (HashMap / HashSet)

---

# 1. Pattern Overview

## Definition

Hashing is a technique used to store and retrieve data in near constant time O(1).

Instead of repeatedly searching through data, we store previously seen information in a HashMap or HashSet and perform fast lookups.

---

## Core Idea

Trade Memory for Speed

```text
Extra Space
      ↓
Fast Lookup
      ↓
Better Time Complexity
```

---

## Engineering Mindset

Ask yourself:

```text
Am I repeatedly searching?

Can I remember previous results?

Can extra memory save time?

Have I seen this value before?
```

If YES → Think Hashing.

---

# 2. Pattern Recognition Clues

Whenever the problem contains words like:

```text
Duplicate
Frequency
Count Occurrences
Fast Lookup
Visited
Seen Before
Pair Sum
Unique Elements
Anagram
```

Hashing should immediately come to mind.

---

# 3. Data Structures Used

## HashSet

Used when:

```text
Only existence matters.
```

Examples:

```text
Does element exist?
Have we seen it before?
Contains Duplicate
```

Operations:

```java
add()
contains()
remove()
```

Average Complexity:

```text
O(1)
```

---

## HashMap

Used when:

```text
Need key-value storage.
```

Examples:

```text
Frequency Count
Two Sum
Grouping Data
Caching
```

Operations:

```java
put()
get()
containsKey()
```

Average Complexity:

```text
O(1)
```

---

# 4. Problem Example

## Leetcode 217

Contains Duplicate

### Problem

Given an integer array nums.

Return:

```java
true
```

if any value appears at least twice.

Otherwise:

```java
false
```

---

# 5. Brute Force Approach

## Thinking

Compare every element with every other element.

```java
for(i)
{
    for(j)
    {
        compare
    }
}
```

---

## Code

```java
public boolean containsDuplicate(int[] nums) {

    for(int i=0;i<nums.length;i++) {

        for(int j=i+1;j<nums.length;j++) {

            if(nums[i]==nums[j]) {
                return true;
            }
        }
    }

    return false;
}
```

---

## Time Complexity

Outer Loop:

```text
n
```

Inner Loop:

```text
n
```

Total:

```text
O(n²)
```

---

## Space Complexity

No extra memory.

```text
O(1)
```

---

# 6. Optimization Journey

## Observation

We are repeatedly asking:

```text
Have I seen this number before?
```

But every time we search again.

---

## Improvement

Store previously visited elements.

Use:

```java
HashSet
```

Now lookup becomes:

```java
contains()
```

instead of scanning entire array.

---

# 7. Optimal Approach

## Idea

Traverse array once.

If element already exists in HashSet:

```java
return true
```

Else:

```java
add into set
```

---

## Code

```java
import java.util.HashSet;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> seen = new HashSet<>();

        for(int num : nums) {

            if(seen.contains(num)) {
                return true;
            }

            seen.add(num);
        }

        return false;
    }
}
```

---

# 8. Dry Run

Input:

```java
[1,2,3,1]
```

Initial:

```text
set = {}
```

Step 1:

```text
1 not found

set = {1}
```

Step 2:

```text
2 not found

set = {1,2}
```

Step 3:

```text
3 not found

set = {1,2,3}
```

Step 4:

```text
1 already exists
```

Return:

```java
true
```

---

# 9. Complexity Analysis

## Time Complexity

Loop runs:

```text
n times
```

HashSet lookup:

```text
O(1)
```

HashSet insert:

```text
O(1)
```

Therefore:

```text
O(n)
```

---

## Space Complexity

In worst case all elements are unique.

HashSet stores:

```text
n elements
```

Therefore:

```text
O(n)
```

---

# 10. How To Calculate TC and SC

## Time Complexity Rule

Whenever you see:

```java
for(...)
```

Ask:

```text
How many times does it run?
```

Example:

```java
for(n)
```

TC:

```text
O(n)
```

---

Example:

```java
for(n)
{
    for(n)
}
```

TC:

```text
O(n²)
```

---

HashSet Operations:

```java
contains()
add()
remove()
```

Average:

```text
O(1)
```

---

Therefore:

```java
for(n)
{
    contains()
    add()
}
```

becomes:

```text
O(n × 1)

= O(n)
```

---

## Space Complexity Rule

Count extra memory.

Array given in input:

```text
Not counted
```

HashSet created:

```text
Counted
```

Stores n elements:

```text
O(n)
```

---

# 11. Interview Explanation

If Interviewer Asks:

Why HashSet?

Answer:

```text
Because the main operation is checking whether an element has already appeared.

HashSet provides average O(1) lookup time, eliminating repeated searches and reducing complexity from O(n²) to O(n).
```

---

If Interviewer Asks:

How did you optimize?

Answer:

```text
In brute force we compare every pair of elements.

I observed that we repeatedly check whether a value has appeared before.

By storing visited elements in a HashSet, we avoid repeated scanning and achieve O(n) time complexity.
```

---

If Interviewer Asks:

What tradeoff did you make?

Answer:

```text
I traded extra memory O(n) for faster execution.

Space increased from O(1) to O(n), while time improved from O(n²) to O(n).
```

---

# 12. Common Mistakes

Mistake 1

Using ArrayList instead of HashSet.

```java
list.contains()
```

is O(n).

No optimization gained.

---

Mistake 2

Forgetting duplicates already exist.

Check:

```java
contains()
```

before

```java
add()
```

---

Mistake 3

Ignoring space complexity.

Hashing is fast because it uses memory.

---

# 13. Real World Applications

Hashing is used in:

## Login Systems

```text
email -> user
```

Fast lookup.

---

## Caching

```text
key -> cached data
```

Redis

Memcached

Browser Cache

---

## Databases

```text
Indexing
```

Fast search.

---

## URL Shortener

```text
shortCode -> originalURL
```

---

## Session Management

```text
sessionId -> user
```

---

# 14. Short Revision (30 Seconds)

Hashing stores information for fast lookup.

Use HashSet when only existence matters.

Use HashMap when key-value storage is needed.

Recognition Clues:

* Duplicate
* Frequency
* Count
* Seen Before
* Fast Lookup

Optimization Idea:

```text
Remember Past Work
Instead Of Searching Again
```

Complexity:

```text
HashSet

Time: O(n)

Space: O(n)
```

Core Principle:

```text
Trade Memory For Speed
```

---

# 15. Teach Back (Explain To Someone In 1 Minute)

Hashing is a technique used to avoid repeated searching. Instead of scanning the entire array every time, we store previously seen information in a HashSet or HashMap. This allows near O(1) lookup time. In the Contains Duplicate problem, brute force compares every pair of elements and takes O(n²) time. By storing visited numbers in a HashSet, we can instantly check whether a number has appeared before, reducing the complexity to O(n). The tradeoff is extra memory usage O(n), but execution becomes much faster.
