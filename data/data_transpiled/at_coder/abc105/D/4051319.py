def main ( ) :
    import sys
    from random import randint
    from math import log
    from math import sin , cos , ceil
    sc = sys.stdin
    ( N , M ) = sc.readline ( ).split ( )
    sum = [ 0 ] + sum [ - 1 ]
    mod_n = { }
    for i in range ( 0 , N ) :
        r = int ( sum [ i ] % M )
        if r not in mod_n :
            mod_n [ r ] = 1
        else :
            mod_n [ r ] = mod_n [ r ] + 1
    ans = 0
    for key in mod_n :
        value = mod_n [ key ]
        ans += value * ( value - 1 ) / 2
    print ( ans )
