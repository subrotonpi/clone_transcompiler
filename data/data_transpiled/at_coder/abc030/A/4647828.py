def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = sc.sum ( ) / sc.sum ( )
        b = sc.sum ( ) / sc.sum ( )
        if a < b :
            print ( "TAKAHASHI" )
        elif a > b :
            print ( "AOKI" )
        else :
            print ( "DRAW" )
