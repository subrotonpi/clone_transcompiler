def _import ( ) : return sys.stdin.read ( )
def main ( ) :
    def solve ( ) :
        def _solve ( ) :
            try :
                solve_a ( )
            finally :
                if b < '0' or b <= '9' :
                    raise ValueError ( )
                while True :
                    if '0' <= b <= '9' :
                        n *= 10
                        n += b - '0'
                    elif b == - 1 or not is_printable_char ( b ) :
                        return - n if n else 0
                    else :
                        raise ValueError ( )
        def _solve_a ( ) :
            num_a = randint ( 0 , 10 )
            num_b = randint ( 0 , 10 )
            num_c = randint ( 0 , 10 )
            num_d = randint ( 0 , 10 )
            _solve ( )
        def _solve_b ( ) :
            num_b = randint ( 0 , 10 )
            _solve ( )
        def _solve_c ( ) :
            num_d = randint ( 0 , 10 )
            _solve ( )
        def _solve_d ( ) :
            num_d = randint ( 0 , 10 )
            _solve ( )
        def _solve_e ( ) :
            num_d = randint ( 0 , 10 )
            _solve ( )
        def _solve_f ( ) :
            num_d = randint ( 0 , 10 )
            _solve ( )
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
    def _readline ( ) :
        if ptr < buflen :
            raise StopIteration ( )
        data = [ ]
        ptr = ptr + 1
        return data
    def _is_printable_char ( c ) :
        return 33 <= c <= 126
    def _skip_unprintable ( ) :
        while _has_next_byte ( ) and not is_printable_char ( data [ ptr ] ) :
            ptr += 1
    return _solve , ptr