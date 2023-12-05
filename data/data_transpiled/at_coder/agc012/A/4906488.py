def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        arr = [ sc.readline ( ).strip ( ) for i in range ( n * 3 ) ]
        arr = [ ]
        for i in arr :
            arr.append ( sc.readline ( ).strip ( ) )
    arr = [ ]
    total = 0
    for i in range ( n ) :
        total += long ( arr [ 3 * n - 2 - i * 2 ] )
    print ( total )
