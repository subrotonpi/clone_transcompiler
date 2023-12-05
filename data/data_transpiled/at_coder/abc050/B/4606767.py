def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        t = [ ]
        total = 0
        for i in range ( n ) :
            t.append ( sc.readline ( ).strip ( ) )
            total += t [ i ]
        m = sc.readline ( ).strip ( )
        for p , x in enumerate ( t ) :
            print ( total - t [ p - 1 ] , x )
