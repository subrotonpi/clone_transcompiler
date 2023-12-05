def main ( ) :
    import sys
    import random
    from time import sleep
    from math import sin , cos , cos , pi
    from itertools import product
    sc = Scanner ( )
    N = sc.__next__ ( )
    A = [ sin ( n ) for n in range ( N + 1 ) ]
    ans = 0
    for n in range ( N ) :
        ans += ( A [ n ] // 2 )
        if A [ n ] % 2 and A [ n + 1 ] > 0 :
            A [ n + 1 ] -= 1
            ans += 1
    print ( ans )
