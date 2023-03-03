def _import ( ) : return sys.stdin
import os
import time
import sys
import time
import sys
import os
import subprocess
import subprocess
import subprocess
import subprocess
import subprocess
import subprocess
import subprocess
import time
import time
_int_max = int
_int_min = int
_long_max = long
_long_min = long
def solve ( ) :
    n = read_num ( )
    ia = read_nums ( )
    ary = [ ia [ i ] for i in range ( n + 2 ) ]
    ans = 0
    for i in range ( 1 , n + 1 ) :
        ans += abs ( ary [ i ] - ary [ i - 1 ] )
    for i in range ( 1 , n + 1 ) :
        ao = abs ( ary [ i ] - ary [ i - 1 ] ) + abs ( ary [ i + 1 ] - ary [ i ] )
        an = abs ( ary [ i + 1 ] - ary [ i - 1 ] )
        pln ( ans - ao + an )
    def abs ( a ) :
        return ( a >= 0 ) and ( a <= 0 ) or - a
    def pint ( s ) :
        return int ( s )
    def plong ( s ) :
        return long ( s )
    def readline ( ) :
        try :
            return subprocess.Popen ( [ 'python' , '-c' , '-d' , '-s' ] , stdout = subprocess.PIPE ).stdout.read ( )
        except OSError :
            raise
    def read_num ( ) :
        line = readline ( )
        return pint ( line )
    def read_flds ( ) :
        line = readline ( )
        return line.split ( )
    def read_nums ( ) :
        flds = read_flds ( )
        nums = [ pint ( f ) for f in flds ]
        return nums
    def p ( c ) :
        _out.write ( c )
    def pln ( c ) :
        _out.write ( c )
    def p ( d ) :
        _out.write ( d )
    return pln
