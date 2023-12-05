def main ( ) :
    import sys
    from random import randint
    from itertools import chain
    from random import randint
    from itertools import chain
    n = randint ( 1 , n )
    m = randint ( 1 , n )
    friend = [ [ 1 for i in range ( n ) ] for _ in range ( m ) ]
    for a , b in chain ( range ( n ) , repeat ( n ) ) :
        friend [ a ] [ b ] = 1
        friend [ b ] [ a ] = 1
    for i in chain ( range ( n ) , repeat ( n ) ) :
        c = [ 1 for j in range ( n ) if i == j ]
        if friend [ i ] [ j ] == 1 :
            for k in range ( n ) :
                if k == j or k == i :
                    continue
                if friend [ j ] [ k ] == 1 :
                    c [ k ] = 1
        ans = 0
        for w in range ( n ) :
            if friend [ i ] [ w ] == 1 :
                continue
            if c [ w ] == 1 :
                ans += 1
        print ( ans )
