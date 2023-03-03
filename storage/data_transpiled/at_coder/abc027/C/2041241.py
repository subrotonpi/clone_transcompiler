def main ( ) :
    import sys
    from time import sleep
    from random import randint
    n = randint ( 1 , 10000 )
    temp = n
    depth = 0
    while True :
        temp /= 2
        if temp == 0 :
            break
        depth += 1
    x = 1
    turn = 'T'
    if depth % 2 == 0 :
        while True :
            if turn == 'T' :
                x = x * 2 + 1
                if x > n :
                    print ( 'Aoki' )
                    return
                turn = 'A'
            elif turn == 'A' :
                x *= 2
                if x > n :
                    print ( 'Takahashi' )
                    return
                turn = 'T'
    else :
        while True :
            if turn == 'T' :
                x = x * 2
                if x > n :
                    print ( 'Aoki' )
                    return
                turn = 'A'
            elif turn == 'A' :
                x = x * 2 + 1
                if x > n :
                    print ( 'Takahashi' )
                    return
                turn = 'T'
