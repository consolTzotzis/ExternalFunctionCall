// commonUtils.groovy

def calledFunction1(input) {
    return " Processed by calledFunction1: ${input}"
}

// Define and return the function inside a map
return [
    calledFunction1: { input -> " Processed by calledFunction1: ${input}" }
]
