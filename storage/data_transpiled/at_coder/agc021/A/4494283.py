def _import ( ) : return 33 <= n
def skip ( ) : return has_next_byte ( )
def next ( ) : return has_next_byte ( )
def next ( ) : return has_next_byte ( )
def next ( ) : return has_next_byte ( )
def next ( ) : return has_next_byte ( )
def next ( ) :
def next ( ) :
    if not has_next_byte ( ) : raise StopIteration
    s = [ ]
    while is_printable ( s ) :
        s.append ( s.pop ( 0 ) )
    return s
def next_int ( ) :
    ar = [ ]
    for i in range ( n ) : ar.append ( randint ( 0 , 9 ) )
    return ar
def next ( ) :
    if not has_next_byte ( ) : raise StopIteration
    temp = read_int ( )
    if temp == '-' :
        minus = True
        temp = read_int ( )
    else :
        temp = read_int ( )
    return - n if is_printable ( temp ) else n
def main ( ) :
    out = sys.stdout
    with out.write ( '\n' )
    main ( )
    out.flush ( )
MAX_INT , MIN_INT = sys.maxint , sys.maxint
PI = math.pi
MOD = 1000000007
def max ( * ar ) :
    ar.sort ( )
    return ar [ - 1 ]
def min ( * ar ) :
    ar.sort ( )
    return ar [ 0 ]
def print_pl ( * ar ) :
    for i in range ( len ( ar ) ) :
        out.write ( ar [ i ] )
def print_pl ( * ar ) :
    for i in range ( len ( ar ) ) :
        out.write ( ar [ i ] )
def print_pl ( * ar ) :
    for i in range ( len ( ar ) ) :
        for j in range ( len ( ar [ 0 ] ) ) :
            out.write ( ar [ i ] [ j ] )
        out.write ( '\n' )
f = sys.stdin
buffer = ''
length , p = 0 , 0
def has_next_byte ( ) :
    if p < length : return True