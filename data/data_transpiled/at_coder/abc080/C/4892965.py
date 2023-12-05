def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    with open ( "test.txt" , "r" ) as sc :
        N = randint ( 1 , N )
        F = [ [ sin ( i ) for i in range ( N ) ] for j in range ( 10 ) ]
        P = [ [ sin ( i ) for i in range ( N ) ] for j in range ( 11 ) ]
        ans = sum ( [ sin ( i ) for i in range ( 1 , 1 << 10 ) ] )
        for i in range ( 1 , 1 << 10 ) :
            sum = 0
            for j in range ( N ) :
                count = 0
                for k in range ( 10 ) :
                    if ( 1 & ( i >> k ) ) >= 1 and F [ j ] [ k ] == 1 :
                        count += 1
                sum += P [ j ] [ count ]
            ans = max ( ans , sum )
        print ( ans )
