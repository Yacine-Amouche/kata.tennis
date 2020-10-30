Feature: Kata Tennis

  Scenario Outline: un Player gagne la partie
    Given La partie a commancer avec un score
    When le joueur marque un point sont socre est scorePlus est 1 
    Then un joueur gange la partie sont score est <scorePlus> est 4 
    Examples:
      | player        | score       | scorePlus   | 
      | player1       | 0           | 4           | 
      | player2       | 0           | 1           | 
     
     
     
    Scenario Outline: les deux joueur en egalite normal
    Given La partie a commancer avec un score <score>
    When le joueur marque un point sont socre est <scorePlus>   
    Then les deux joueurs en eglalite avec un score <scorePlus> est >=1 et <scorePlus> < 3 
    Examples:
      | player        | score       | scorePlus   | 
      | player1       | 0           | 1           | 
      | player2       | 0           | 1           |
      
Scenario Outline: les deux joueurs en egalite de trois point
Given La partie a commancer avec un score <score> est 3
When le socre est <scorePlus> 
Then les deux joueurs en eglalite avec un score <scorePlus> est = 3  <scorePlus>
Examples:
| player        | score       | scorePlus   |
| player1       | 3           | 4           |
| player2       | 3           | 3           |



Scenario Outline: un Player en avantage
Given La partie a commancer avec un score <score>
When le les deux joueurs marque un point sont socre est <scorePlus> et <Libiller> est <Libiller>
Then le joueur en avantage sont score <scorePlus> est > 3 et autre le joueur sont score <scorePlus> est = 3
Examples:
| player        | score       | scorePlus   |
| player1       | 3           | 4           |
| player2       | 3           | 3           | 