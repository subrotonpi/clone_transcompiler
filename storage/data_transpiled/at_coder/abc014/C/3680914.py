def main ( ) :
    import sys
    from itertools import repeat
    from random import randint
    n = randint ( 1 , 10000 )
    a = [ randint ( 0 , 10000 ) for i in range ( n ) ]
    b = [ randint ( 0 , 10000 ) for i in range ( n ) ]
    colors = [ 0 for i in range ( 1001000 ) ]
    for i in range ( n ) :
        colors [ a [ i ] ] += 1
        colors [ b [ i ] + 1 ] += - 1
    max = 0
    for i in range ( 0 , 1000000 ) :
        colors [ i + 1 ] += colors [ i ]
        if colors [ i ] > max :
            max = colors [ i ]
    print ( max )
