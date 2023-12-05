def main ( ) :
    import sys
    from random import randint
    from random import randint
    from random import randint
    from random import choice
    from random import choice
    N = randint ( 1 , N )
    M = randint ( 1 , M )
    kankeigraph = [ [ 0 for i in range ( N + 1 ) ] for i in range ( N + 1 ) ]
    friend = [ 0 for i in range ( 10 ) ]
    friend_of_friend = [ False for i in range ( 11 ) ]
    friend_cnt = 0
    for i in range ( 0 , N ) :
        for j in range ( 0 , N ) :
            kankeigraph [ i ] [ j ] = 0
    for i in range ( 10 ) :
        friend [ i ] = 0
    for i in range ( M ) :
        from_i = randint ( 0 , N )
        to_i = randint ( 0 , N )
        kankeigraph [ from_i ] [ to_i ] = 1
        kankeigraph [ to_i ] [ from_i ] = 1
    for i in range ( 1 , N ) :
        for j in range ( 10 ) :
            friend [ j ] = 0
        for j in range ( 1 , 10 ) :
            friend_of_friend [ j ] = False
        friend_cnt = 0
        for j in range ( 1 , N ) :
            if kankeigraph [ i ] [ j ] == 1 :
                friend [ friend_cnt ] = j
                friend_cnt += 1
        for j in range ( friend_cnt ) :
            for k in range ( 1 , N ) :
                if kankeigraph [ friend [ j ] ] [ k ] == 1 and kankeigraph [ i ] [ k ] == 0 and i != k :
                    friend_of_friend [ k ] = True
        kazu = 0
        for j in range ( 1 , N ) :
            if friend_of_friend [ j ] :
                kazu += 1
        print ( kazu )
