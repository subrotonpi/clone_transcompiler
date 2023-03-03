def main ( ) :
    import sys
    from time import sleep
    from math import pi
    N = pi
    depth = 0
    x = 1
    for i in range ( N , 0 , 2 ) :
        depth += 1
    turn = 'T'
    if depth % 2 == 0 :
        while N >= x :
            if turn == 'T' :
                x *= 2
                turn = 'A'
            elif turn == 'A' :
                x = x * 2 + 1
                turn = 'T'
    elif depth % 2 == 1 :
        while N >= x :
            if turn == 'T' :
                x = x * 2 + 1
                turn = 'A'
            elif turn == 'A' :
                x *= 2
                turn = 'T'
    if turn == 'T' :
        print ( 'Takahashi' )
    else :
        print ( 'Aoki' )
