def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        i = int ( sc.read ( ) )
        if i in [ 7 , 5 , 3 ] :
            print ( "YES" )
        else :
            print ( "NO" )
