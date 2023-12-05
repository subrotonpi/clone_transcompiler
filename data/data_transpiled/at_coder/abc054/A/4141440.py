def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = sc.__next__ ( )
        b = sc.__next__ ( )
        if a == 1 : a = 14
        if b == 1 : b = 14
        if a == b : print ( "Draw" )
        else : print ( "Alice" if a > b else "Bob" )
