import core from "@actions/core";

// starts the execution (name of the function to run)
run()

/**
 * Define logic inside the function, to get some encapsulation.
 */
function run() {
    notice('### Running MAIN logic');
    printActionDescription();
    printSomeInputVariables();
    const guessedNumber = getGuessNumberResult();
    setActionOutputValue('guessed-number', guessedNumber);

    /**
     * Prints detailed explanation what is that action about.
     */
    function printActionDescription() {
        const actionDescription = [
            '',
            '',
            '------------------------------------------------',
            '------------   ACTION DESCRIPTION   ------------',
            '------------------------------------------------',
            '---',
            'This is a sample JavaScript action',
            'The action is performed by calling .js files defined in action.yml file',
            'Technically 3 JS files can be defined: pre (before logic), main (logic), and post (after logic) ',
            '  but when I was writing this, the pre script was not supported by Github Actions (as they wrote it)',
            '---',
            'This action shows how to take and print input files and notes to Github Actions console',
            'Also it has a simple logic of \'guessing a number\' - just checking if number equals specific value',
            'The action returns the result of \'guessing\' as the action result for the step which uses it',
            "---"
        ].join('\n');
        core.notice(actionDescription);
    }

    /**
     * Simply printing what we got as action inputs
     */
    function printSomeInputVariables() {
        const var1 = getActionInput('var1')
        const var2 = getActionInput('var2')
        notice(`var1 = ${var1}`)
        notice(`var2 = ${var2}`)
    }

    /**
     * Get input number and check if it's what we need using usual JS logic
     */
    function getGuessNumberResult() {
        const number = getActionInput('number');
        const guessed = number.toString() === "10";
        notice(`number = ${number}`)
        notice(`guessed = ${guessed}`)
        return guessed;
    }

    /**
     * Get action input value
     *
     * @param inputKey Input key defined in the action.yml file.
     */
    function getActionInput(inputKey) {
        return core.getInput(inputKey, {required: true});
    }

    /**
     * Set action output value
     *
     * @param outputKey - will be used to get the result in the caller action.
     * @param outputValue - THe value to set.
     */
    function setActionOutputValue(outputKey, outputValue) {
        core.setOutput(outputKey, outputValue);
    }

    /**
     * Prints a notice message which is shown in GitHub Actions console (instead of console.log).
     *
     * @param message Message to print.
     */
    function notice(message) {
        core.notice(message);
    }
}