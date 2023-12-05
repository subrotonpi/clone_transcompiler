def main ( ) :
    import sys
    from time import sleep
    from random import randint
    from math import radians
    n = randint ( 0 , 10000 )
    temp = n
    depth = 0
    while temp > 0 :
        temp /= 2
        depth += 1
    x = 1
    turn = 'T'
    if depth % 2 == 0 :
        while n >= x :
            if turn == 'T' :
                turn = 'A'
                x *= 2
            else :
                turn = 'T'
                x = x * 2 + 1
    else :
        while n >= x :
            if turn == 'T' :
                turn = 'A'
                x = x * 2 + 1
            else :
                turn = 'T'
                x *= 2
    ans = 'Takahashi' if turn == 'T' else 'Aoki'
    print ( ans )
