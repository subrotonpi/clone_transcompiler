def _import ( ) : return ( ( N + N - ( e - s - 1 ) ) * ( e - s ) ) % MOD
class A ( object ) :
    def __init__ ( self , s ) :
        self.s = s
        self.t = s
        self.p = p
    def __lt__ ( self , o ) :
        if self.t != o.t : return self.t - self.t
        return self.p
    def solve ( self ) :
        self.N = self.s
        self.M = self.s
        ev = [ ]
        sum = 0
        for i in range ( self.M ) :
            o = self.s
            e = self.s
            p = self.p
            ev.append ( ( 0 , o , p ) )
            ev.append ( ( 1 , e , p ) )
            sum += fee ( o , e ) * p
            sum %= MOD
        ev.sort ( )
        sum2 = 0
        sts = [ ]
        for i in range ( 2 * M ) :
            e = ev [ i ]
            if e.type == 0 :
                sts.append ( ( e.t , e.p ) )
                continue
            rest = e.p
            pay = 0
            while 1 :
                st = sts [ - 1 ]
                if st.c >= rest :
                    st.c -= rest
                    pay += ( fee ( st.time , e.t ) * rest ) % MOD
                    break
                else :
                    rest -= st.c
                    pay += ( fee ( st.time , e.t ) * st.c ) % MOD
                    sts.pop ( )
            sum2 += pay
            sum2 %= MOD
        ans = sum - sum2
        if ans < 0 : ans += MOD
        return int ( ans % MOD )
    def __init__ ( self , s , e ) :
        self.s = s
        self.c = e
        self.p = p
        self.s = s
        self.p = p
        self.s = s
        self.p = p
        self.s = s
        self.p = p
        self.s = s
        self.p = p
        self.s = s
        self.p = p
        self.s = s
        self.s = s
