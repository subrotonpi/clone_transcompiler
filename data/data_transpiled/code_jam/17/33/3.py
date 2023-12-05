def import _fastopen
import locale
import sys
import os
import sys
import getopt
import locale
import locale
import tokenize
class C1 ( object ) :
    def __init__ ( self ) :
        self.fp = open ( 'C-small-1-attempt0.in' , 'w' )
        self.fp = open ( 'C-small-1-attempt0.out' , 'w' )
        self.EPS = 1e-9
    def solve ( self ) :
        test_no = int ( self.fp.readline ( ) )
        for test in range ( 1 , test_no + 1 ) :
            n , k , u = getopt.Getoptvalue ( self.fp.readline ( ) )
            p = [ ]
            for p in p :
                if p [ 0 ] != test :
                    print ( 'Fuck you' )
                    continue
            while u > EPS :
                p.sort ( )
                t = n
                for i in range ( n - 1 ) :
                    if p [ i ] < p [ i + 1 ] - EPS :
                        t = i + 1
                        break
                if t == n :
                    z = 1
                else :
                    z = p [ t ]
                dv = z - p [ 0 ]
                if dv * t > u :
                    dv = u / t
                for i in range ( t ) :
                    p [ i ] += dv
                u -= dv * t
            ans = 1
            for i in range ( n ) :
                ans *= p [ i ]
            print ( 'Case #%d: %.4f' % ( test , ans ) )
            print ( 'Case #%d: %.4f' % ( test , ans ) )
    def run ( self ) :
        try :
            self.fp = open ( 'C-small-1-attempt0.in' , 'r' )
            self.fp = open ( 'C-small-1-attempt0.out' , 'w' )
            self.solve ( )
            self.fp.close ( )
        except IOError :
            pass
