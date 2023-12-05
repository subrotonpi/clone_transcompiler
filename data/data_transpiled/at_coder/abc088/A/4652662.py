def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        a = sc.read ( )
        if n % 500 <= a :
            print ( "Yes" )
        else :
            print ( "No" )
