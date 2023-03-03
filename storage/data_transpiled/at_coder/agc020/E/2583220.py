def _import ( ) : return next ( )
def _next ( ) :
    c = _skip_while_space ( )
    while True :
        res = [ next ( ) ]
        c = next ( )
        if c == '-' :
            sgn = - 1
            c = next ( )
        else :
            if c < '0' or c > '9' :
                raise InputError ( )
            res *= 10
            res += c - '0'
            c = next ( )
        if not is_space_char ( c ) :
            return float ( next ( ) )
        else :
            return c
    def _next ( ) :
        c = next ( )
        if c == '' or c == '\n' or c == '\t' or c == - 1 :
            return c
    def _next ( ) :
        return next ( )
    def _next ( ) :
        sgn = 1
        if c == '-' :
            sgn = 0
        else :
            sgn = 0
        while True :
            c = next ( )
            if c == '' :
                sgn = 1
            else :
                sgn = 0
            if c == '' :
                return res * sgn
        return next ( )
    def _next ( ) :
        return next ( )
    def _memo ( ) :
        return { }
    MOD = 998244353
    def dfs ( s ) :
        if s in _memo :
            return _memo [ s ]
        n = len ( s )
        total = 0
        for take in range ( 2 , n + 1 ) :
            left_way = dfs ( s [ take : ] )
            make_way = 0
            for k in range ( 1 , k ) :
                if take % k != 0 :
                    continue
                pl = [ ]
                for i in range ( k ) :
                    one = 1
                    for j in range ( i , k + 1 ) :
                        if s [ j ] == '0' :
                            one = 0
                            break
                    pl.append ( '1' if one == 1 else '0' )
                make_way += dfs ( str ( pl ) )
            make_way %= MOD
            total += left_way * make_way % MOD
        w = 2 if s ==