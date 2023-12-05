def _import ( ) :
    from io import BytesIO
    from io import BytesIO
    from io import BytesIO
    from io import BytesIO
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = 0
            self.mo = 1_000_000_000 + 7
            self.fac = [ ]
            self.ifac = [ ]
            self.inv = [ ]
            def read ( self , * args ) :
                self.fac.append ( 1 )
                for i in range ( 1 , len ( self.fac ) ) :
                    self.fac [ i ] = self.fac [ i - 1 ] % mo
                self.inv.append ( 1 )
                for i in range ( 2 , len ( self.inv ) ) :
                    self.inv [ i ] = self.mo - self.inv [ int ( self.mo % i ) ] * ( self.mo // i ) % mo
                self.ifac.append ( 1 )
                for i in range ( 1 , len ( self.ifac ) ) :
                    self.ifac [ i ] = self.ifac [ i - 1 ] * self.inv [ i ] % mo
            def comb ( self , n , k ) :
                return self.fac [ n ] * self.ifac [ n - k ] % mo ** 2
            def g ( self , k ) :
                if 2 * k < n : return 0
                a = 2 * k - n
                b = self.n - k
                return self.comb ( a - 1 + b , b - 1 ) * self.fac [ k ] % mo ** 2
            def f ( self , k ) :
                return ( self.g ( k ) - self.g ( k - 1 ) + mo ) % mo
            def run ( self ) :
                sc = BytesIO ( )
                self.n = int ( sc.read ( ) )
                ans = 0
                for i in range ( ( self.n + 1 ) // 2 , self.n - 1 ) :
                    ans = ( ans + f ( i ) * i % mo ) % mo
                print ( ans )
            def pow ( self , a ) :
                ret = 1
                for n in self.n :
                    if n % 2 == 1 :
                        ret = ret * a %