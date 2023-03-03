def _ _ main _ _ ( ) : return 0
import sys
import random
import time
import random
import sys
class Main ( ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
        n = int ( random.randint ( 0 , 1 ) )
        k = int ( random.randint ( 0 , 1 ) )
        a = [ random.randint ( 0 , 1 ) for i in range ( 1 , n + 1 ) ]
        ans = 0
        for i in range ( 1 , n - k + 1 ) :
            for j in range ( k ) :
                ans += a [ i + j ]
        out.write ( ans )
    def power ( x , n ) :
        mod = 1000000007
        ans = 1
        while n > 0 :
            if n & 1 == 1 :
                ans = ( ans * x ) % mod
            x = ( x * x ) % mod
            n >>= 1
        return ans
    def gcd ( a , b ) :
        while ( a % b ) :
            a , b = b , a
        return b
    class UF ( ) :
        def __init__ ( self ) :
            self.size = 51
        def par ( self ) :
            for i in range ( 1 , self.size ) :
                self.par [ i ] = i
        def root ( self ) :
            if self.par [ x ] == self.par [ x ] :
                return self.par [ x ]
            else :
                return self.par [ x ] = self.root ( self.par [ x ] )
        def same ( self , x , y ) :
            return self.root ( x ) == self.par [ y ]
        def unite ( self , x , y ) :
            x , y = self.root ( x ) , self.root ( y )
            if x == y :
                return self.par [ x ]
            par [ x ] = y
