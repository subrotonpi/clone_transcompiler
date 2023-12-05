def _import ( ) :
    from os import path
    import sys
    MOD = 1000000009L
    def f ( e , n , k ) :
        self.e = e
        self.n = n
        self.k = k
        w = [ False ] * n
    def main ( ) :
        f = open ( "C-large.in" , "r" )
        f.write ( "c.out\n" )
        count = int ( f.readline ( ) )
        for i in range ( 1 , count + 1 ) :
            tz = f.readline ( ).split ( )
            n , k = [ int ( tz [ 0 ] ) for tz in tz ]
            e = [ False ] * n
            for j in range ( n - 1 ) :
                tz = f.readline ( ).split ( )
                x , y = [ int ( tz [ 0 ] ) - 1 for tz in tz ]
                e [ x ] [ y ] = e [ y ] [ x ] = True
            s = C ( e , n , k )
            r = s.solve ( 0 , 0 , 0 )
            print ( "Case #%d: %s" % ( i , r ) , file = sys.stderr )
        f.close ( )
        print ( "Case #%d: %s" % ( i , r ) , file = sys.stderr )
    def solve ( v , dep , bc ) :
        w [ v ] = True
        m = 0
        for i in range ( n ) :
            if e [ v ] [ i ] and not w [ i ] :
                m += 1
        ac = k - bc
        if dep > 1 : ac -= 1
        if ac < m : return 0
        r = 1
        for i in range ( n ) :
            if e [ v ] [ i ] and not w [ i ] :
                r = ( r * ac ) % MOD
                rr = solve ( i , dep + 1 , m )
                r = ( r * rr ) % MOD
                ac -= 1
        return r
    return solve
