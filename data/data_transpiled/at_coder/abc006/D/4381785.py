def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        arr = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
        maxes = [ ]
        for i in range ( n ) :
            max = 0
            for j in range ( i - 1 , - 1 , - 1 ) :
                if arr [ j ] < arr [ i ] :
                    if max < maxes [ j ] :
                        max = maxes [ j ]
            maxes.append ( max + 1 )
        maxes.sort ( )
        print ( n - maxes [ n - 1 ] )
