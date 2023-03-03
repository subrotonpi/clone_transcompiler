def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        w = sc.__next__ ( )
        ar = [ 0 ] * 26
        for i in w :
            ar [ i - 97 ] += 1
        for i in range ( 26 ) :
            if ar [ i ] % 2 :
                print ( "No" )
                return
        print ( "Yes" )
