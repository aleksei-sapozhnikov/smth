import core from "@actions/core";

function run() {
    core.notice('### Running MAIN logic');
    const var1 = core.getInput('var1')
    const var2 = core.getInput('var2');
    const number = core.getInput('number') || -1;
    const guessed = number.toString() === "10";
    core.notice(`var1 = ${var1}`)
    core.notice(`var2 = ${var2}`)
    core.notice(`number = ${number}`)
    core.notice(`guessed = ${guessed}`)
}

run()