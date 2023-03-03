def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        m = sc.read ( )
        po = [ ]
        for i in range ( n ) :
            po.append ( sc.read ( ) )
            m -= po [ i ]
        po.sort ( )
        print ( n + m / po [ 0 ] )
