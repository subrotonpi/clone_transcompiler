def import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        X = int ( sc.read ( ) , 16 )
        Y = int ( sc.read ( ) , 16 )
        if X < Y :
            print ( "<" )
        elif X > Y :
            print ( ">" )
        else :
            print ( "=" )
