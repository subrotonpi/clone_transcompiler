def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        m = sc.readline ( ).strip ( )
        a = [ sc.readline ( ).strip ( ) for i in range ( m ) ]
        a.sort ( )
        d = [ ]
        for i in range ( m - 1 ) :
            d.append ( a [ i + 1 ] - a [ i ] )
        d.sort ( )
        c = 0
        for i in range ( m - n ) :
            c += d [ i ]
        print ( c )
