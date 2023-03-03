def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = sc.__next__ ( )
        b = sc.__next__ ( )
        if a <= 0 and 0 <= b :
            print ( "Zero" )
        elif 0 < a < b :
            print ( "Positive" )
        else :
            print ( "Positive" if ( abs ( a - b ) + 1 ) % 2 == 0 else "Negative" )
