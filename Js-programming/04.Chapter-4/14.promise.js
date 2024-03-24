const aPromise = control => {
    return new Promise((resolve, reject) => {
        setTimeout(() => {
            if (control) {
                resolve(`Simple success data`)
            } else {
                reject(`Simple error data`)
            }
        }, 3000);
    }) 
}

aPromise(true)
    .then(data => {
        console.log(data);
    })
    .catch(err => {
        console.log(err);
    })