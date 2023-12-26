class Queue {
    constructor() {
        this.element = {}
        this.head = 0
        this.tail = 0
    }

    enqueue(element) {
        this.element[this.tail] = element
        this.tail++
    }

    dequeue() {
        const item = this.elements[this.head]
        delete this.element[this.head]
        this.head++
        return item
    }

    peek() {
        return this.element[this.head]
    }

    getLength() {
        return this.tail - this.head
    }

    get isEmpty() {
        return this.length === 0
    }
}

    let q = new Queue()
    for (let i = 1; i <= 7; i++) {
        q.enqueue(i)
    }
    console.log(q.peek())

    console.log(q.getLength())

    while (!q.isEmpty) {
        console.log(q.dequeue)
    }
