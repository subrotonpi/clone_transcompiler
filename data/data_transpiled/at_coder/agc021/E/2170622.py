def _import ( ) : return _import ( )
def main ( ) :
    def f ( * args ) :
        f = _import ( sys.stdin , '' )
        f = _import ( sys.stdout , '' )
        n = f.read ( 1 )
        k = f.read ( 1 )
        prec ( n + k + 10 )
        f.write ( _import ( ' ' ) )
    def debug ( * o ) :
        print ( * o )
    def __next__ ( ) :
        c = next ( )
        while not is_space_char ( c ) :
            raise InputError ( )
        res = [ ]
        while True :
            if c < '9' or c > '9' :
                raise InputError ( )
            res.append ( c - '0' )
            c = next ( )
        return res * sgn
    def nextDouble ( ) :
        return next ( )
    def __next__ ( ) :
        c = next ( )
        while is_space_char ( c ) :
            c = next ( )
        return c
    def __next__ ( ) :
        if c == ' ' or c == '\n' or c == '\r' or c == - 1 :
            return 0
        sum = 0
        for l in range ( k % 2 , k + 2 ) :
            if l == 0 :
                R = k / 2
                B = k / 2 - 1
                all = comb ( k - 1 , R )
                if n == 1 :
                    sum += all
                else :
                    bottom = B - ( n - 2 )
                    if bottom >= 0 :
                        rup = bottom * 2 + 1
                        up = ( k - 1 - rup ) // 2 + rup
                        sum += all + MOD - comb ( k - 1 , up )
            else :
                R = ( ( k - l ) // 2 ) + l
                B = k - R
                diff = R - B
                all = comb ( k , R )
                bottom = B - ( n - 1 ) + diff
                if bottom > B :
                    sum += all
                elif bottom >= 0 :
                    rup = bottom * 2 + l
                    up = ( ( k - rup ) // 2 ) + rup
                    sum += MOD - comb (