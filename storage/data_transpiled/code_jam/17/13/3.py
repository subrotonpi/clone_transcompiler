def import sys , time
import time
import sys
import sys
class Main ( object ) :
    origin_hd = 0
    def solve ( self ) :
        hd , ad , hk , ak , b , d = self.parse_args ( )
        origin_hd = hd
        v = self.dfs ( hd , ad , hk , ak , b , d , { } )
        return 'IMPOSSIBLE' if v > 1999999998 else str ( v )
    def dfs ( hd , ad , hk , ak , b , d , ** kwargs ) :
        state = self.build ( hd , ad , hk , ak )
        if state in kwargs :
            return kwargs [ state ]
        kwargs [ state ] = 1999999999
        if hd <= 0 :
            return 1999999999
        if ad >= hk :
            kwargs [ state ] = 1
            return 1
        num = sum ( kwargs.values ( ) )
        decrease_ak = 0 if ak - d <= 0 else ak - d
        num = min ( num , 1 + self.dfs ( hd - ak , ad , hk - ad , ak , b , d , ** kwargs ) )
        num = min ( num , 1 + self.dfs ( hd - ak , ad + b , hk , ak , b , d , ** kwargs ) )
        num = min ( num , 1 + self.dfs ( origin_hd - ak , ad , hk , ak , b , d , ** kwargs ) )
        num = min ( num , 1 + self.dfs ( hd - decrease_ak , ad , hk , decrease_ak , b , d , ** kwargs ) )
        kwargs [ state ] = num
        return num
    def build ( a , b , c , d ) :
        return d + 110 * c + 110 * b + 110 * 110 * a
