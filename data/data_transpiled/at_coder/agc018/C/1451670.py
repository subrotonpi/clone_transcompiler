def _import ( ) : return sys.maxsize / 2
import math
import collections
import math
class Main ( object ) :
    INF = math.inf / 2
    def __init__ ( self , b , c ) :
        self.b = b
        self.c = c
    def __lt__ ( self , block ) :
        return ( block.b - block.c ) < 0
