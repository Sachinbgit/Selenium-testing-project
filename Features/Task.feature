Feature: Google title

  Scenario Outline: verify the google site
    Given Launch the browser and validate the title
    When Enter the "<Product>" name And click it.
    Then Validate the "<Title>"is matching.

    Examples: 
      | Product | Title                   |
      | watch   | watch - Google Search   |
      | mobile  | mobile - Google Search  |
      | sugar   | sugar - Google Search   |
      | clothes | clothes - Google Search |
      | wallet  | wallet - Google Search  |
+
