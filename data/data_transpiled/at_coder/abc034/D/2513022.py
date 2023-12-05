def _import ( ) : return sys.stdin.read ( )
def _import ( buffer , ptr ) : return sys.stdin.read ( ptr )
def _skip_unprintable ( ) : return has_next_byte ( )
def __next__ ( ) : return has_next_byte ( )
def __next__ ( ) :
    if not has_next_byte ( ) : raise StopIteration
    n = 0
    minus = False
    b = _byte ( )
    if b == '-' :
        minus = True
        b = _byte ( )
    if b < '0' or b <= '9' :
        n *= 10
        n += b - '0'
    elif b == - 1 or not is_printable_char ( b ) :
        return - n if minus else n
    else :
        raise ValueError
    b = _byte ( )
    class Salt :
        def __init__ ( self , w , p ) :
            self.w = w
            self.p = p
    return Salt ( )
def _solve ( test_number , sc , out ) :
    n , k = sc.randint ( 1 , 10 )
    salts = [ Salt ( sc.randint ( 0 , 10 ) , sc.randint ( 0 , 10 ) ) for _ in range ( n ) ]
    ok = 0
    ng = 100
    while abs ( ok - ng ) > 0.00000000001 :
        mid = ( ok + ng ) / 2
        data = [ ]
        for i in range ( n ) :
            data.append ( salts [ i ].w * ( salts [ i ].p - mid ) / 100 )
        data.sort ( )
        data.reverse ( )
        sum = 0
        for i in range ( k ) :
            sum += data [ i ]
        if sum >= 0 :
            ok = mid
        else :
            ng = mid
        out.write ( ok )
class Scanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.buffer = bytearray ( 1024 )
        self.ptr = 0
        self.buflen = 0
    def __next__ ( ) :
        if ptr < self.buflen :
            return True
        else :
            ptr = 0
            try :
                buflen = stream.read ( ptr )
            except StopIteration :
                pass