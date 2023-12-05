def _main ( ) :
    import sys
    import random
    mod = 1000000007
    class Main ( object ) :
        def __init__ ( self ) :
            self.h = [ ]
            self.dp1 , self.dp2 = [ ] , [ ]
        def __init__ ( self , w , h ) :
            self.w = w
            self.h = h
        def dfs ( self , l , r , base ) :
            if r - l == 0 :
                return None
            minh = sum ( [ min ( minh , h ) for h in self.h ] )
            minl = l
            w = - 1
            nodelist = [ ]
            for i in range ( l , r + 1 ) :
                if i == r or h [ i ] == minh :
                    w += 1
                    if minl != i : nodelist.append ( dfs ( minl , i , minh ) )
                    minl = i + 1
            node = Node ( long ( w ) , minh - base )
            node.child = nodelist
            return node
        def pow ( a , p , mod ) :
            res = 1
            for i in range ( 64 ) :
                if ( ( p >> i ) & 1 ) == 1 :
                    res = ( res * a ) % mod
                a = ( a ** p ) % mod
            return res
        def culc ( self ) :
            if self.child == [ ] :
                self.dp1 = pow ( 2 , self.h , mod )
                self.dp2 = ( pow ( 2 , self.w , mod ) - 2 + mod ) % mod
            else :
                dp1 = 1
                dp2 = 1
                for c in self.child :
                    culc ( c )
                    dp1 = ( dp1 * c.dp1 ) % mod
                    dp2 = ( dp2 * ( c.dp1 * 2 + c.dp2 ) ) % mod
                dp2 = ( dp2 - dp1 * pow ( 2 , self.h , mod ) ) % mod + mod
                self.dp1 = ( dp1 * pow ( 2 , self.w , mod ) ) % mod
                self.dp2 = ( dp2 * pow ( 2 , self.w , mod ) ) % mod
    return Main