def main ( ) : return
import sys
import os
import sys
import random
import time
import sys
import os
import sys
import sys
class R2 ( ) :
    def __init__ ( self ) :
        sys.stdout = sys.stdout = sys.__stdout__
        sys.stdout = sys.__stdout__
    def solve_one ( self , prefix ) :
        c = randint ( 1 , 10000 )
        d = randint ( 1 , 10000 )
        x = [ randint ( 1 , 10000 ) for _ in range ( c ) ]
        v = [ randint ( 1 , 10000 ) for _ in range ( c ) ]
        sum = 0
        for i in range ( c ) :
            x [ i ] = randint ( 1 , 10000 )
            v [ i ] = randint ( 1 , 10000 )
            sum += v [ i ]
        if sum == 1 :
            self.stdout.write ( "%s 0.0" % ( prefix ) )
            return
        min , max = 0 , float ( sum - 1 ) * d
        for it in range ( 100 ) :
            mid = ( min + max ) / 2
            cx = x [ 0 ] - mid
            ok = True
            for i in range ( c ) :
                if cx < x [ i ] - mid :
                    cx = x [ i ] - mid
                if abs ( cx - x [ i ] ) > mid :
                    ok = False
                    break
                cx += float ( d ) * ( v [ i ] - 1 )
                if abs ( cx - x [ i ] ) > mid :
                    ok = False
                    break
                cx += d
            if ok :
                max = mid
            else :
                min = mid
        self.stdout.write ( "%s %s\n" % ( prefix , min ) )
    def run ( self ) :
        f = open ( "B.in" , "r" )
        f.write ( "B.out" )
        self.n_tests = randint ( 1 , 10000 )
        for i in range ( 1 , n_tests + 1 ) :
            self.solve_one ( "Case #%d:" % i )
        f.close ( )
        f.close ( )
        return
