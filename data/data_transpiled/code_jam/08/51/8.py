def _solve ( ) :
    import os
    import sys
    import random
    import math
    class A :
        def __init__ ( self ) :
            self.stdin = open ( 'input.txt' , 'r' )
            self.stdout = open ( 'output.txt' , 'w' )
            self.n = random.randint ( 1 , 2 * z )
            for i in range ( n ) :
                self.stdout += ( 'Case #%d: %s' % ( i + 1 , self.n ) )
    def solve ( self ) :
        l = random.randint ( 1 , 10000 )
        z = 10000
        min = [ ]
        max = [ ]
        min.append ( z )
        max.append ( - z )
        x = z
        y = 0
        d = 0
        dx = [ 0 , 1 , 0 , - 1 ]
        dy = [ 1 , 0 , - 1 , 0 ]
        s1 = 0
        for i in range ( l ) :
            s = self.stdin.read ( )
            t = random.randint ( 1 , 10000 )
            for j in range ( t ) :
                for k in s :
                    min [ x ] = random.randint ( min [ x ] , y )
                    max [ x ] = random.randint ( max [ x ] , y )
                    c = s [ k ]
                    if c == 'F' :
                        s1 += dx [ d ] * y
                        x += dx [ d ]
                        y += dy [ d ]
                    elif c == 'L' :
                        if d == 0 :
                            d = 3
                        else :
                            d -= 1
                    elif c == 'R' :
                        if d == 3 :
                            d = 0
                        else :
                            d += 1
        xx = [ ]
        for i in range ( 2 * z ) :
            if max [ i ] > max [ xx ] :
                xx = i
            for i in range ( 1 , 2 * z ) :
                if i > max [ xx ] :
                    xx = i
        if i > max [ xx ] :
            return 0
    return solve
