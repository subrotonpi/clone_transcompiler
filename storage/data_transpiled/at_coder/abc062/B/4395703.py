def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        m = sc.readline ( ).strip ( )
        sc.readline ( ).strip ( )
        for i in range ( m + 2 ) :
            print ( '#' , end = '' )
        print ( )
        for i in range ( n ) :
            print ( '#' , end = '' )
            print ( sc.readline ( ) )
            print ( '#' , end = '' )
        for i in range ( m + 2 ) :
            print ( '#' , end = '' )
        print ( )
