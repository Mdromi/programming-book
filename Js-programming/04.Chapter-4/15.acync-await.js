const getMyName = new Promise(resolve => {
    return resolve(`Md Romi`)
});

const getAge = name => {
    return new Promise((resolve, reject) => {
        if(name === `Md Romi`) resolve(19)
        else reject(`Not Found`)
    })
}

const getMyDetails = async() => {
    const name = await getMyName
    const age = await getAge(name)
    console.log(`My name is ${name} and I am ${age} years old`);
}
getMyDetails()` ` 