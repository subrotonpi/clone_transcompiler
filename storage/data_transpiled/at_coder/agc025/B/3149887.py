def _ import _ , SPACETOKEN sys.modules [ '__main__' ]
class Main ( object ) :
    def __init__ ( self ) :
        self.maxN = 300000 + 5
        self.Mod = 998244353
        self.frac = [ ]
        self.inv = [ ]
    def main ( self ) :
        with open ( self.filename ) as sc :
            N = sc.readline ( ).strip ( )
            A = sc.readline ( ).strip ( )
            B = sc.readline ( ).strip ( )
            K = sc.readline ( ).strip ( )
            res = [ ]
            self.initial ( )
            for a in range ( 0 , N + 1 ) :
                if K - int ( a ) * A == 0 :
                    res.append ( self.com ( N , a ) )
                    continue
                if ( K - int ( a ) * A ) % B != 0 :
                    continue
                b = ( K - int ( a ) * A ) / int ( B )
                if b < 0 or b > N :
                    continue
                res.append ( self.com ( N , a ) * self.com ( N , int ( b ) ) % Mod )
        ans = 0
        for i in range ( 0 , N + 1 ) :
            ans = ( ans + res [ i ] ) % Mod
        print ( ans )
    def QucikPower ( a , pow ) :
        ans = 1
        base = a
        while pow != 0 :
            if pow % 2 == 1 :
                ans = ans * base % Mod
                base = base ** mod
                pow /= 2
        return ans
    def initial ( ) :
        self.frac [ 0 ] = 1
        for i in range ( 1 , maxN + 1 ) :
            self.frac [ i ] = ( self.frac [ i - 1 ] * i ) % Mod
        self.inv [ 0 ] = 1
        self.inv [ maxN ] = QucikPower ( self.frac [ maxN ] , Mod - 2 )
        for i in range ( maxN - 1 , 1 , - 1 ) :
            self.inv [ i ] = self.inv [ i + 1 ] * ( i + 1 ) % Mod
