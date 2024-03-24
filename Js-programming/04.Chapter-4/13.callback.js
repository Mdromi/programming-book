const getVar = callback => {
    setTimeout(() => {
        console.log(`A function that takes some times`);
        callback()
    }, 3000);
}

const printSomething = () => {
    console.log(`Another function`);
}
getVar(printSomething)