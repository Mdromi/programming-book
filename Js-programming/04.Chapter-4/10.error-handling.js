const ageNew = 17;
try {
    if(ageNew < 18) throw new Error(`you are to young`)
    else console.log(`you are adult`);
} catch (e) {
    console.log(e);
} finally {
    console.log(`I will run always`);
}