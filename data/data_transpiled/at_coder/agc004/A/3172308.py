def _import ( ) : return sys.stdin.read ( )
from io import BytesIO
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        self.A = 0
        self.B = 1
        self.C = 1
    def solve ( self ) :
        if self.A % 2 == 0 or self.B % 2 == 0 or self.C % 2 == 0 :
            return chain ( [ ] , [ ] )
        else :
            ab = chain ( [ A ] , [ B ] , [ ] )
            ac = chain ( [ A ] , [ B ] , [ ] )
            bc = chain ( [ B ] , [ C ] , [ ] )
            return min ( chain ( ab , ac , bc ) )
    @ classmethod
    def readline ( cls ) :
        if not hasattr ( cls , 'readline' ) or not hasattr ( cls , 'strip' ) :
            try :
                cls.readline = iter ( cls.readline )
            except StopIteration :
                return None
        return cls.readline ( )
    def __next__ ( self ) :
        return next ( chain ( [ 0 ] , repeat ( 1 ) ) )
    def __next__ ( self ) :
        return next ( chain ( [ 0 ] , repeat ( 1 ) ) )
    def __next__ ( self ) :
        return next ( chain ( [ 0 ] , repeat ( 1 ) ) )
    def __next__ ( self ) :
        a = chain ( [ 1 ] , repeat ( 1 ) )
        return a
