const obj = {
    Bangladesh: `Dhaka`,
    India: `Delhi`,
    Nepal: `Kathmandu`,
    Afganistan: `Kabul`,
    Thiland: `Bangkok`
}
for (name in obj) {
    console.log(obj[name]);
}

Object.keys(obj).map(country => console.log(`Capital of ${country} is: ${obj[country]}`))