def _ _ main _ _ ( ) : return sys.stdin.read ( )
import struct
import math
class Main ( object ) :
    def __init__ ( self , f ) :
        self.f = f
        self.INPUT = ''
        self.MOD = 1_000_000_007
        self.inf = int ( math.ceil ( math.log ( self.MOD , 2 ) ) )
        def solve ( self ) :
            n = self.ni ( )
            a = [ ]
            for i in range ( n ) :
                a.append ( self.nl ( ) )
        self.ans = 0
        while True :
            flag = False
            for i in range ( n ) :
                res = self.a [ i ] // n
                if res :
                    flag = True
                    ans += res
                    a [ i ] -= n * res
                    for i in range ( n ) :
                        if i == i : continue
                        a [ i ] += res
            if not flag : break
        f.write ( self.ans )
    def run ( self ) :
        self.f = self.INPUT if self.INPUT else StringIO ( self.INPUT )
        self.out = sys.stdout
        s = time.time ( )
        self.solve ( )
        self.out.flush ( )
        if not self.INPUT :
            self.tr ( time.time ( ) - s , 'ms' )
    def main ( self ) :
        super ( Main , self ).run ( )
    def inbuf ( self , lenbuf ) :
        self.ptrbuf = None , None
        self.lenbuf = None , None
        def readByte ( self ) :
            if self.lenbuf == None : raise InputError ( )
            if self.ptrbuf >= self.lenbuf :
                self.ptrbuf = None
                try :
                    self.lenbuf = self.fp.read ( self.lenbuf )
                except IOError :
                    raise InputError ( )
                if self.lenbuf <= 0 : return - 1
            return self.inbuf [ self.ptrbuf ]
    def isSpaceChar ( self ) :
        return not ( self.ord ( ' ' ) in ' ' )
    def skip ( self ) :
        while