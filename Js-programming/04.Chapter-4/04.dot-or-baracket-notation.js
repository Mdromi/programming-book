const obj = {
    Bangladesh: `Dhaka`,
    India: `Delhi`,
    Nepal: `Kathmandu`,
    Afganistan: `Kabul`,
    Thiland: `Bangkok`
}

// dot notation
console.log(obj.Bangladesh);

// brakets notation
Object.keys(obj).map(country => console.log(`Capital of ${country} is: ${obj[country]}`))