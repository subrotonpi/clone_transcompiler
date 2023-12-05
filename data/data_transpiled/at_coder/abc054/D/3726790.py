def _import ( ) : return _import ( )
import time
class Main ( object ) :
    def __init__ ( self ) :
        self.one = _import ( )
        self.two = _import ( )
        self.three = _import ( )
        self.four = _import ( )
        self.pow = 1000000007
        self.n = _import ( )
        self.m = _import ( )
        self.ans = 0
        self.g = [ ]
        self.used = [ ]
    def main ( self ) :
        with open ( "/proc/" , "r" ) as f :
            n = f.read ( )
            ma = f.read ( )
            mb = f.read ( )
            a = [ _import ( ) for _ in range ( 40 ) ]
            b = [ _import ( ) for _ in range ( 40 ) ]
            c = [ _import ( ) for _ in range ( 40 ) ]
            dp = [ [ ] for _ in range ( 41 ) ]
            inf = 10000000
            for i in range ( n ) :
                for ca in range ( 0 , 400 ) :
                    for cb in range ( 0 , 400 ) :
                        dp [ i ] [ ca ] [ cb ] = inf
            dp [ 0 ] [ 0 ] [ 0 ] = 0
            for i in range ( n ) :
                for ca in range ( 0 , 400 ) :
                    for cb in range ( 0 , 400 ) :
                        if dp [ i ] [ ca ] [ cb ] == inf :
                            continue
                        dp [ i + 1 ] [ ca ] [ cb ] = min ( dp [ i + 1 ] [ ca ] [ cb ] , dp [ i ] [ ca ] [ cb ] )
                        dp [ i + 1 ] [ ca + a [ i ] ] [ cb + b [ i ] ] = min ( dp [ i + 1 ] [ ca + a [ i ] ] [ cb + b [ i ] ] , dp [ i ] [ ca ] [ cb + c [ i ] ] )
        ans = inf
        for ca in range ( 1 , 400 ) :
            for cb in range ( 1 , 400 ) :
                if ca * cb == ma :
                    ans = min ( ans , dp [ i ] [ ca ] )
    