def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        a = abs ( sc.__next__ ( ) )
        b = abs ( sc.__next__ ( ) )
        if a < b : print ( "Ant" )
        if a > b : print ( "Bug" )
        if a == b : print ( "Draw" )
