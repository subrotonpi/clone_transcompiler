def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        x = sc.readline ( ).strip ( )
        arr = [ ]
        total = 0
        for i in range ( n ) :
            arr.append ( sc.readline ( ).strip ( ) )
            total += arr [ i ]
        min_arr = ( arr [ 0 ] , arr [ 1 ] )
        min = total
        for i in range ( 1 , n ) :
            total = 0
            w = min_arr [ n - 1 ]
            for j in range ( n - 1 , 0 , - 1 ) :
                min_arr [ j ] = min ( min_arr [ j - 1 ] , arr [ j ] )
                total += min_arr [ j ]
            min_arr [ 0 ] = min ( w , arr [ 0 ] )
            total += min_arr [ 0 ]
            total += i * x
            if min > total :
                min = total
        print ( min )
