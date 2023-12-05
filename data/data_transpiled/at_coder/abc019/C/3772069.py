def main ( ) :
    import sys
    from itertools import count
    from itertools import chain
    N = len ( sys.stdin.read ( ) )
    a = [ ]
    for i in range ( N ) :
        a.append ( next ( a ) )
    for i in range ( N ) :
        while a [ i ] % 2 == 0 :
            a [ i ] /= 2
    a.sort ( )
    syurui = 1
    now = a [ 0 ]
    for i in range ( 1 , N ) :
        if now != a [ i ] :
            syurui += 1
            now = a [ i ]
    print ( syurui )
