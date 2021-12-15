$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("createAccount.feature");
formatter.feature({
  "line": 1,
  "name": "Create an Account",
  "description": "As a user i want to create an account.",
  "id": "create-an-account",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12362544600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User Should Create Account Successfully",
  "description": "",
  "id": "create-an-account;user-should-create-account-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on Sign In Button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I enter email",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Create an Account Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I enter FirstName \"Robin\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "I enter LastName \"Singh\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I enter Password \"Robin1234\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter Address line \"1 Nice Building\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter City \"Maryland\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I select state  \"Ohio\"",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter zipcode \"12345\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter Country \"United States\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I enter Mobile number \"01234567893\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I enter Address Alias \"main home\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on Register button",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "Verify message \"My account\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestPage.iAmOnHomePage()"
});
formatter.result({
  "duration": 121978600,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestPage.iClickOnSignInButton()"
});
formatter.result({
  "duration": 11042823600,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.iEnterEmail()"
});
formatter.result({
  "duration": 138970000,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.iClickOnCreateAnAccountButton()"
});
formatter.result({
  "duration": 82129300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Robin",
      "offset": 19
    }
  ],
  "location": "CreateAccount.iEnterFirstName(String)"
});
formatter.result({
  "duration": 5711351800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Singh",
      "offset": 18
    }
  ],
  "location": "CreateAccount.iEnterLastName(String)"
});
formatter.result({
  "duration": 109989000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Robin1234",
      "offset": 18
    }
  ],
  "location": "CreateAccount.iEnterPassword(String)"
});
formatter.result({
  "duration": 117331600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 Nice Building",
      "offset": 22
    }
  ],
  "location": "CreateAccount.iEnterAddressLine(String)"
});
formatter.result({
  "duration": 141005100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Maryland",
      "offset": 14
    }
  ],
  "location": "CreateAccount.iEnterCity(String)"
});
formatter.result({
  "duration": 153380800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ohio",
      "offset": 17
    }
  ],
  "location": "CreateAccount.iSelectState(String)"
});
formatter.result({
  "duration": 106630600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "12345",
      "offset": 17
    }
  ],
  "location": "CreateAccount.iEnterZipcode(String)"
});
formatter.result({
  "duration": 104833100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "United States",
      "offset": 17
    }
  ],
  "location": "CreateAccount.iEnterCountry(String)"
});
formatter.result({
  "duration": 72734400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01234567893",
      "offset": 23
    }
  ],
  "location": "CreateAccount.iEnterMobileNumber(String)"
});
formatter.result({
  "duration": 101662200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "main home",
      "offset": 23
    }
  ],
  "location": "CreateAccount.iEnterAddressAlias(String)"
});
formatter.result({
  "duration": 100089900,
  "status": "passed"
});
formatter.match({
  "location": "CreateAccount.iClickOnRegisterButton()"
});
formatter.result({
  "duration": 9481378600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "My account",
      "offset": 16
    }
  ],
  "location": "CreateAccount.verifyMessage(String)"
});
formatter.result({
  "duration": 40247900,
  "status": "passed"
});
formatter.after({
  "duration": 654889600,
  "status": "passed"
});
formatter.uri("signIn.feature");
formatter.feature({
  "line": 1,
  "name": "Sign In on Login Page",
  "description": "As a user I want to login in to automationpractice.com Website",
  "id": "sign-in-on-login-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9203403300,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User Should navigate to login page successfully",
  "description": "",
  "id": "sign-in-on-login-page;user-should-navigate-to-login-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    },
    {
      "line": 3,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I am on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I Click on Sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I verify that \"AUTHENTICATION\" message is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestPage.iAmOnHomePage()"
});
formatter.result({
  "duration": 59500,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestPage.iClickOnSignInLink()"
});
formatter.result({
  "duration": 8411191800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "AUTHENTICATION",
      "offset": 15
    }
  ],
  "location": "LoginTestPage.iVerifyThatMessageIsDisplayed(String)"
});
formatter.result({
  "duration": 42567400,
  "status": "passed"
});
formatter.after({
  "duration": 648170200,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 9,
  "name": "User should get Error Message with Invalid Credentials",
  "description": "",
  "id": "sign-in-on-login-page;user-should-get-error-message-with-invalid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Regression"
    },
    {
      "line": 8,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I Click on Sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I enter email \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on Sign In Button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see error message \"\u003cmessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 16,
  "name": "",
  "description": "",
  "id": "sign-in-on-login-page;user-should-get-error-message-with-invalid-credentials;",
  "rows": [
    {
      "cells": [
        "email",
        "password",
        "message"
      ],
      "line": 17,
      "id": "sign-in-on-login-page;user-should-get-error-message-with-invalid-credentials;;1"
    },
    {
      "cells": [
        "",
        "123456",
        "An email address required."
      ],
      "line": 18,
      "id": "sign-in-on-login-page;user-should-get-error-message-with-invalid-credentials;;2"
    },
    {
      "cells": [
        "abcd@gmail.com",
        "",
        "Password is required."
      ],
      "line": 19,
      "id": "sign-in-on-login-page;user-should-get-error-message-with-invalid-credentials;;3"
    },
    {
      "cells": [
        "adfdfgfg",
        "123456",
        "Invalid email address."
      ],
      "line": 20,
      "id": "sign-in-on-login-page;user-should-get-error-message-with-invalid-credentials;;4"
    },
    {
      "cells": [
        "abcd@gmail.com",
        "123456",
        "Authentication failed."
      ],
      "line": 21,
      "id": "sign-in-on-login-page;user-should-get-error-message-with-invalid-credentials;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 9754996100,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User should get Error Message with Invalid Credentials",
  "description": "",
  "id": "sign-in-on-login-page;user-should-get-error-message-with-invalid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@Smoke"
    },
    {
      "line": 8,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "I am on HomePage",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I Click on Sign in link",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "I enter email \"\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter password \"123456\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on Sign In Button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I should see error message \"An email address required.\"",
  "matchedColumns": [
    2
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestPage.iAmOnHomePage()"
});
formatter.result({
  "duration": 66800,
  "status": "passed"
});
formatter.match({
  "location": "LoginTestPage.iClickOnSignInLink()"
});
formatter.result({
  "duration": 7822315100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 15
    }
  ],
  "location": "LoginTestPage.iEnterEmail(String)"
});
formatter.result({
  "duration": 4149646200,
  "error_message": "org.openqa.selenium.WebDriverException: chrome not reachable\n  (Session info: chrome\u003d96.0.4664.93)\nBuild info: version: \u00274.0.0\u0027, revision: \u00273a21814679\u0027\nSystem info: host: \u0027DESKTOP-KDKBGFP\u0027, ip: \u0027172.29.224.1\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_121\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [8d24307a0aa49ee9b617cf259fcca19f, findElement {using\u003did, value\u003demail}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 96.0.4664.93, chrome: {chromedriverVersion: 96.0.4664.45 (76e4c1bb2ab46..., userDataDir: C:\\Users\\Vrajesh\\AppData\\Lo...}, goog:chromeOptions: {debuggerAddress: localhost:55807}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:55807/devtoo..., se:cdpVersion: 96.0.4664.93, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 8d24307a0aa49ee9b617cf259fcca19f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:139)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:559)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:66)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:383)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:375)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat com.sun.proxy.$Proxy23.sendKeys(Unknown Source)\r\n\tat com.automation.utility.Utility.sendTextToElement(Utility.java:48)\r\n\tat com.automation.pages.SignInPage.enterUsername(SignInPage.java:48)\r\n\tat com.automation.cucumber.steps.LoginTestPage.iEnterEmail(LoginTestPage.java:31)\r\n\tat ✽.And I enter email \"\"(signIn.feature:12)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "123456",
      "offset": 18
    }
  ],
  "location": "LoginTestPage.iEnterPassword(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginTestPage.iClickOnSignInButton()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "An email address required.",
      "offset": 28
    }
  ],
  "location": "LoginTestPage.iShouldSeeErrorMessage(String)"
});
formatter.result({
  "status": "skipped"
});
