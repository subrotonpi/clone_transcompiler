def _import ( ) : return sys.stdin.read ( )
import struct
import math
class Main ( object ) :
    def __init__ ( self , * args ) :
        self.INPUT = ''
        self.MOD = 1_000_000_007
        self.inf = sys.maxint
        def solve ( ) :
            n , va , vb , l = struct.unpack ( '>i' , self.INPUT )
            ans = l
            for i in range ( n ) :
                ans *= vb / l
            self.out.write ( ans )
        def run ( self ) :
            self.INPUT = sys.stdin if self.INPUT else StringIO ( self.INPUT )
            self.out = sys.stdout
            s = time.time ( )
            self.solve ( )
            self.out.flush ( )
            if not self.INPUT :
                self.tr ( time.time ( ) - s , 'ms' )
    def main ( self ) :
        super ( Main , self ).run ( )
    def inbuf ( ) :
        self.INbuf = sys.stdin.read ( 1024 )
        self.lenbuf , self.ptrbuf = 0 , 0
        def readByte ( ) :
            if self.lenbuf == - 1 : raise InputError ( )
            if self.ptrbuf >= self.lenbuf :
                self.ptrbuf = 0
                try :
                    self.lenbuf = self.inbuf.read ( self.lenbuf )
                except IOError :
                    raise InputError ( )
                if self.lenbuf <= 0 : return - 1
            return self.inbuf [ self.ptrbuf ]
        def isSpaceChar ( c ) : return not ( c >= 33 and c <= 126 )
        def skip ( ) :
            while ( self.lenbuf != - 1 and isSpaceChar ( self.lenbuf ) ) :
                self.lenbuf += 1
            return b
        def nd ( self ) : return float ( self.nd )
        def nc ( self ) : return char ( self.nc )
    def ns ( self ) :
        b = skip ( )
        self.buf = [ ]
        while not ( self.isSpaceChar ( ) and b != ' ' ) :
            self.buf.append ( b