def _import ( ) : return sys.stdin.read ( )
import struct
import math
class Main ( object ) :
    def __init__ ( self , * args ) :
        self.INPUT = ''
        self.MOD = 1_000_000_007
        self.inf = sys.maxint
    def solve ( self ) :
        a , b = self.nl ( )
        k , l = self.nl ( )
        bc , ac = k / l , k - l * bc
        self.out.write ( min ( b * bc + a * ac , b * ( bc + 1 ) ) )
    def run ( self ) :
        self.INPUT = ''.join ( self.INPUT )
        self.out = sys.stdout.write
        s = time.time ( )
        self.solve ( )
        self.out.flush ( )
        if not self.INPUT :
            self.tr ( time.time ( ) - s , 'ms' )
    def main ( self ) :
        super ( Main , self ).run ( )
    def inbuf ( self , lenbuf ) :
        self.lenbuf , self.ptrbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
        self.lenbuf = None , None
