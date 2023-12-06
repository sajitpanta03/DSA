class Node {
  constructor(item) {
    this.item = item;
    this.next = null;
  }
}

class LinkedList {
  constructor() {
    this.head = null;
  }
}

// Main program
const linkedList = new LinkedList();

// Assign item values
linkedList.head = new Node(1);
const second = new Node(2);
const third = new Node(3);

// Connect nodes
linkedList.head.next = second;
second.next = third;

// Print the linked list items
let current = linkedList.head;
while (current !== null) {
  console.log(current.item, end=" ");
  current = current.next;
}
