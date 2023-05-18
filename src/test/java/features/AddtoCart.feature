Feature: Search and Filter the item and then Add to Cart item.

Scenario Outline: Search and Apply Filter on the search result

Given User is on the Ebay Website home page
When user searched with keyword <Name> and Select Gift Cards
Then User applies the Filter then Add item to cart
And  validate item is added successfully in the cart


Examples:
|Name|
| Deals & Sales |
| Deals1 & Sales1 |