hashTable = [[],] * 6

def checkPrime(n):
    if n == 1 or n == 0:
        return 0
    
    for i in range(2, n//2):
        if n % i == 0:
            return 0
        
    return 1

def getPrime(n):
    if n % 2 == 0:
        n = n + 1

    while not checkPrime(n):
        n += 2

    return n

def hashFunction(key):
    capacity = getPrime(10)
    return key % capacity

def insertData(key, data):
    index = hashFunction(key)
    hashTable[index] = [key, data]

def removeData(key):
    index = hashFunction(key)
    hashTable[index] = 0

insertData(0, "happiness")
insertData(1, "house")
insertData(2, "car")
insertData(3, "watch")
insertData(4, "High End PC")
insertData(5, "no money")

print(hashTable)

removeData(5)

print(hashTable)