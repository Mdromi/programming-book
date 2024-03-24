// Declare Regular Expression
const regex = /ab+c/i;
const regexCons = new RegExp(`ab+c`, 'i');
// console.log(regexCons); // /ab+c/i

// replace text
const regexToMatch = /Mydesh/;
const aText = `I am from Mydesh`
const newText = aText.replace(regexToMatch, `Bangladesh`)
// console.log(newText); // I am from Bangladesh

// console.log(aText.match(regexToMatch));

// Brackets
const bTExt = `A Normal Text`
// console.log(bTExt.match(/[aox]/));
// console.log(bTExt.match(/[^aox]/));
// console.log(bTExt.match(/[a-z]/g));

// Metacharacters
const mText = `ABCDEFGHIJK abcdefghijk\n\t012345678900!@#$%^&()`
// console.log(mText.match(/./g));

// Quantifiers
// console.log(mText.match(/jk*/ig));

const regexp = (/ab/g);
let match
while (match = regexp.exec(`abcdebf`)) {
    console.log(match);
}