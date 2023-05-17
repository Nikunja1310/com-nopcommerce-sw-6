$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("electronic.feature");
formatter.feature({
  "line": 1,
  "name": "Electronic Test",
  "description": "As a user I want to check electronic page",
  "id": "electronic-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6006030800,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should be navigated to CellPhone page successfully",
  "description": "",
  "id": "electronic-test;user-should-be-navigated-to-cellphone-page-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@smoke"
    },
    {
      "line": 4,
      "name": "@regression"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I mouse hover on electronics",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I select \"Cell phones\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should navigated to cellphone page using \"Cell phones\"",
  "keyword": "Then "
});
formatter.match({
  "location": "ElectronicSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 222501100,
  "status": "passed"
});
formatter.match({
  "location": "ElectronicSteps.iMouseHoverOnElectronics()"
});
formatter.result({
  "duration": 289951600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cell phones",
      "offset": 10
    }
  ],
  "location": "ElectronicSteps.iSelect(String)"
});
formatter.result({
  "duration": 1473440100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Cell phones",
      "offset": 47
    }
  ],
  "location": "ElectronicSteps.userShouldNavigatedToCellphonePageUsing(String)"
});
formatter.result({
  "duration": 74604200,
  "status": "passed"
});
formatter.after({
  "duration": 686654500,
  "status": "passed"
});
formatter.uri("topMenu.feature");
formatter.feature({
  "line": 2,
  "name": "Top Menu Test",
  "description": "As a User I want to navigate to Top menu bar",
  "id": "top-menu-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User should navigate to Top menu bar",
  "description": "",
  "id": "top-menu-test;user-should-navigate-to-top-menu-bar",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select \"\u003cmenu\u003e\" from top bar",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should successfully navigate to the menu page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should see the \"\u003cpageName\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "top-menu-test;user-should-navigate-to-top-menu-bar;",
  "rows": [
    {
      "cells": [
        "menu",
        "pageName"
      ],
      "line": 11,
      "id": "top-menu-test;user-should-navigate-to-top-menu-bar;;1"
    },
    {
      "cells": [
        "Computers",
        "Computers"
      ],
      "line": 12,
      "id": "top-menu-test;user-should-navigate-to-top-menu-bar;;2"
    },
    {
      "cells": [
        "Electronics",
        "Electronics"
      ],
      "line": 13,
      "id": "top-menu-test;user-should-navigate-to-top-menu-bar;;3"
    },
    {
      "cells": [
        "Apparel",
        "Apparel"
      ],
      "line": 14,
      "id": "top-menu-test;user-should-navigate-to-top-menu-bar;;4"
    },
    {
      "cells": [
        "Digital downloads",
        "Digital downloads"
      ],
      "line": 15,
      "id": "top-menu-test;user-should-navigate-to-top-menu-bar;;5"
    },
    {
      "cells": [
        "Books",
        "Books"
      ],
      "line": 16,
      "id": "top-menu-test;user-should-navigate-to-top-menu-bar;;6"
    },
    {
      "cells": [
        "Jewelry",
        "Jewelry"
      ],
      "line": 17,
      "id": "top-menu-test;user-should-navigate-to-top-menu-bar;;7"
    },
    {
      "cells": [
        "Gift Cards",
        "Gift Cards"
      ],
      "line": 18,
      "id": "top-menu-test;user-should-navigate-to-top-menu-bar;;8"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3222241800,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "User should navigate to Top menu bar",
  "description": "",
  "id": "top-menu-test;user-should-navigate-to-top-menu-bar;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select \"Computers\" from top bar",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should successfully navigate to the menu page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should see the \"Computers\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TopMenuSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 100100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Computers",
      "offset": 10
    }
  ],
  "location": "TopMenuSteps.iSelectFromTopBar(String)"
});
formatter.result({
  "duration": 694871400,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iShouldSuccessfullyNavigateToTheMenuPage()"
});
formatter.result({
  "duration": 43000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Computers",
      "offset": 18
    }
  ],
  "location": "TopMenuSteps.iShouldSeeThe(String)"
});
formatter.result({
  "duration": 67246500,
  "status": "passed"
});
formatter.after({
  "duration": 708890100,
  "status": "passed"
});
formatter.before({
  "duration": 3092255300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User should navigate to Top menu bar",
  "description": "",
  "id": "top-menu-test;user-should-navigate-to-top-menu-bar;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select \"Electronics\" from top bar",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should successfully navigate to the menu page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should see the \"Electronics\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TopMenuSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 65500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Electronics",
      "offset": 10
    }
  ],
  "location": "TopMenuSteps.iSelectFromTopBar(String)"
});
formatter.result({
  "duration": 844391000,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iShouldSuccessfullyNavigateToTheMenuPage()"
});
formatter.result({
  "duration": 21100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Electronics",
      "offset": 18
    }
  ],
  "location": "TopMenuSteps.iShouldSeeThe(String)"
});
formatter.result({
  "duration": 58980400,
  "status": "passed"
});
formatter.after({
  "duration": 706838000,
  "status": "passed"
});
formatter.before({
  "duration": 2707468700,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User should navigate to Top menu bar",
  "description": "",
  "id": "top-menu-test;user-should-navigate-to-top-menu-bar;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select \"Apparel\" from top bar",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should successfully navigate to the menu page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should see the \"Apparel\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TopMenuSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 49300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apparel",
      "offset": 10
    }
  ],
  "location": "TopMenuSteps.iSelectFromTopBar(String)"
});
formatter.result({
  "duration": 868349900,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iShouldSuccessfullyNavigateToTheMenuPage()"
});
formatter.result({
  "duration": 21600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apparel",
      "offset": 18
    }
  ],
  "location": "TopMenuSteps.iShouldSeeThe(String)"
});
formatter.result({
  "duration": 64438500,
  "status": "passed"
});
formatter.after({
  "duration": 692362600,
  "status": "passed"
});
formatter.before({
  "duration": 2873390500,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "User should navigate to Top menu bar",
  "description": "",
  "id": "top-menu-test;user-should-navigate-to-top-menu-bar;;5",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select \"Digital downloads\" from top bar",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should successfully navigate to the menu page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should see the \"Digital downloads\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TopMenuSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 70100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital downloads",
      "offset": 10
    }
  ],
  "location": "TopMenuSteps.iSelectFromTopBar(String)"
});
formatter.result({
  "duration": 1508670000,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iShouldSuccessfullyNavigateToTheMenuPage()"
});
formatter.result({
  "duration": 13900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital downloads",
      "offset": 18
    }
  ],
  "location": "TopMenuSteps.iShouldSeeThe(String)"
});
formatter.result({
  "duration": 42667700,
  "status": "passed"
});
formatter.after({
  "duration": 692843100,
  "status": "passed"
});
formatter.before({
  "duration": 2601717800,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User should navigate to Top menu bar",
  "description": "",
  "id": "top-menu-test;user-should-navigate-to-top-menu-bar;;6",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select \"Books\" from top bar",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should successfully navigate to the menu page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should see the \"Books\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TopMenuSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 38700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 10
    }
  ],
  "location": "TopMenuSteps.iSelectFromTopBar(String)"
});
formatter.result({
  "duration": 994175500,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iShouldSuccessfullyNavigateToTheMenuPage()"
});
formatter.result({
  "duration": 23200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Books",
      "offset": 18
    }
  ],
  "location": "TopMenuSteps.iShouldSeeThe(String)"
});
formatter.result({
  "duration": 74770600,
  "status": "passed"
});
formatter.after({
  "duration": 725402200,
  "status": "passed"
});
formatter.before({
  "duration": 4616452900,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "User should navigate to Top menu bar",
  "description": "",
  "id": "top-menu-test;user-should-navigate-to-top-menu-bar;;7",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select \"Jewelry\" from top bar",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should successfully navigate to the menu page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should see the \"Jewelry\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TopMenuSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 103500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jewelry",
      "offset": 10
    }
  ],
  "location": "TopMenuSteps.iSelectFromTopBar(String)"
});
formatter.result({
  "duration": 2433646000,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iShouldSuccessfullyNavigateToTheMenuPage()"
});
formatter.result({
  "duration": 48500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jewelry",
      "offset": 18
    }
  ],
  "location": "TopMenuSteps.iShouldSeeThe(String)"
});
formatter.result({
  "duration": 153580000,
  "status": "passed"
});
formatter.after({
  "duration": 920384500,
  "status": "passed"
});
formatter.before({
  "duration": 3230268200,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "User should navigate to Top menu bar",
  "description": "",
  "id": "top-menu-test;user-should-navigate-to-top-menu-bar;;8",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I select \"Gift Cards\" from top bar",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should successfully navigate to the menu page",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "I should see the \"Gift Cards\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.match({
  "location": "TopMenuSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 39100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gift Cards",
      "offset": 10
    }
  ],
  "location": "TopMenuSteps.iSelectFromTopBar(String)"
});
formatter.result({
  "duration": 1081533900,
  "status": "passed"
});
formatter.match({
  "location": "TopMenuSteps.iShouldSuccessfullyNavigateToTheMenuPage()"
});
formatter.result({
  "duration": 30300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Gift Cards",
      "offset": 18
    }
  ],
  "location": "TopMenuSteps.iShouldSeeThe(String)"
});
formatter.result({
  "duration": 64319500,
  "status": "passed"
});
formatter.after({
  "duration": 888060200,
  "status": "passed"
});
});