def _import ( ) : return sys.stdin
import time
import sys
import os
import sys
import time
import sys
class Main ( object ) :
    _int_max = int
    _int_min = int
    _long_max = long
    _long_min = long
    def solve ( self ) :
        ia = self.read_nums ( )
        n , m = ia
        ans = 0
        if n == 1 and m == 1 :
            ans = 1
        elif n == 1 :
            ans = m - 2
        elif m == 1 :
            ans = n - 2
        else :
            ans = long ( n - 2 ) * ( m - 2 )
        self.pln ( ans )
    def abs ( a ) :
        return ( a >= 0 )
    def max ( a , b ) :
        return ( a > b )
    def min ( a , b ) :
        return ( a < b )
    def pint ( s ) :
        return int ( s )
    def plong ( s ) :
        return long ( s )
    def readline ( ) :
        try :
            return self._in.readline ( )
        except AttributeError :
            return None
    def read_num ( ) :
        line = readline ( )
        return pint ( line )
    def read_flds ( ) :
        line = readline ( )
        return line.split ( )
    def read_nums ( ) :
        flds = read_flds ( )
        nums = [ ]
        for i in flds :
            nums.append ( pint ( i ) )
        return nums
    def p ( c ) :
        _out.write ( c )
    def pln ( c ) :
        _out.write ( c )
    def p ( d ) :
        _out.write ( d )
    def pln ( d ) :
        _out.write ( d )
    def pln ( l ) :
        _out.write ( l )
    def pln ( l ) :
        _out.write ( l )
    pln ( pln )
    pln ( pln )
    pln ( pln )
