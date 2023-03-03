def _import ( ) : return sys.stdin.read ( 1024 )
class Main ( object ) :
    def __init__ ( self , * args ) :
        super ( Main , self ).__init__ ( * args )
    def read ( self ) :
        sc = FastScanner ( )
        N = sc.read ( )
        K = sc.read ( )
        a = [ ]
        b = [ ]
        while b [ 0 ] == '-' :
            b = b [ 1 ]
        if b [ 0 ] == '-' :
            n = True
            b = b [ 0 ]
        elif b [ 0 ] == '-' or not is_printable_char ( b ) :
            return ( - n if is_printable_char ( b ) else n )
        else :
            raise ValueError ( )
        b = read_int ( )
        while is_printable_char ( b ) :
            b = read_int ( )
        return b
    def read ( self ) :
        if not is_printable_char ( b ) :
            raise StopIteration
        while b [ 0 ] == '-' :
            n *= 10
        elif b [ 0 ] == '-' or not is_printable_char ( b ) :
            return ( - n if is_printable_char ( b ) else n )
        b = read_int ( )
    def write ( self , b ) :
        b = read_int ( )
        if b [ 0 ] == '-' :
            minus = True
            b = b [ 1 ]
        elif b [ 0 ] == '-' or not is_printable_char ( b ) :
            return ( - n if is_printable_char ( b ) else n )
        else :
            raise StopIteration
        b = read_int ( )
    def write ( self , b ) :
        b = read_int ( )
        if b [ 0 ] == '-' :
            minus = True
            b = b [ 1 ]
        elif b [ 0 ] == '-' or not is_printable_char ( b ) :
            return ( - n if is_printable_char ( b ) else n )
        else :
            raise StopIteration
        b = read_int ( )
    def write ( self , b ) :
        b = read_int ( )
