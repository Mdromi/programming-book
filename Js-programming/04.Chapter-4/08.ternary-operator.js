function successFunc() {
    console.log(`Gor your email`);
}

let email;

email ? successFunc() : console.log(`Please provide your email`);