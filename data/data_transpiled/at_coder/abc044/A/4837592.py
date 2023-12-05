def _import ( ) : return 33 <= c <= 126
def skip_unprintable ( ) : return has_next_byte ( )
def solve ( ) :
    def next ( ) :
        try :
            solve_a ( )
        finally :
            if hasattr ( sys.stdin , 'read' ) :
                sys.stdin.read ( 1 )
            if hasattr ( sys.stdout , 'buffer' ) :
                sys.stdout.flush ( )
                sys.stdout.write ( ''.join ( [ sys.stdin.read ( 1 ) ] ) )
    def solve ( ) :
        try :
            b = read_byte ( )
        finally :
            if not hasattr ( sys.stdin , 'read' ) :
                sys.stdin.close ( )
        if hasattr ( sys.stdout , 'buffer' ) :
            sys.stdout.flush ( )
            sys.stdout.write ( ''.join ( [ sys.stdin.read ( 1 ) ] ) )
    def solve_a ( ) :
        num_n = read_byte ( )
        if b == '-' :
            minus = True
            b = read_byte ( )
        if b < '0' or b <= '9' :
            raise ValueError ( )
        while True :
            if '0' <= b :
                n *= 10
            else :
                n += b - '0'
        if b == - 1 or not is_printable_char ( b ) :
            return - n if minus else n
        else :
            raise ValueError ( )
    def solve_a2 ( ) :
        num_n = read_byte ( )
        num_k = read_byte ( )
        num_x = read_byte ( )
        num_y = read_byte ( )
        res = 0
        for i in range ( 1 , min ( num_n , num_k ) + 1 ) :
            res += num_x
        for i in range ( num_k + 1 , num_n + 1 ) :
            res += num_y
        out.write ( res )
    def solve_b ( ) :
        num_n = read_byte ( )
        out.write ( '' )
    def solve_c ( ) :
        num_n = read_byte ( )
        out.write ( '' )
    def solve_d ( ) :
        num_n = read_byte