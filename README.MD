# Learning smth

This project is about learning technologies I cannot / don't have time to use at work. There is no any other super
mission.

<!-- TOC -->
* [What I use and study here](#what-i-use-and-study-here)
    * [Spring Framework](#spring-framework)
      * [Learning](#learning)
    * [Gradle](#gradle)
      * [Using](#using)
    * [GitHub Actions](#github-actions)
      * [Learning](#learning-1)
      * [Examples](#examples)
    * [OAUTH 2.0](#oauth-20)
      * [Learning](#learning-2)
<!-- TOC -->

# What I use and study here

### Spring Framework

#### Learning

- Spring for beginners [certificate](https://www.udemy.com/certificate/UC-d33a0011-e7dc-4d0b-a55e-1956d3dec908/)
    - Finished: 18 March 2  023
    - Spring a must-know tool to increase ones chances on the market
    - I couldn't use it on my job, so started with something

### Gradle

#### Using

- Just decided to use it instead of Maven
- I had a big job experience with Maven, but nothing with Gradle
- Didn't meet any problems on basic usage - mostly it's just another syntax

### GitHub Actions

#### Learning

- GitHub Actions - The Complete
  Guide [certificate](https://www.udemy.com/certificate/UC-852683ac-bea0-4019-a120-264cbbda7bed/)
    - Finished: 23 July 2023
    - On my job, we moved to GitHub. I thought - now we can implement some CI/CD. Just need to learn about that.

#### Examples

- Common triggers ('on'): [link](.github/workflows/demo-triggers.yml)
- Repository / environment variables and secrets [link](.github/workflows/demo-env-variables-secrets.yml)
- Using artifacts, outputs and cache: [link](.github/workflows/demo-artifacts-outputs-cache.yml)
- Conditions to run job / step and behaviour on failure: [link](.github/workflows/demo-conditions-errors.yml)
- Matrix - perform several times with different parameter combinations: [link](.github/workflows/demo-matrix.yml)
- Reusable workflow:
    - Example: [link](.github/workflows/demo-reusable-workflow-define.yml)
    - Example usage: [link](.github/workflows/demo-reusable-workflow-use.yml)
- Custom actions:
    - Composite: [link](.github/actions/example-composite-action/action.yml)
    - JavaScript: [link](.github/actions/example-js-action)
    - Docker (Java): [link](.github/actions/example-docker-action)
    - Using the actions: [link](.github/workflows/demo-custom-actions-use.yml)
- Security vulnerabilities:
    - Script injection vulnerabilities: [link](.github/workflows/demo-security-script-injection-threat.yml)
    - Permissions and $GITHUB_TOKEN: [link](.github/workflows/demo-security-github-token.yml)

### OAUTH 2.0

#### Learning

- The Nuts and Bolts of OAuth
  2.0 [certificate](https://www.udemy.com/certificate/UC-aaa657a0-1fca-4283-8c53-9b5886e3a3bc/)
    - Finished: 17 Jun 2023
    - On my job I faced an issue with Single Sign-On certificate expiration. Couldn't find any help, so decided
      to learn about authorization things. After the course I knew what exactly to ask, so the issue was solved.
    - This topic appeared to be very interesting, so I decided to make a pet project to play with that. When started,
      found that there are even more useful (and market valuable) technologies to study before that.
