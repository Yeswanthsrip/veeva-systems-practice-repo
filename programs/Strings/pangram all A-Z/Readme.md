Given a string sentence containing English letters (lower- or upper-case), return true if sentence is a Pangram, or false otherwise.

A Pangram is a sentence where every letter of the English alphabet appears at least once.

Note: The given sentence might contain other characters like digits or spaces, your solution should handle these too.

Example 1:
Input: sentence = "TheQuickBrownFoxJumpsOverTheLazyDog"
Output: true
Explanation: The sentence contains at least one occurrence of every letter of the English alphabet either in lower or upper case.
Example 2:

Input: sentence = "This is not a pangram"
Output: false
Explanation: The sentence doesn't contain at least one occurrence of every letter of the English alphabet.
Constraints:

1 <= sentence.length <= 1000
sentence consists of printable ASCII characters, which may include letters, digits and spaces.