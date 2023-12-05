def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        chars = sc.choice ( string.ascii_letters )
        K = sc.randint ( 0 , K )
        for i in range ( min ( len ( chars ) , K ) ) :
            if chars [ i ] != '1' :
                print ( chars [ i ] )
                return
        print ( '1' )
