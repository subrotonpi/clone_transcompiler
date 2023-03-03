def _import ( ) :
    import time
    import sys
    import os
    import sys
    import os
    import time
    import sys
    import os
    import sys
    import time
    import sys
    import math
    import time
    import time
    _int_max = int
    _int_min = int
    _long_max = long
    _long_min = long
    def solve ( ) :
        flds = read_flds ( )
        x = plong ( flds [ 0 ] )
        y = plong ( flds [ 1 ] )
        ans = 0
        while x <= y :
            ans += 1
            x *= 2
        pln ( ans )
    def abs ( a ) :
        return ( a >= 0 ) and ( a <= - a ) or ( a > b )
    def max ( a , b ) :
        return ( a > b ) and ( a <= b ) or ( a < b )
    def min ( a , b ) :
        return ( a < b ) and ( a <= b ) or ( a >= b )
    def pint ( s ) :
        return int ( s )
    def plong ( s ) :
        return long ( s )
    def readline ( ) :
        try :
            return _in.readline ( )
        except EOFError :
            return None
    def read_num ( ) :
        line = raw_input ( )
        return pint ( line )
    def read_flds ( ) :
        line = raw_input ( )
        return line.split ( )
    def read_nums ( ) :
        flds = read_flds ( )
        nums = [ pint ( x ) for x in flds ]
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
    pln ( '' )
    pln ( '' )
    pln ( '' )
    pln ( '' )
    pln ( '' )
    pln ( '' )
    pln ( '' )
