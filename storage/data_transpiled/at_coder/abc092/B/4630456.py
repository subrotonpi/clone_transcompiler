def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from math import log
    from math import log
    n = randint ( 1 , 5 )
    d = randint ( 1 , 5 )
    x = randint ( 1 , 5 )
    X = [ ]
    ans = x
    for i in range ( n ) :
        X.append ( log ( i ) )
    for i in range ( 1 , d + 1 ) :
        for j in range ( n ) :
            if ( i - 1 ) % X [ j ] == 0 :
                ans += 1
    print ( ans )
