def _import ( ) : return _import ( )
def _import ( ) : return _import ( )
def _import ( ) : return _import ( )
def _import ( ) : return _import ( )
def main ( ) :
def _import ( ) :
def _import ( ) :
    fh = sys.stdin
    fh = sys.stdout
    fh = sys.stdout
    fh = _import ( fh )
    fh = _import ( fh )
    fh = _import ( fh )
    fh = _import ( fh )
    fh = _import ( fh )
    fh.close ( )
    def is_printable_char ( c ) :
        return c in [ 33 , '\n' , '\r' , c == - 1 ]
    def next ( ) :
        sb = [ ]
        b = read_byte ( )
        while not is_printable_char ( b ) :
            sb.append ( b )
        return sb
    def read ( ) :
        n = 0
        b = read_byte ( )
        while is_printable_char ( b ) :
            b = read_byte ( )
            minus = ( b == '-' )
            if minus : b = read_byte ( )
            for x in range ( w ) :
                bi.set_image ( x , y , s [ x ] == '#' )
        d = bi.dilation ( )
        if not d.erotion ( ).is_same ( bi ) :
            print ( 'impossible' )
        else :
            print ( 'possible' )
        sb = [ ]
        for y in range ( h ) :
            for x in range ( w ) :
                sb.append ( d.get ( x , y ) )
        return sb
    def erotion ( ) :
        rbi = copy ( )
        for x in range ( w ) :
            for y in range ( h ) :
                if not image [ x ] [ y ] :
                    rbi.set_image ( x , y , False )
        return rbi
    return _import ( )
