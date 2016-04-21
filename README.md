# Obras [![Build Status](https://travis-ci.org/transparenciasjc/obras.svg?branch=master)](https://travis-ci.org/transparenciasjc/obras)

[![Join the chat at https://gitter.im/transparenciasjc/obras](https://badges.gitter.im/transparenciasjc/obras.svg)](https://gitter.im/transparenciasjc/obras?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

Programa para exibir o status das obras realizadas nos municípios de São Paulo. Utilizando dados do TCE (http://transparencia.tce.sp.gov.br/obras-publicas)

**In This Documentation**

1. [Getting Started](#getting-started)
2. [Gulp Tasks](#gulp-tasks)
3. [File Structure](#file-structure)
4. [License](#license)

## Getting Started

### Dependencies
Make sure these are installed first.

* [Node.js](http://nodejs.org)
* [npm](https://www.npmjs.com/)

### Quick Start

1. In bash/terminal/command line, `cd` into your project directory and then `cd` into `obras-ui` .
2. Run `npm install -g yo bower grunt-cli gulp && npm install && bower install` to install required dependencies.
3. When it's done installing, run one of the task runners to get going:

## Gulp tasks

* `gulp` or `gulp build` to build an optimized version of your application in `/dist`
* `gulp serve` to launch a browser sync server on your source files
* `gulp serve:dist` to launch a server on your optimized application
* `gulp test` to launch your unit tests with Karma
* `gulp test:auto` to launch your unit tests with Karma in watch mode
* `gulp protractor` to launch your e2e tests with Protractor
* `gulp protractor:dist` to launch your e2e tests with Protractor on the dist files


### Frameworks used on this project:

AngularJS: HTML enhanced for web apps!
https://angularjs.org/

Jasmine: Behavior-Driven JavaScript.
http://jasmine.github.io/

BrowserSync: Time-saving synchronised browser testing.
http://browsersync.io/

GulpJS: The streaming build system.
http://gulpjs.com/

Protractor: End to end test framework for AngularJS applications built on top of WebDriverJS.
https://github.com/angular/protractor

Karma: Spectacular Test Runner for JavaScript.
http://karma-runner.github.io/


## File Structure

[Best Practice Recommendations for Angular App Structure](https://docs.google.com/document/d/1XXMvReO8-Awi1EZXAXS4PzDzdNvV6pGcuaF4Q9821Es/pub)

<pre>
├── bower_components/
├── bower.json
├── .bowerrc
├── .editorconfig
├── .eslintrc
├── .gitignore
├── .yo-rc.json
├── e2e/
├── gulp/
├── gulpfile.js
├── karma.conf.js
├── node_modules/
├── package.json
├── protractor.conf.js
└── src/
    ├── app/
    │   ├── components/
    │   │   ├── githubContributor/
    │   │   │   ├── githubContributor.service.js
    │   │   │   └── githubContributor.service.spec.js
    │   │   ├── malarkey/
    │   │   │   ├── malarkey.css
    │   │   │   ├── malarkey.directive.js
    │   │   │   └── malarkey.directive.spec.js
    │   │   ├── navbar/
    │   │   │   ├── navbar.css
    │   │   │   ├── navbar.directive.js
    │   │   │   ├── navbar.directive.spec.js
    │   │   │   └── navbar.html
    │   │   └── webDevTec/
    │   │       ├── webDevTec.service.js
    │   │       └── webDevTec.service.spec.js
    │   ├── index.config.js
    │   ├── index.css
    │   ├── index.module.js
    │   ├── index.route.js
    │   ├── index.run.js
    │   └── main/
    │       ├── main.controller.js
    │       ├── main.controller.spec.js
    │       └── main.html
    ├── assets/
    │   └── images/
    ├── favicon.ico
    └── index.html
</pre>

## License

Obras is licensed under the [MIT License](http://gomakethings.com/mit/).
