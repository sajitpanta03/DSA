function simpleHash(str, max) {
    // Initialize the hash variable to 0
    let hash = 0;

    // Loop through each character in the input string
    for (let i = 0; i < str.length; i++) {
        // Left shift the current hash value by 5 bits and add the ASCII code of the current character
        hash = (hash << 5) + str.charCodeAt(i);

        // Perform a bitwise AND operation with the hash itself
        hash = hash & hash;

        // Ensure the hash is a non-negative value
        hash = Math.abs(hash);

        // Reduce the hash value to fit within the specified maximum size
        hash = hash % max;
    }

    // Return the final hashed value
    return hash;
}

// Example usage:
const inputString = "example";
const hashTableSize = 10;

// Call the simpleHash function with the input string and hash table size
const hashedValue = simpleHash(inputString, hashTableSize);

// Output the result
console.log(`Hash value for "${inputString}" : ${hashedValue}`);
