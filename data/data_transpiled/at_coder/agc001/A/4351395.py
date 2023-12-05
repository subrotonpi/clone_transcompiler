def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        arr = [ sc.readline ( ).strip ( ) for i in range ( 2 * n ) ]
        arr = [ ]
        for i in range ( n ) :
            arr.append ( arr [ i ] )
        arr.sort ( )
        sum = 0
        for i in range ( n ) :
            sum += arr [ i * 2 ]
        print ( sum )
