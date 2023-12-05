def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        arr = [ ]
        for i in range ( n ) :
            arr.append ( sc.readline ( ) )
        arr.sort ( )
        sum = 0
        for i in range ( 0 , n , 2 ) :
            sum += arr [ n - 1 - i ]
        print ( sum )
