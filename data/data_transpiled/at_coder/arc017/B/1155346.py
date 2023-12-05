def _import ( ) : return _import ( )
class Main ( ) :
    MOD = 1000000007
    def __init__ ( self , n ) :
        Scanner = _import ( )
        Scanner.__init__ ( self )
        self.N = len ( Scanner.read ( ) )
        self.K = len ( Scanner.read ( ) )
        A = [ ]
        self.A.append ( Scanner.read ( ) )
        self.count = 0
        up = 1
        for i in range ( N ) :
            if i > 0 and A [ i - 1 ] < A [ i ] :
                up += 1
            else :
                up = 1
            if K <= up :
                count += 1
        print ( count )
    def debug ( * x ) :
        if is_debug :
            print ( " ".join ( [ str ( x ) for x in x ] ) , file = sys.stderr )
class Scanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def read ( self ) :
        self.stream.read ( )
    def write ( self , data ) :
        num = 0
        read = skip ( )
        while True :
            num = num * 10 + ( read - 0x30 )
            if read > 0 :
                break
        return num
    def fill ( self , a ) :
        for i in range ( len ( a ) ) :
            a [ i ] = randint ( )
            b [ i ] = randint ( )
    def read ( self , b ) :
        num = 0
        read = skip ( )
        while True :
            num = num * 10 + ( read - 0x30 )
            if read > 0 :
                break
        return num
    def write ( self , a ) :
        for i in range ( len ( a ) ) :
            a [ i ] = randint ( )
            b [ i ] = randint ( )
    def read ( self , b ) :
        for i in range ( len ( b ) ) :
            b [ i ] = randint ( )
            b [ i ] = randint ( )
