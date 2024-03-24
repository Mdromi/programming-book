/*====================
CP: 03 JavaScript ES6
11. Map
CMD: [ node 11.map.js ]
EX: new Map();
===================*/

const romi = new Map();

romi.set(`fullName`, 'Md Romi')
console.log(romi.get(`fullName`));
console.log(romi.has(`fullName`));

romi.set(`toRemoved`, 'willRemoved')
romi.delete(`toRemoved`) // .clear .size
console.log(romi.has(`toRemoved`));

for(let [key, value] of romi.entries()) {
    console.log(`Key is: ${key} and the value is: ${value}`);
}