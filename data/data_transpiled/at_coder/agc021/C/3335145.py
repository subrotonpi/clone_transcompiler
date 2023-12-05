def _ ( ) : pass
def solve ( ) :
    n = ni ( )
    m = ni ( )
    a = ni ( )
    b = ni ( )
    map = [ [ '.' ] * n for v in map ]
    def read ( ) :
        return [ '.' ] * n
    def write ( * args ) :
        start = time.time ( )
        debug = args [ 0 ] if debug else None
        try :
            fp = _open ( debug , 'r' )
        except :
            raise
    def ntable ( n , m ) :
        for i in range ( 1 , n ) :
            a [ i ] = nl ( )
    def write ( * args ) :
        return [ '.' ] * n
    def write ( * args ) :
        for i in range ( 1 , n ) :
            a [ i ] = '^'
    def write ( * args ) :
        for i in range ( 1 , n ) :
            a [ i ] = 'v'
    def write ( * args ) :
        for i in range ( 1 , n ) :
            a [ i ] = '<'
    def write ( * args ) :
        for i in range ( 1 , n ) :
            a [ i ] = '>'
    def write ( * args ) :
        for i in range ( 1 , n ) :
            a [ i ] = '>'
    def write ( * args ) :
        for i in range ( 1 , n ) :
            a [ i ] = '>'
    def write ( * args ) :
        for i in range ( 1 , n ) :
            a [ i ] = '>'
    write ( * args )
    write ( * args )
    write ( * args )
if n % 2 == 1 and m % 2 == 1 and b == 1 and map [ n - 2 ] [ m - 2 ] == '.' :
    write ( 'YES' )
    for line in map :
        write ( * args )
else :
    write ( 'NO' )
