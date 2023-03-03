def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import radians
    from math import log
    from math import log
    from math import log
    from math import log
    n = randint ( 1 , 10000 )
    C = randint ( 1 , 10000 )
    ar = [ [ 0 for i in range ( C ) ] for s in range ( 100001 ) ]
    for s , t , c in zip ( range ( 1 , 100001 ) , range ( 100001 ) ) :
        for j in range ( s , t + 1 ) :
            ar [ c ] [ j ] = 1
    ans = 0
    for i in range ( 1 , 100001 ) :
        max = 0
        for j in range ( C ) :
            max += ar [ j ] [ i ]
        ans = max ( ans , max )
    print ( ans )
