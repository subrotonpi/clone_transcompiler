def _import ( ) : return sys._getframe ( ).f_code.co_name
import os
import sys
import tempfile
import sys
class A ( object ) :
    def __init__ ( self , cnt , val ) :
        self.want_min = 0
        for k in range ( cnt ) :
            self.want_min += val - self.a [ k ]
        for k in range ( cnt , 37 ) :
            if self.a [ k ] <= val :
                self.want_min += val + 1 - self.a [ k ]
    def solve ( self , arg ) :
        self.want_min = 0
        for k in range ( cnt ) :
            if not self.want_min or not self.a [ k ] :
                self.want_min += 1 - self.a [ k ]
        return self.want_min
    def solve ( self ) :
        test_no = self.n
        for test in range ( 1 , test_no + 1 ) :
            print ( "Test %d" % test )
            b = self.b
            n = self.n
            a = [ ]
            sumb = 0
            for i in range ( n ) :
                a.append ( self.a [ i ] )
                sumb += a [ i ]
            a.sort ( )
            ans = 0
            for i in range ( 0 , 37 ) :
                L = self.a [ i ] or 0
                R = b + sumb + 1
                if L >= R or self.eval ( i , L ) > b :
                    continue
                while L < R - 1 :
                    m = ( L + R ) / 2
                    need = self.eval ( i , m )
                    if need > b :
                        R = m
                    else :
                        L = m
                put = [ ]
                total = 0
                for j in range ( 37 ) :
                    if j < i :
                        if a [ j ] <= L :
                            put.append ( L - a [ j ] )
                        else :
                            raise AssertionError
                    else :
                        if a [ j ] < L + 1 :
                            put.append ( L + 1 - a [ j ] )
                    total += put [ j ]
                win = 0
                for i in range