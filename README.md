# DeleteMiddleNode
Exercise related with Linked Lists.

## Exercise Challenge
Implement an algorithm to delete a node in the middle (i.e., any node but the first and last node, not necessarily the exact middle) of a singly linked list, given only access to that node.

### Solution
I simply copy the data of the next node, and the pointer of the next node to the node I received as a parameter. In that way, I copied the next node and delete it, it's pretty straight forward. 
This algorithm runs in O(1) space and time.