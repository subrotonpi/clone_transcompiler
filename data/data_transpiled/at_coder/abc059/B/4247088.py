def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.a = _main ( )
        self.b = _main ( )
    def __repr__ ( self ) :
        return "<< %s >>" % repr ( self.a )
    def __eq__ ( self , a ) :
        return a == b
    def __ne__ ( self , a ) :
        return a != b
    def __lt__ ( self , a ) :
        return a < b
    def __le__ ( self , b ) :
        return a > b
    def __gt__ ( self , a ) :
        return a > b
    def __ge__ ( self , a ) :
        return a > b
    def __eq__ ( self , a ) :
        return a < b
    def __eq__ ( self , a ) :
        return a > b
    def __ne__ ( self , b ) :
        return b < a
    def __eq__ ( self , a ) :
        return a < b
    def __ne__ ( self , b ) :
        return b > a
    def __le__ ( self , a ) :
        return a > b
    def __ge__ ( self , b ) :
        return a < b
    def __ne__ ( self , a ) :
        return b < a
    def __eq__ ( self , a ) :
        return a > b
    def __ne__ ( self , b ) :
        return b > a
    def __le__ ( self , a ) :
        return a < b
    def __ge__ ( self , b ) :
        return a >= b
    def __ne__ ( self , a ) :
        return b >= a
    def __le__ ( self , b ) :
        return a <= b
    def __ge__ ( self , a ) :
        return a >= b
    def __ne__ ( self , b ) :
        return b >= a
    return __eq__ ( self , b )
