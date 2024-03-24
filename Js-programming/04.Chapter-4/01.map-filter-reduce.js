const arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]

// map()
console.log(`MAP():`);
const newArr = arr.map(item =>  item * item)
arr.map((item, index, fullArr) => {
    console.log(`Item: ${item}, and Index: ${index}, FullArr: ${fullArr}`);
});
console.log(`Square: ${newArr}`);

// filter()
console.log(`FILTER():`);
const filterNewArr = arr.filter(item =>  item % 2 === 0)
arr.filter((item, index, fullArr) => {
    console.log(`Item: ${item}, and Index: ${index}, FullArr: ${fullArr}`);
});

console.log(`Filter: ${filterNewArr}`);

// reduce()
console.log(`REDUCE():`);
let totalEs6 = arr.reduce((sum, item) => sum += item, 0)
let total = arr.reduce((sum, item, index, fullArr) => {
    console.log(`Item: ${item}, and Index: ${index}, FullArr: ${fullArr}`);
    return sum += item
}, 0);
console.log(total, totalEs6);

// this value determine
const anObj = {
    name: 'Md Romi',
    age: 19,
}
arr.map(function(item, index, fullArr) {
    console.log(this);
}, anObj)
