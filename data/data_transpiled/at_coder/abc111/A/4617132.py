def import import sys
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.name = sys.stdin.read ( )
    def __str__ ( self ) :
        return string.split ( self.name ) [ 0 ]
