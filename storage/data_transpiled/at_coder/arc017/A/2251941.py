def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = int ( sc.readline ( ) )
        for i in range ( 2 , n ) :
            if n % i == 0 :
                print ( "NO" )
                sc.close ( )
                return
        print ( "YES" )
        sc.close ( )
