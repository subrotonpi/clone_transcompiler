def main ( ) :
    import sys
    from random import randint
    from itertools import chain
    from itertools import chain
    n = randint ( 1 , 10000 )
    x = chain ( chain ( [ 0 ] , [ ] ) , chain ( [ 0 ] , [ ] ) )
    a = chain ( [ 0 ] , [ ] )
    a.sort ( )
    happy = 0
    for i in range ( n ) :
        x = x - a [ i ]
        if x < 0 :
            break
        else :
            happy += 1
    if x > 0 :
        happy -= 1
    print ( happy )
