def import import string
class Main ( object ) :
    def __init__ ( self ) :
        self.string = string
    def __str__ ( self ) :
        return self.string.chars.filter ( x = '1' ).count ( )
