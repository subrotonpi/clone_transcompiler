def _import ( ) : return int ( _import ( ).split ( ) [ 0 ] )
class B ( object ) :
    PROBLEM = 'B'
    TEST = 'large'
    MAXV = 333
    BESK = sys.maxsize >> 2
    def solve ( self ) :
        d = self.__next__ ( )
        c = self.__next__ ( )
        m = self.__next__ ( )
        n = self.__next__ ( )
        a = [ ]
        for i in range ( n ) :
            a.append ( self.__next__ ( ) )
        r = [ [ ] for _ in range ( n + 1 ) ]
        for z in r :
            a.append ( [ BESK ] )
        r.append ( [ 0 ] )
        for i in range ( n ) :
            for src_p in range ( MAXV ) :
                for dst_p in range ( MAXV ) :
                    cheapest = BESK
                    cost , dif = abs ( dst_p - src_p ) + m - 1 , abs ( dst_p - src_p )
                    if m == 0 :
                        dif = 0 if dst_p == src_p else BESK
                    else :
                        dif /= m
                        dif *= c
                    cost = d + dif
                    cheapest = min ( cheapest , cost )
                    dif = max ( 0 , abs ( dst_p - src_p ) - 1 )
                    if m == 0 :
                        dif = 0 if dst_p == src_p else BESK
                    else :
                        dif /= m
                        dif *= c
                    cost = abs ( a [ i ] - dst_p ) + dif
                    cheapest = min ( cheapest , cost )
                    r [ i + 1 ] [ dst_p ] = min ( r [ i + 1 ] [ dst_p ] , r [ i ] [ src_p ] + cheapest )
        ans = BESK
        for i in range ( 0 , n ) :
            for p in range ( MAXV ) :
                ans = min ( ans , r [ i ] [ p ] + ( n - i ) * d )
        return ans
