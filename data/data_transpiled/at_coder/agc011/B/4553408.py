def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        arr = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
        arr = [ arr [ i ] for i in range ( n ) ]
    def sort ( arr ) :
        total = 0
        count = 0
        for a in arr :
            if a > 2 * total :
                count = 1
            else :
                count += 1
            total += a
        print ( count )
