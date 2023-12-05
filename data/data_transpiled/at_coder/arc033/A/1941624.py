def main ( ) :
    import sys
    from random import randint
    from math import sin , cos , cos , log
    from os import urandom
    n = urandom ( 1 )
    ans = 0
    for i in range ( 1 , n + 1 ) :
        for j in range ( 0 , n + 1 ) :
            if n >= i + j :
                ans += 1
    print ( ans )
