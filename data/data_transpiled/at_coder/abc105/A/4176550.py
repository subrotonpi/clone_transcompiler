def import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        n = sc.read ( )
        k = sc.read ( )
        if n % k == 0 :
            print ( 0 )
        else :
            print ( 1 )
