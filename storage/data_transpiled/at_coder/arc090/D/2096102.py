def main ( ) :
    def _mod_pow ( a , n , mod ) :
        ret = 1
        mul = a
        for n in range ( n ) :
            if n & 1 == 1 :
                ret = ( ret * mul ) % mod
            mul = ( mul * mul ) % mod
        return ret
    def _solve ( * args ) :
        s = ni ( )
        ret = 0
        mod = 1_000_000_007
        total = 1
        R = 1
        NL , NR , LC , RC = 10 , 1 , 1 , 1
        for i in range ( m ) :
            table [ i ] = _mod_pow ( n , n )
        return table
    def _nlist ( n , m ) :
        for i in range ( m ) :
            for j in range ( m ) :
                table [ i ] = _mod_pow ( n , n )
        return table
    def _tr ( * args ) :
        if args [ 0 ] != '' :
            print ( _mod_pow ( n , m ) )
        return _mod_pow ( n , m )
    def _tr ( * args ) :
        for i in range ( m ) :
            for j in range ( m ) :
                table [ i ] = _n_list ( n , n )
        return _tr ( * args )
    def _tr ( * args ) :
        for i in range ( m ) :
            for j in range ( m ) :
                table [ i ] = _n_list ( n , n )
        return _tr ( * args )
    def _tr ( * args ) :
        for i in range ( m ) :
            for j in range ( m ) :
                table [ i ] = _n_list ( n , n )
        return _tr ( * args )
    def _tr ( * args ) :
        for i in range ( m ) :
            for j in range ( m ) :
                table [ i ] = _n_list ( n , n )
        return _tr ( * args )
    return _tr ( * args )
