def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        lst = [ sc.readline ( ).strip ( ) for i in range ( n ) ]
        lst.sort ( )
        lst [ n - 1 ] = lst [ n - 1 ] / 2
        sum = 0
        for i in lst :
            sum += i
        print ( sum )
        sc.close ( )
