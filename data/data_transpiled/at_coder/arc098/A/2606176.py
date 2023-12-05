def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    sc = sys.stdin
    numberOfPeople = randint ( 1 , 10000 )
    people_directions = sc.read ( ).split ( '-' )
    east = [ 0 ] * ( numberOfPeople - 1 )
    west = [ 0 ] * ( numberOfPeople - 1 )
    for i in range ( numberOfPeople ) :
        if people_directions [ i ] == 'E' :
            east [ i ] = 1
        else :
            west [ i ] = 1
    for i in range ( 1 , numberOfPeople ) :
        east [ i ] += east [ i - 1 ]
        west [ i ] += west [ i - 1 ]
    minimumNumberOfPeopleToChangeDirection = numberOfPeople
    for i in range ( numberOfPeople ) :
        countOfEastAtRightSide = east [ numberOfPeople - 1 ] - east [ i ]
        countOfWestAtLeftSide = west [ i ] if i == 0 else west [ i - 1 ]
        totalCount = countOfEastAtRightSide + countOfWestAtLeftSide
        if minimumNumberOfPeopleToChangeDirection > totalCount :
            minimumNumberOfPeopleToChangeDirection = totalCount
    print ( minimumNumberOfPeopleToChangeDirection )
