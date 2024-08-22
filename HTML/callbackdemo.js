function doHomework(subject,callback){
    // console.log("Finished my "+subject+" homework")
// using back ticks for dynamic values-- called template literals
    console.log(`Doing my ${subject} homework`)
    callback();
}

function alertFinished(){
    console.log("Homework Finished")
}
doHomework("Science",alertFinished)