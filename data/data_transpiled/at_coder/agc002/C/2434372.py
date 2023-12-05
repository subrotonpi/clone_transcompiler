def main ( ) :
    import sys
    from itertools import repeat
    from random import randint
    n = randint ( 1 , 10000 )
    l = randint ( 1 , 10000 )
    a = repeat ( n )
    b = last ( a , l )
    if b == - 1 :
        print ( "Impossible" )
    else :
        print ( "Possible" )
        for i in range ( b ) :
            print ( i + 1 )
        for i in range ( n - 2 , b , - 1 ) :
            print ( i + 1 )
        print ( b + 1 )
    def last ( a , l ) :
        for i in range ( len ( a ) - 1 ) :
            if a [ i ] + a [ i + 1 ] >= l :
                return i
        return - 1
    return last
