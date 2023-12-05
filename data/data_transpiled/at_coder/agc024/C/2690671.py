def main ( ) :
    import sys
    from random import randint
    from time import sleep
    from math import log
    from math import radians
    from math import log
    from math import log
    from math import log
    N = randint ( 1 , N + 1 )
    A = [ ]
    ans = 0
    A.append ( - 1 )
    for i in range ( 1 , N + 1 ) :
        A.append ( randint ( 1 , N + 1 ) )
        if A [ i ] - A [ i - 1 ] > 1 :
            ans = - 1
            break
        if A [ i ] == 0 :
            continue
        if A [ i ] == 1 or A [ i ] - A [ i - 1 ] == 1 :
            ans += 1
        else :
            ans += A [ i ]
    print ( ans )
