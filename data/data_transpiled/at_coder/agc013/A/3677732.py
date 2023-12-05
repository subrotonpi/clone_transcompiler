def main ( ) :
    import sys
    from random import randint
    from math import radians
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    from math import log
    N = randint ( 1 , N )
    A = [ log ( x ) for x in range ( N ) ]
    part = 0
    P = 0
    E = 0
    while P < N :
        if P == N - 1 :
            part += 1
            break
        E = P + 1
        while E < N and A [ E - 1 ] == A [ E ] :
            E += 1
        if A [ P ] <= A [ E ] :
            while E < N and A [ E - 1 ] <= A [ E ] :
                E += 1
            part += 1
        else :
            while E < N and A [ E - 1 ] >= A [ E ] :
                E += 1
            part += 1
        P = E
    print ( part )
