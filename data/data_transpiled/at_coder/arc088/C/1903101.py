def _solve ( ) :
    import time
    def _solve ( ) :
        s = ns ( )
        n = len ( s )
        idx = [ 0 ] * 26
        for i in range ( n ) :
            c = s [ i ] - 'a'
            idx [ c ] += 1
    def _solve ( n , m ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( _solve ( ) )
        return a
    def _solve ( n , m ) :
        a = [ ]
        for i in range ( m ) :
            a.append ( _solve ( ) )
        return a
    def _solve ( n , m ) :
        while not _solve ( ) :
            try :
                _solve ( )
            except :
                raise
    def _solve ( n , m ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( _solve ( ) )
        return a
    def _solve ( n , m ) :
        for i in range ( m ) :
            c = s [ i ] - 'a'
            odd = idx [ c ] % 2 == 1
            if odd and oddUsed >= 0 and oddUsed != c :
                print ( - 1 )
                return
            p = ptr [ c ]
            if p < idx [ c ] // 2 :
                map [ i ] = now
                p += 1
            elif odd and p == idx [ c ] // 2 :
                map [ i ] = n // 2
                oddUsed = c
            else :
                inv = idx [ c ] - p - 1
                map [ i ] = n - a [ c ] [ inv ] - 1
            a.append ( map [ i ] )
            ptr [ c ] += 1
        x = [ ]
        for i in range ( n ) :
            x.append ( map [ i ] )
        x = _bump_count ( x , 0 , n )
        print ( x )
    def _bump_count ( a , l , r ) :
        if r - l <= 1 :
            return 0
        m = ( l + r ) // 2
        ret = _bump_count ( a , l , r ) + _bu@@