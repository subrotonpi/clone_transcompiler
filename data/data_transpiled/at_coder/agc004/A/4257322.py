def main ( srgs ) :
    import sys
    from math import sin , cos , pi
    from os.path import join
    from os import path
    from os import urandom
    a = [ sin ( i ) , cos ( i ) , pi ]
    ans = 0
    a = [ i for i in a if i % 2 == 0 or i % 2 == 0 or i % 2 == 0 ]
    if a [ 0 ] % 2 == 0 or a [ 1 ] % 2 == 0 or a [ 2 ] % 2 == 0 :
        ans = 0
    else :
        ans = a [ 0 ] * a [ 1 ]
    print ( ans )
