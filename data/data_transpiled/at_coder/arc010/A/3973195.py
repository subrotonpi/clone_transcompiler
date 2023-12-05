def main ( ) :
    import sys
    from random import randint
    from time import sleep
    try :
        N = randint ( 1 , N )
        M = randint ( 1 , M )
        A = randint ( 1 , A )
        B = randint ( 1 , B )
        c = [ randint ( 1 , M + 1 ) for i in range ( 1 , M + 1 ) ]
        cards = N
        index = - 1
        flag = True
        for i in range ( 1 , M + 1 ) :
            if cards <= A :
                cards += B
            if cards < c [ i ] :
                index = i
                flag = False
                break
            cards -= c [ i ]
        if flag :
            print ( 'complete' )
        else :
            print ( index )
    except KeyboardInterrupt :
        print ( '\n' )
