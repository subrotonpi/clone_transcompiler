def _import ( ) : return next ( )
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.n = self.n
        a = [ ]
        for i in range ( self.n ) :
            for j in range ( 2 ) :
                a.append ( i )
        self.stdout.write ( solve ( a ) )
        self.stdout.flush ( )
    def solve ( self , a ) :
        n = len ( a )
        sm = 0
        for i in range ( self.n ) :
            if self.a [ i ] [ 0 ] == a [ i ] [ 1 ] :
                sm += 1
        if sm == self.n :
            return 0
        sum = 0
        minb = self.maxsize
        for i in range ( self.n ) :
            sum += self.a [ i ] [ 0 ]
            if self.a [ i ] [ 0 ] > a [ i ] [ 1 ] :
                minb = min ( minb , self.maxsize )
        if minb != self.maxsize :
            sum -= minb
        return sum
    def debug ( * x ) :
        sys.stderr.write ( "".join ( str ( x ) for x in x ) )
    class InputReader ( object ) :
        def __init__ ( self ) :
            self.BUFFER_LENGTH = 1 << 12
            self.stream = sys.stdin
            self.buf = [ ]
            self._buf = ''
            self.num_chars = 0
            while True :
                res.append ( ord ( self.stream.read ( self._buf ) ) )
                self._buf = ''
                self.num_chars = self.maxsize
        def read ( self ) :
            self._buf = self._buf
            self.num_chars = self.num_chars
    def write ( self , * args ) :
        self.write ( "\n" )
        self.write ( "\n" )
        self.write ( "\n" )
        self.write ( "\n" )
        self.write ( "\n" )
        self.write ( "\n" )
        self.write ( "\n" )
        self.write ( "\n"