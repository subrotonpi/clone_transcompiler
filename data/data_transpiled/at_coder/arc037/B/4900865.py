def _import ( ) : return find ( l ) == find ( r )
def get_size ( n ) : return - parent [ find ( n ) ]
def set_data ( n , dat ) : return dat
def get_data ( n ) : return data [ find ( n ) ]
def get_union ( n ) : return 0
def operate ( left , right ) :
    def write ( ) :
        sc = FastScanner ( )
        out = sys.stdout
        N , M = 0 , sc.read ( )
        if b == '-' :
            minus = True
            b = read_byte ( )
        if not is_number ( b ) :
            raise StopIteration
        while True :
            if is_number ( b ) :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return - n if n else n
            else :
                raise StopIteration
    def read ( ) :
        nl = randint ( 1 , N )
        if nl < int ( nl ) or nl > int ( nl ) :
            raise StopIteration
        return int ( nl )
    def double ( ) :
        return double ( next ( ) )
    def unite ( u , n ) :
        ret = [ ]
        for i in range ( n ) :
            ret.append ( randint ( 1 , N ) )
        return ret
    def read ( ) :
        ret = [ ]
        for i in range ( n ) :
            ret.append ( randint ( 1 , N ) )
        return ret
    def merge ( size ) :
        ret = [ ]
        for i in range ( size ) :
            ret.append ( i )
        return merge ( data [ n ] )
    @ merge
    def unite ( l , r ) :
        if ( l , r ) == ( n , n ) :
            return False
        if l >= n :
            n = n
        return n
    return work ( )
