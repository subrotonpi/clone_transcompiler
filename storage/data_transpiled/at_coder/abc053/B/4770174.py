def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.s = _main ( )
    def __str__ ( self ) :
        return self.s
    a = s.find ( "A" )
    z = s.rfind ( "Z" )
    str = s [ a : z + 1 ]
    del s
    print ( len ( str ) )
