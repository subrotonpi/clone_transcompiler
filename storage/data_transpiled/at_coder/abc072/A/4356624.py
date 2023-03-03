def import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        X = sc.read ( )
        t = sc.read ( )
        print ( max ( X - t , 0 ) )
