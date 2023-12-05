def y2010.finals ( ) :
    import os
    import sys
    import random
    import math
    import random
    import random
    import os.path
    import random
    class D2 ( object ) :
        def __init__ ( self ) :
            self.f = random.random ( )
            self.res = 0
        def solve ( self , x , s , j , r , c , d ) :
            if self.j + ( self.n - self.i ) < self.d :
                return
            if self.j - ( self.n - self.i ) > self.d :
                self.r [ 0 ] = self.s
                self.c += 1
                return
            ss = s + ( x [ - 1 ] - x [ - 1 ] ) * 2 * j
            if self.j > 1 :
                bt ( x , n , i + 1 , ss , j - 1 , r , c , d )
                bt ( x , n , i + 1 , ss , j + 1 , r , c , d )
            return
    def solve ( self ) :
        n = self.n
        x = [ random.random ( ) for i in range ( n ) ]
        f = random.random ( )
        x.sort ( )
        n1 = n // 2
        n2 = n - n1
        x1 = [ x [ i ] for i in range ( n1 ) ]
        x2 = [ - x [ n - i - 1 ] for i in range ( n2 ) ]
        r1 = random.random ( )
        r2 = random.random ( )
        c1 = [ 0 ]
        c2 = [ 1 ]
        res = - 1
        for d in range ( 1 , n1 + 1 ) :
            zz = d * 2 * ( - x2 [ n2 - 1 ] - x1 [ n1 - 1 ] )
            c1.sort ( )
            c2.sort ( )
            r1.sort ( )
            r2.sort ( )
            if c1 [ 0 ] + r2 [ 0 ] > self.f :
                continue
            c1.sort ( )
            r2.sort ( )
            if c2 [ 0 ] + r2 [ 0 ] > self.f :
                break
            res = max ( res , r1 [ 0 ] + r2 [ 0 ] + zz )
        return res
    return 'NO SOLUTION' if res