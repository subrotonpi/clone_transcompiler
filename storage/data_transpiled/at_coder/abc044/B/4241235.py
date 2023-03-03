def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        w = sc.__next__ ( )
        count = [ 0 ] * 26
        for c in w :
            count [ c - 'a' ] += 1
        for i in range ( 26 ) :
            if count [ i ] % 2 :
                print ( "No" )
                return
        print ( "Yes" )
