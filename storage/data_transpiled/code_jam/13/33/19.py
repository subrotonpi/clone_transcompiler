def import _open , time , time , r , t , n , h
class task_C :
    def __init__ ( self ) :
        self.f = open
        self.f = open
        self.f = open
        self.f = open
        self.f.readline = time
        self.f.readline = time
        self.f.readline = time
        self.f.readline = time
        self.f.readline = time
        self.f.readline = time
        self.f.readline = time
        self.f.readline = time
        self.f.readline = time
        self.f.readline = time
        self.f.readline = time
        self.f.readline = time
        self.f.readline = time
        self.f.readline = time
        self.f.readline = time
        self.f.readline = time
        self.f.readline = time
        self.f.readline = time
        self.f.readline = time
    def solve ( ) :
        n = time.time ( )
        ats = [ ]
        for i in range ( n ) :
            d , c , l , r , s = [ int ( i ) for i in range ( n ) ]
            dd , dp , ds = [ int ( i ) for i in range ( n ) ]
            for j in range ( c ) :
                ats.append ( Attack ( d + j * dd , l + dp * j , r + dp * j , s + ds * j ) )
        ats.sort ( )
        n = len ( ats )
        h = [ ]
        ans = 0
        for i in range ( n ) :
            t = i
            while t < n and ats [ t ].d == ats [ i ].d : t += 1
            for j in range ( i , t ) :
                for k in range ( ats [ j ].l , ats [ j ].r ) :
                    h [ k + 500 ] = max ( ats [ j ].s , ats [ k ].s )
        return ans
