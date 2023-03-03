def import _hash_map
import os
class Main ( object ) :
    MOD = 1000000007
    def __init__ ( self ) :
        self.n = int ( self.n )
        print ( self.f ( n + 1 ) )
    def mb ( self ) :
        memo = self.mb.get ( self.n )
        if memo :
            return memo
        if self.n <= 2 :
            return self.n
        res = self.f ( self.n // 2 ) + self.f ( ( self.n - 1 ) // 2 ) + self.f ( ( self.n + 1 ) // 2 )
        res %= self.MOD
        self.mb [ self.n ] = res
        return res
