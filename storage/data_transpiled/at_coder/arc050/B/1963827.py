def _import ( ) : return _import ( )
from struct import Struct , calcsize , unpack , unpack , unpack
class Main ( object ) :
    def __init__ ( self , fp , INPUT , MOD = 1_000_000_007 , inf = int ( sys.maxsize / 2 ) ) :
        self.fp = fp
        self.INPUT = ''
        self.MOD = MOD = 1_000_000_007
        inf = calcsize ( 'I' )
        def solve ( self ) :
            r = self.nl ( )
            b = self.nl ( )
            x = self.nl ( )
            y = self.nl ( )
            left = 0
            right = max ( r , b ) + 1
            while right - left > 1 :
                mid = ( left + right ) / 2
                lower = mid
                if mid >= b :
                    lower += ( mid - b + y - 2 ) / ( y - 1 )
                else :
                    lower -= ( b - mid ) / ( y - 1 )
                upper = 0
                if r >= mid :
                    upper = ( r - mid ) / ( x - 1 )
                else :
                    upper = - 1
                if upper < lower or upper < 0 or lower > mid :
                    right = mid
                else :
                    left = mid
            self.fp.write ( left )
        def run ( self ) :
            self.fp = sys.stdin if self.INPUT else StringIO ( self.INPUT )
            self.out = sys.stdout
            s = time.time ( )
            self.solve ( )
            self.out.flush ( )
            if not self.INPUT :
                self.tr ( time.time ( ) - s + 'ms' )
    def main ( self ) :
        super ( Main , self ).run ( )
    def inbuf ( self , * args ) :
        self.lenbuf , self.ptrbuf = 0 , 0
    def read ( self ) :
        self.lenbuf = 0
        self.ptrbuf = 0
        self.strlen = 0
        self.mem = 0
        self.mem = 0
    def write ( self , fp , N ) :
        self.write ( _import ( self.mem , N ) )
    write ( self , fp , N )