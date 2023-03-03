def main ( ) :
    import sys
    from random import randint
    from random import randint
    from random import randint
    from random import randint
    from random import choice
    from random import choice
    from random import choice
    from random import choice
    N = randint ( 1 , N )
    M = randint ( 1 , M )
    friend = { }
    A = choice ( range ( M ) )
    B = choice ( range ( M ) )
    friend [ A ] [ B ] = 1
    friend [ B ] [ A ] = 1
    for i in range ( N ) :
        cnt = [ ]
        for j in range ( N ) :
            if i == j :
                continue
            if friend [ i ] [ j ] == 1 :
                for k in range ( N ) :
                    if i == k or j == k :
                        continue
                    if friend [ j ] [ k ] == 1 :
                        cnt.append ( 1 )
        ans = 0
        for j in range ( N ) :
            if friend [ i ] [ j ] == 1 :
                cnt.append ( 0 )
            if cnt [ j ] == 1 :
                ans += 1
        print ( ans )
