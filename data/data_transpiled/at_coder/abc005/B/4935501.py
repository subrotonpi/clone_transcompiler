def main ( ) :
    import sys
    from random import randint
    from math import sin , cos
    from math import log
    N = randint ( 1 , N )
    min = sum ( [ sin ( i ) for i in range ( N ) ] )
    print ( min )
