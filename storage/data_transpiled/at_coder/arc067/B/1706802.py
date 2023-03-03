def _ ( ) : return sys.stdin.read ( )
class Main ( object ) :
    def __init__ ( self ) :
        self.INPUT = ''
    def solve ( self ) :
        n , a = ni ( )
        b = ni ( )
        x = [ ]
        ans = 0
        for i in range ( n ) :
            a.append ( i )
        for i in range ( 1 , n ) :
            if long ( a ) + b == '-' :
                ans += b
            else :
                ans += long ( a ) + b
        self.INPUT.write ( ans )
    def run ( self ) :
        self.INPUT = sys.stdin if self.INPUT else StringIO ( self.INPUT )
        self.INPUT = sys.stdout
        s = time.time ( )
        self.solve ( )
        self.INPUT.flush ( )
        if not self.INPUT :
            self.tr ( time.time ( ) - s , 'ms' )
    def main ( self ) :
        super ( Main , self ).run ( )
    def inbuf ( self , * args ) :
        self.lenbuf , self.ptrbuf = 0 , 0
        while self.lenbuf == - 1 :
            raise InputError ( )
        if self.ptrbuf >= self.lenbuf :
            self.ptrbuf = 0
            try :
                self.lenbuf = self.input ( self.INbuf )
            except IOError :
                raise InputError ( )
            if self.lenbuf <= 0 :
                return - 1
        return self.inbuf [ self.ptrbuf ]
    def isSpaceChar ( self ) :
        return not ( self.lenbuf >= 33 and self.lenbuf <= 126 )
    def skip ( self ) :
        while self.lenbuf != - 1 and isSpaceChar ( self.lenbuf ) :
            self.lenbuf = 0
    def nd ( self ) :
        return float ( self.nd )
    def ns ( self ) :
        b = skip ( )
        self.s = 0
        self.ns = [ ]
        return b
return Main
