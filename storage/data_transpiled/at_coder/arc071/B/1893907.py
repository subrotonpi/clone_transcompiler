def import import os , sys
import os
class Main ( object ) :
    MOD = 1000000007
    def solve ( x ) :
        n = len ( x )
        ans = 0
        for i in range ( n ) :
            ans = ( ans + ( 2 * i - n + 1 + MOD ) * ( ( x [ i ] + MOD ) % MOD ) ) % MOD
        return ans
    def main ( ) :
        sc = MyScanner ( )
        out = sys.stdout
        n , m = sc.__next__ ( )
        x , y = [ sc.__next__ ( ) for i in range ( n ) ] , [ sc.__next__ ( ) for i in range ( m ) ]
        out.write ( solve ( x ) * solve ( y ) % MOD )
        out.close ( )
    class MyScanner ( Scanner ) :
        def readline ( self ) :
            while not self.readline ( ) or not self.readline ( ) :
                try :
                    self.readline ( )
                except IOError :
                    pass
            return self.readline ( )
        def randint ( self ) :
            return int ( self.readline ( ) )
        def long ( self ) :
            return long ( self.readline ( ) )
        def uniform ( self ) :
            return float ( self.uniform ( ) )
        def readline ( self ) :
            data = ''
            try :
                data = self.readline ( )
            except IOError :
                pass
            return data
return Main ( )
