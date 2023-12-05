def _import ( ) : return sys.stdout.write
import time
import os
import getopt
class C :
    def __init__ ( self , f , * args ) :
        self.p = args [ 0 ]
        self.s = args [ 1 ]
        self.ds = args [ 2 ]
    def __call__ ( self , o ) :
        if self.p < o.p :
            return - 1
        if self.p > o.p :
            return 1
        if self.s < o.s :
            return - 1
        return 0
    def readline ( self ) :
        return int ( self.next )
    def eval ( self , d ) :
        have_m = m - d * f
        one_m = have_m / d
        left = have_m - one_m * d
        days = 0
        for i in range ( n ) :
            b = one_m / a [ i ].p
            if b > a [ i ].s - days :
                b = a [ i ].s - days
            if b < 0 :
                b = 0
            days += b
            one_m -= b * a [ i ].p
        left += one_m * d
        x_days = 0
        for i in range ( n ) :
            if a [ i ].s > days :
                x_days = left / a [ i ].p
                left -= x_days * a [ i ].p
                break
        have = days * d + x_days
        return have
    def solve ( self ) :
        test_no = self.n
        for test in range ( 1 , test_no + 1 ) :
            print ( "Test %d" % test )
            m , f , n = self.n , self.n
            a = [ ( f , i + 1 ) for i in range ( n ) ]
            a.sort ( )
            prev = 0
            best = 0
            L = 1
            R = m / f
            while L + 10 < R :
                x1 = ( L * 2 + R ) / 3
        return a
