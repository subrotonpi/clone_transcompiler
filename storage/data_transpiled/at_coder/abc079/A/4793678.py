def _import ( ) : return 33
def _import ( ) : return int ( next ( ) )
def _import ( ) :
def _solve ( ) :
    def _readline ( ) :
        if not _PY3 : raise StopIteration ( )
        s = [ ]
        b = _readline ( )
        while is_printable_char ( b ) :
            s.append ( b )
        return s
    def _readline ( ) :
        if not _PY3 : raise StopIteration ( )
        n = 0
        if b == '-' :
            minus = True
        if b < '0' or b < '9' :
            raise ValueError ( )
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return - n if n else n
            else : raise ValueError ( )
        b = _readline ( )
    def _chkA ( num ) :
        is_goodnum = False
        cnt = 0
        previous = 0
        for i in range ( 0 , num ) :
            if i == 0 :
                previous = num % 10
                num /= 10
                cnt = 1
            else :
                current = num % 10
                if previous == current :
                    cnt += 1
                else :
                    cnt = 1
                previous = current
                num /= 10
            if cnt == 3 :
                is_goodnum = True
        return is_goodnum
    def _solve_b ( ) :
        num_n = _readline ( )
        out.write ( '' )
    def _solve_c ( ) :
        num_n = _readline ( )
        out.write ( '' )
    def _solve_d ( ) :
        num_n = _readline ( )
        out.write ( '' )
    def _solve_e ( ) :
        num_n = _readline ( )
        out.write ( '' )
    def _solve_f ( ) :
        num_n = _readline ( )
        out.write ( '' )
    def _solve_g ( ) :
        while _has_next_byte ( ) and not is_printable_char ( ) :
            ptr += 1
        else :
            ptr += 1
        return ptr , num_n
    return _solve