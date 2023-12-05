def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        k = sc.read ( )
        if n % k == 0 :
            print ( 0 )
        else :
            print ( 1 )
