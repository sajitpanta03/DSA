function simpleHash(str, max) {
    let hash = 0;

    for (let i = 0; i < str.length; i++) {
        hash = (hash << 5) + str.charCodeAt(i);

        hash = hash & hash;

        hash = Math.abs(hash);

        hash = hash % max;
    }

    return hash;
}

const inputString = "example";
const hashTableSize = 10;

const hashedValue = simpleHash(inputString, hashTableSize);

console.log(`Hash value for "${inputString}" : ${hashedValue}`);
