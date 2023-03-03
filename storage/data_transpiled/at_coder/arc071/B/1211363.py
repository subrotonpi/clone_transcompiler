def _import ( ) : return int ( next ( ) )
def _import ( ) : return float ( next ( ) )
class Main :
    MOD = int ( 1e9 ) + 7
    def __init__ ( self ) :
        self.N , self.M = randint ( 0 , 1e9 )
        self.x = [ randint ( 0 , N ) for _ in range ( self.N ) ]
        self.y = [ randint ( 0 , M ) for _ in range ( self.M ) ]
        xsum , ysum = 0 , 0
        for i in range ( self.N ) :
            xsum += ( self.x [ i ] * self.M ) - ( self.x [ i ] * ( self.N - i - 1 ) )
            xsum %= MOD
        for i in range ( self.M ) :
            ysum += ( self.y [ i ] * self.M ) - ( self.y [ i ] * ( self.M - i - 1 ) )
            ysum %= MOD
        self.out.write ( xsum * ysum % MOD )
    def main ( self ) :
        self.out.flush ( )
        super ( Main , self ).__init__ ( )
        self.out.flush ( )
    def stdin ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stdout = sys.stdout
        self.p = 0
        self.buflen = 0
        def has_next_byte ( ) :
            if self.p < self.buflen : return True
            self.p = 0
            try :
                self.buflen = self.stream.read ( self.buflen )
            except AttributeError :
                pass
            if self.buflen <= 0 : return False
            return True
        def __iter__ ( self ) :
            while self.p < self.buflen :
                self.p += 1
            return self.p
        def isspace ( self ) :
            if self.ch in '!' : return True
            return False
        def next ( self ) :
            if self.ch in '!' : return False
            return False
