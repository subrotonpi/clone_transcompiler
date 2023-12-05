def main ( ) :
    import time
    import sys
    import sys
    class A ( ) :
        def solve ( self ) :
            n , p = self.n , self.p
            sum = 0
            g = [ 0 ] * 4
            for i in range ( n ) :
                gg = self.n % p
                sum += gg
                g [ gg ] += 1
            sum %= p
            dp = [ [ int ( x ) for x in self.g ] for x in open ( s ) ]
            dp [ 0 ] [ 0 ] [ 0 ] = 1
            for p1 in range ( 0 , g [ 1 ] ) :
                for p2 in range ( 0 , g [ 2 ] ) :
                    for p3 in range ( 0 , g [ 3 ] ) :
                        for m in range ( p ) :
                            val = dp [ m ] [ p1 ] [ p2 ] [ p3 ]
                            if p1 + 1 <= g [ 1 ] :
                                new_m = ( m + 1 ) % p
                                dp [ new_m ] [ p1 + 1 ] [ p2 ] [ p3 ] = max ( dp [ new_m ] [ p1 + 1 ] [ p2 ] [ p3 ] , val + ( new_m , ) )
                            if p2 + 1 <= g [ 2 ] :
                                new_m = ( m + 2 ) % p
                                dp [ new_m ] [ p1 ] [ p2 + 1 ] [ p3 ] = max ( dp [ new_m ] [ p1 ] [ p2 + 1 ] [ p3 ] , val + ( new_m , ) )
                            if p3 + 1 <= g [ 3 ] :
                                new_m = ( m + 3 ) % p
                                dp [ new_m ] [ p1 ] [ p2 ] [ p3 + 1 ] = max ( dp [ new_m ] [ p1 ] [ p2 ] [ p3 + 1 ] , val + ( new_m , ) )
        ans = dp [ sum ] [ g [ 1 ] ] [ g [ 2 ] ] [ g [ 3 ] ] + g [ 0 ]
        if sum == 0 :
            ans -= 1
        print ( ans )
