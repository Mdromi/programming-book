const anArrSome = [`hello`, 1, 2, 3, `Bangla`, 5, `world`, 7, 8, 9]


// some()
let result = anArrSome.some(item => item === 1)
console.log(`Some(): ${result}`);

anArrSome.some((item, index, fullArr) => {
    console.log(`Item: ${item}, and Index: ${index}, FullArr: ${fullArr}`);
    return item === 1
});

const obj = [
    {
        name: `Md Romi`,
        age: 1,
        job: `Child`
    },
    {
        name: `Md Romi`,
        age: 18,
        job: `Student`
    },
    {
        name: `Md Romi`,
        age: 21,
        job: `Business Man`
    }
];

result = obj.some(anObj => anObj.age == 1)
console.log(`Some(): ${result}`); // return true

// Every()
const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
result = arr.every(item => typeof item === 'number')
console.log(`Every(): ${result}`);

result = obj.every(anObj => anObj.job);
console.log(`Every(): ${result}`);