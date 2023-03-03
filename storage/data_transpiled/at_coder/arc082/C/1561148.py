def main ( ) : return
import sys
import getopt
class Main ( object ) :
    def __init__ ( self , x , y ) :
        super ( Main , self ).__init__ ( x , y )
        self.x = x
        self.y = y
    def vm ( a , b , c ) :
        return ( b [ 0 ] - a [ 0 ] ) * ( c [ 1 ] - a [ 1 ] ) - ( b [ 1 ] - a [ 1 ] ) * ( c [ 0 ] - a [ 0 ] )
    def solve ( ) :
        mod = 998244353
        n = len ( sys.stdin.readline ( ) )
        a = [ Point ( sys.stdin.readline ( ) , sys.stdin.readline ( ) ) for i in range ( n ) ]
        pow2 = [ 1 ]
        for i in range ( n + 1 ) :
            pow2 [ i + 1 ] = pow2 [ i ] * 2 % mod
        result = pow2 [ n ] - 1
        for i in range ( n ) :
            result -= 1
            for j in range ( i + 1 , n ) :
                cnt = 0
                for k in range ( j + 1 , n ) :
                    if vm ( a [ i ] , a [ j ] , a [ k ] ) == 0 :
                        cnt += 1
                result -= pow2 [ cnt ]
        out.write ( ( result % mod + mod ) % mod )
    def run ( ) :
        f = open ( sys.stdin.fileno ( ) , 'w' )
        solve ( )
        f.close ( )
    class FastScanner ( object ) :
        def readline ( self ) :
            try :
                f.readline ( )
            except IOError :
                pass
            return f.readline ( )
        def __next__ ( self ) :
            while self.x is None or not self.x :
                try :
                    self.x = int ( self.x )
                except ValueError :
                    pass
            return self.x
