def _import ( ) : return sys.stdin.read ( )
def main ( ) :
    def solve ( ) :
        def _solve ( ) :
            try :
                solve_a ( )
            finally :
                if b < '0' or b < '9' :
                    raise ValueError ( )
                while True :
                    if '0' <= b <= '9' :
                        n *= 10
                    elif b == - 1 or not is_printable_char ( b ) :
                        return - n if n else n
                    else :
                        raise ValueError ( )
                b = read_byte ( )
        def _solve_a ( ) :
            x , y = next ( )
            _solve_a ( )
        def _solve_b ( ) :
            num_n = randint ( 1 , 4 )
            _solve_b ( )
        def _solve_c ( ) :
            num_n = randint ( 1 , 4 )
            _solve_c ( )
        def _solve_d ( ) :
            num_n = randint ( 1 , 4 )
            _solve_d ( )
        def _solve_e ( ) :
            num_n = randint ( 1 , 4 )
            _solve_e ( )
        def _solve_f ( ) :
            num_n = randint ( 1 , 4 )
            _solve_f ( )
        import io
        f = io.BytesIO ( )
        f.seek ( 0 )
        data = f.read ( 1024 )
        ptr = 0
        buflen = 0
        def _has_next_byte ( ) :
            if ptr < buflen :
                return True
            else :
                ptr = 0
                try :
                    buflen = f.tell ( )
                except TypeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def _read_byte ( ) :
            if ptr < buflen :
                raise StopIteration ( )
            data = [ ]
            ptr = read_byte ( )
            return data [ ptr ]
        else :
            return False
    def _is_printable_char ( c ) :
        return 33 <= c <= 126
    def _skip_unprintable ( ) :
        while _has_next_byte ( ) and not is_printable_char ( data [ ptr ] ) :
            ptr += 1
    def _skip_unprintable ( ) :
        return _skip_unprintable ( )
        