def _import ( ) :
    import sys
    import random
    from time import sleep
    from sys import maxsize
    from random import shuffle
    from sys import maxsize
    N = int ( random ( ) )
    L = [ ]
    for i in range ( 2 * N ) :
        L.append ( random ( ) )
    L.sort ( reverse = True )
    ans = 0
    for i in range ( N ) :
        ans += min ( L [ 2 * i ] , L [ 2 * i + 1 ] )
    print ( ans )
