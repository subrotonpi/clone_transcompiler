def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        n = sc.recv_bytes ( )
        x = self.read ( sc )
        g = self.read ( sc )
        for i in range ( 1 , n ) :
            t = self.read ( sc )
            g = self.read ( sc )
        while ( start < len ( g ) ) and c [ start ] == 0 :
            start += 1
        return [ ]
    def count ( self , x ) :
        if len ( x ) < len ( g ) :
            return 0
        if len ( x ) == len ( g ) :
            for i in range ( len ( x ) ) :
                if x [ i ] != g [ i ] :
                    if x [ i ] > g [ i ] :
                        return 1
                    else :
                        return 0
            return 1
        mod = 998244353
        res = 0
        c = 1
        for i in range ( 0 , len ( x ) - len ( g ) + 1 ) :
            res = res * 2 % mod
            res += x [ i ]
        res -= 1
        rem = self.remainder ( x , g )
        y = [ ]
        for i in rem [ - 1 ] :
            y.append ( i + ( len ( x ) - len ( rem ) ) )
        return res + count ( x , y )
    def modpow ( self , a , b , mod ) :
        res = 1
        c = a
        while b > 0 :
            if b % 2 == 1 :
                res = res * c % mod
                c = c * c % mod
                b //= 2
            return res
        return 1
    def read ( sc ) :
        str = _main ( )
        n = len ( str )
        res = [ ]
        for i in range ( n ) :
            d = self.read ( sc )
            if not d :
                return c
            c = self.read ( sc )
        return d
