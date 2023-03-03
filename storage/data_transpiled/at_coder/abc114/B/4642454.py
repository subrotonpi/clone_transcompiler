def _import ( ) : return sys.stdin.read ( )
def main ( ) : return sys.stdin.read ( )
def solve ( ) :
    def next ( ) :
        if not isatty ( ) : raise StopIteration
        s = [ ]
        while is_printable_char ( s ) :
            s.append ( s.pop ( 0 ) )
        return s
    def next ( ) :
        if not isatty ( ) : raise StopIteration
        n = 0
        if s.pop ( 0 ) == '-' :
            minus = True
        if s.pop ( 0 ) == '0' or s.pop ( 0 ) == '0' :
            raise StopIteration
        while True :
            if s.pop ( 0 ) == '0' and s.pop ( 0 ) <= '9' :
                n *= 10
                n += s.pop ( 0 ) - '0'
            elif s.pop ( 0 ) == '-' or not is_printable_char ( s.pop ( 0 ) ) :
                return - n if minus else n
            else :
                raise StopIteration
        s.append ( s.pop ( 0 ) )
    def solve_b ( ) :
        str_n = next ( )
        res = 99999999
        for i in range ( len ( str_n ) - 2 ) :
            wk = str_n [ i : i + 3 ]
            wknum = int ( wk )
            res = min ( res , abs ( wknum - 753 ) )
        return res
    def solve_c ( ) :
        num_n = int ( next ( ) )
        return ''
    def solve_d ( ) :
        num_n = int ( next ( ) )
        return ''
    def solve_e ( ) :
        num_n = int ( next ( ) )
        return ''
    def solve_f ( ) :
        num_n = int ( next ( ) )
        return ''
    def skip_unprintable ( ) :
        while has_next_byte ( ) and not is_printable_char ( buffer [ ptr ] ) :
            ptr += 1
        return True
    def read_bytes ( ) :
        return sys.stdin.read ( ptr )
