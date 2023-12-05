def _import ( ) : return sys.stdin.read ( )
class Main ( object ) :
    def __init__ ( self , args ) :
        self._fast = FastScanner ( )
        self.n = read_int ( )
        self.C = read_int ( )
        self.d = [ ]
        self.c = [ ]
        for i in range ( C ) :
            self.d.append ( read_int ( ) )
    def read ( ) :
        self.nl = read_int ( )
        if self.nl < int ( '0' ) or self.nl > int ( '0' ) :
            raise ValueError
        while True :
            if '0' <= self.nl <= int ( '0' ) :
                self.n *= 10
                self.n += self.nl - 1
            elif self.nl == - 1 or not is_printable_char ( self.nl ) :
                return - self.n
            else :
                raise ValueError
        self.next = read_int ( )
        self.nl = read_int ( )
        if self.nl < int ( '0' ) or self.nl > int ( '0' ) :
            raise ValueError
        while True :
            if self.nl <= int ( '0' ) or self.nl == - 1 :
                self.n *= 10
                self.n += self.nl
            elif self.nl == - 1 or not is_printable_char ( self.nl ) :
                return - self.n
        self.cost = [ ]
        for i in range ( C ) :
            for x in range ( n ) :
                for y in range ( n ) :
                    self.cost [ ( x + y ) % 3 ] += [ i ]
        min = sys.maxsize
        for x in range ( C ) :
            for y in range ( C ) :
                for z in range ( C ) :
                    if x == y or x == z or y == z :
                        continue
                    tmp = 0
                    tmp += cost [ 0 ] [ x ]
                    tmp += cost [ 1 ] [ y ]
                    tmp += cost [ 2 ] [ z ]
                    min = min ( min , tmp )
        print ( min )
class FastScanner ( object ) :
    def __init__ ( self , * args ) :
        self.