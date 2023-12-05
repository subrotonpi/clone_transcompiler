def _import ( ) : return int ( next ( ) )
def main ( ) : return sys.stdin.read ( )
def solve ( ) :
    def solve ( ) :
        try :
            solve_b ( )
        finally :
            if sys.stdin is not None :
                sys.stdin.close ( )
            if sys.stdout is not None :
                sys.stdout.flush ( )
                sys.stdout.close ( )
    def solve ( ) :
        try :
            solve_b ( )
        finally :
            if sys.stdin is not None :
                sys.stdin.close ( )
    def solve ( ) :
        n = 0
        minus = False
        b = read_byte ( )
        if b < '0' or b <= '9' :
            raise ValueError
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return - n if minus else n
            else :
                raise ValueError
            b = read_byte ( )
    def solve_b ( ) :
        num_n = read_byte ( )
        str_s = next ( )
        x = 0
        res = 0
        for c in str_s :
            if c == 'I' :
                x += 1
            elif c == 'D' :
                x -= 1
            res = max ( res , x )
        out.write ( res )
    def solve_c ( ) :
        num_n = read_byte ( )
        out.write ( '' )
    def solve_d ( ) :
        num_n = read_byte ( )
        out.write ( '' )
    def solve_e ( ) :
        num_n = read_byte ( )
        out.write ( '' )
    def solve_f ( ) :
        num_n = read_byte ( )
        out.write ( '' )
    def has_next_byte ( ) :
        while has_next_byte ( ) and not is_printable_char ( buffer [ ptr ] ) :
            ptr += 1
        else :
            ptr = read_byte ( )
    return has_next_byte ( )
