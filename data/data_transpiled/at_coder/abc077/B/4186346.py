def main ( ) :
    import sys
    from random import randint
    from math import sin , cos
    from math import cos , sin
    N = randint ( 1 , N )
    ans = 0
    for i in range ( 1 , 2 ** N + 1 ) :
        ans = sin ( i )
    print ( ans )
