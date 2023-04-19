Feature: Trello API Queries
  @Smoke
  Scenario: Creating and terminating a board
    Given seting the endpoint with path parameter "1,boards" and query parameter "Creation"
    And send the query associated with "creating a board"
    Then seting the endpoint with path parameter "1,lists" and query parameter "Lists"
    And send the query associated with "creating a list"
    Then seting the endpoint with path parameter "1,cards" and query parameter "Cards"
    And send the query associated with "creating two cards"
    Then seting the endpoint with path parameter "1,cards" and query parameter "Card update"
    And send the query associated with "updating cards"
    Then seting the endpoint with path parameter "1,cards" and query parameter "Delete cart"
    And send the query associated with "deleting cards"
    Then seting the endpoint with path parameter "1,boards" and query parameter "Delete board"
    And send the query associated with "deleting board"




