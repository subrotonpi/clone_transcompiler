def main ( ) :
    import sys
    from itertools import repeat
    from random import randint
    from itertools import chain
    n = randint ( 1 , 10000 )
    grid = chain ( chain ( range ( n ) , repeat ( n ) ) )
    ans = 0
    for i in range ( n ) :
        sym = True
        for j in range ( n ) :
            for k in range ( n ) :
                if grid [ j ] [ ( k + i ) % n ] != grid [ k ] [ ( j + i ) % n ] :
                    sym = False
        if sym :
            ans += n
    print ( ans )
