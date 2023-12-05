def _import ( ) :
    import math
    import numpy as np
    import random
    class Main ( object ) :
        MODULO = 1_000_000_000 + 7
        def __init__ ( self ) :
            self.pow10 = [ ]
            self.mask = 0
            self.n = 1
            for i in range ( 1 , len ( self.pow10 ) ) :
                self.pow10.append ( 10 ** self.pow10 [ i - 1 ] % MODULO )
            with open ( "../../../api/data/" , "r" ) as f :
                self.n = int ( f.read ( ) )
                self.x = int ( f.read ( ) )
                self.y = int ( f.read ( ) )
                self.z = int ( f.read ( ) )
                self.mask = ( 1 << ( self.x + y + z ) ) - 1
                self.solve ( self.n , self.x , self.y , self.z )
        def solve ( self , n , x , y , z ) :
            dp = [ [ 1 << ( x + y + z ) ] ] * n
            dp [ 0 ] [ 0 ] = 1
            for i in range ( 1 , n + 1 ) :
                for s in range ( 1 << ( x + y + z ) ) :
                    for ne in range ( 1 , 10 ) :
                        ns = ( s << ne | 1 << ( ne - 1 ) ) & mask
                        if self.f ( ns , x , y , z ) :
                            continue
                        dp [ i ] [ ns ] = ( dp [ i ] [ ns ] + dp [ i - 1 ] [ s ] ) % MODULO
        ans = self.pow10 [ n ]
        for v in dp [ n ] :
            ans = ( ans - v + MODULO ) % MODULO
        print ( ans )
    def tr ( self , * args ) :
        ret = True
        ret &= ( ( self.s >> ( z - 1 ) ) & 1 ) > 0
        ret &= ( ( self.s >> ( y + z - 1 ) ) & 1 ) > 0
        ret &= ( ( self.x >> ( x + y + z - 1 ) ) & 1