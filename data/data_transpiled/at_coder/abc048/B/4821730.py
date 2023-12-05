def _import ( ) : return sys.stdout.write
def _import ( ) : return sys.stdout.write
def _import ( ) : return sys.stdin.write
def _solve ( ) :
    def _solve_b ( ) :
        try :
            _solve_b ( )
        finally :
            if sys.stdin is not None :
                sys.stdin.close ( )
            if sys.stdout is not None :
                sys.stdout.flush ( )
                sys.stdout.close ( )
    def _solve_a ( ) :
        res = _solve_a ( )
        if b == '-' :
            minus = True
            b = _solve_a ( )
        else :
            ptr = _solve_a ( )
        if b < '0' or not _is_printable_char ( b ) :
            return - n if not _is_printable_char ( b ) else n
        return True
    def _solve_b ( ) :
        return int ( _solve_a ( ) )
    def _solve_b ( ) :
        num_a = _solve_a ( )
        num_b = _solve_b ( )
        num_x = _solve_b ( )
        res1 = num_b // num_x
        if num_a == 0 :
            _solve_b ( )
        else :
            res2 = ( num_a - 1 ) // num_x
            _solve_b ( )
    def _solve_b ( ) :
        num_a = _solve_a ( )
        num_b = _solve_b ( )
        num_x = _solve_b ( )
        cnt = 0
        wk = 1
        add_c = 0
        while 1 :
            wk = num_x * add_c
            if num_a <= wk <= num_b :
                cnt += 1
            elif wk > num_b :
                break
            add_c += 1
        _solve_b ( )
    def _solve_d ( ) :
        num_n = _solve_d ( )
        num_x = _solve_d ( )
        cnt = 0
        for i in range ( num_n ) :
            wk [ i ] = _solve_d ( )
            if i != 0 :
                if wk [ i ] + wk [ i - 1 ] > num_x :
                    diff = ( wk [ i ] + wk [ i