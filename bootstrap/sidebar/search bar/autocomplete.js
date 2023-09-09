const people = [
    { name: 'adri'},
    { name: 'becky'},
    { name: 'chris'},
    { name: 'dillon'},
    { name: 'evan'},
    { name: 'frank'},
    { name: 'georgette'},
    { name: 'hugh'},
    { name: 'igor'},
    { name: 'jacoby'},
    { name: 'kristina'},
    { name: 'lemony'},
    { name: 'matilda'},
    { name: 'nile'},
    { name: 'ophelia'},
    { name: 'patrick'},
    { name: 'quincy'},
    { name: 'roslyn'},
    { name: 'solene'},
    { name: 'timothy'},
    { name: 'uff'},
    { name: 'violet'},
    { name: 'wyatt'},
    { name: 'x'},
    { name: 'yadri'},
    { name: 'zack'},
]



whateverElement.addEventListener("event type", () => {

}


searchInput.addEventListener("input", (e) => {
    // inside, we will need to achieve a few things:
    // 1. declare and assign the value of the event's target to a variable AKA whatever is typed in the search bar
    let value = e.target.value

    // 2. check: if input exists and if input is larger than 0
    if (value && value.trim().length > 0){
        // 3. redefine 'value' to exclude white space and change input to all lowercase
         value = value.trim().toLowerCase()
        // 4. return the results only if the value of the search is included in the person's name
        // we need to write code (a function for filtering through our data to include the search input value)
    } else {
        // 5. return nothing
        // input is invalid -- show an error message or show no results

    }

};


const clearButton = document.getElementById('clear')

clearButton.addEventListener("click", () => {
    // 1. write a function that removes any previous results from the page
})

