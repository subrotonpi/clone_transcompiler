def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        H1 = sc.__next__ ( )
        W1 = sc.__next__ ( )
        H2 = sc.__next__ ( )
        W2 = sc.__next__ ( )
        flag = False
        if H1 == H2 or W1 == H2 or H1 == W2 or W1 == W2 :
            print ( "YES" )
        else :
            print ( "NO" )
