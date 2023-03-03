def _import ( ) : return _import ( sys.stdin , sys.stdout , _import )
import os
import time
import sys
import sys
import os
import sys
import time
import sys
import struct
import math
import time
import time
import sys
import os
import sys
import os
import subprocess
import subprocess
import subprocess
import subprocess
import subprocess
import subprocess
import time
import time
import time
import sys
import subprocess
import subprocess
import subprocess
import subprocess
import os
import sys
import time
import time
import time
import sys
start = time
_out = subprocess
subprocess = subprocess.Popen
subprocess.Popen = subprocess
try :
    while True :
        n = _read_num ( )
        t = 0
        x = 0
        y = 0
        for i in range ( n ) :
            ia = _read_nums ( )
            ti = ia [ 0 ]
            xi = ia [ 1 ]
            yi = ia [ 2 ]
            dt = abs ( ti - t )
            dx = abs ( xi - x )
            dy = abs ( yi - y )
            if dt < dx + dy :
                pl ( "No" )
                return
            dt -= dx + dy
            if dt % 2 == 1 :
                pl ( "No" )
                return
            t = ti
            x = xi
            y = yi
        pl ( "Yes" )
    def _abs ( a ) :
        return ( a >= 0 ) - a
    def _max ( a , b ) :
        return ( a > b ) - a
    def _min ( a , b ) :
        return ( a < b ) - b
    def _pint ( s ) :
        return int ( s )
    def _plong ( s ) :
        return long ( s )
    def _readline ( ) :
        try :
            return _readline ( )
        except OSError :
            return None
    def _pln ( c ) :
        _out.write ( c )
    def _pln ( d ) :
        _out.write ( d )
    def _pln ( l ) :
        _out.write ( l )
    return _pln
