def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        sc.close ( )
        po = [ ]
        for p in sc.readlines ( ) :
            for i in range ( n ) :
                po.append ( p [ i ] )
        for i in range ( n ) :
            for j in range ( n ) :
                print ( po [ n - 1 - j ] [ i ] , end = ' ' )
            print ( )
