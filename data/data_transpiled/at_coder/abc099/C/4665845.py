def main ( ) :
    import sys
    from math import sin , cos , pi
    from os.path import join
    from os import chdir
    N = int ( sys.argv [ 1 ] )
    res = N
    for i in range ( 0 , N ) :
        cc = 0
        t = i
        while t > 0 :
            cc += t % 6
            t /= 6
        t = N - i
        while t > 0 :
            cc += t % 9
            t /= 9
        if res > cc :
            res = cc
    print ( res )
