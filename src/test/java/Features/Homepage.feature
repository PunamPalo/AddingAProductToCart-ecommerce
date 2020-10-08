Feature: Selection of book

Scenario Outline: positive test selection

Given invoke browser with chrome
And navigate to <url>
And click on BestSellers
And select Books category
When user enters ParticularBookname
And select enter
Then view the book
And Add that book to the cart
And quit browser

Examples:
|url          |
|https://www.amazon.nl/|
