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
def nextLong ( ) :
    if not has_next_byte ( ) : raise StopIteration
    temp = read_byte ( )
    if temp == '-' :
        minus = True
        temp = read_byte ( )
    if temp < '0' or temp <= '9' :
        n *= 10
    else :
        n += 1
    return - n if is_printable ( temp ) else n
def main ( ) :
    out = sys.stdout
    with out.flush ( ) :
        return out
MAX_INT , MIN_INT = sys.maxint , sys.maxint
PI = math.pi
MOD = 1000000007
def max ( * ar ) :
    ar.sort ( )
    return ar [ - 1 ]
def min ( * ar ) :
    ar.sort ( )
    return ar [ 0 ]
def print_pat_int ( ) :
    for i in range ( len ( ar ) ) :
        out.write ( ( '' if i == 0 else ' ' ) + ar [ i ] )
    out.write ( '\n' )
def print_pat_int ( ) :
    for i in range ( len ( ar ) ) :
        out.write ( ar [ i ] )
def print_pat_int ( ) :
    for i in range ( len ( ar ) ) :
        for j in range ( len ( ar [ 0 ] ) ) :
            out.write ( ar [ i ] )
        out.write ( '\n' )
f = sys.stdin
buffer = open ( 'rb'