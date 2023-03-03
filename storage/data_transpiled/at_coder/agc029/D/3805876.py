def import _lightscanner
import StringIO
import sys
import os
import string
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex
import shlex = shlex
def main ( ) :
    fh = sys.stdin
    fh = sys.stdout
    fh = sys.stdin
    fh = sys.stdout
    f = light_scanner.light_scanner ( fh )
    fh = open ( fh , 'w' )
    solver = DGridGame ( )
    solver.solve ( 1 , f , fh )
    fh.close ( )
class DGridGame ( ) :
    def solve ( self , test_number , f , fh ) :
        h , w , n = f.ints ( )
        m = { }
        for x , y in zip ( range ( n ) , range ( h ) ) :
            if y <= x :
                if y not in m :
                    m [ y ] = [ ]
                m [ y ].append ( x )
        for e in m.values ( ) :
            e.sort ( key = lambda x : x [ 0 ] )
        ans = h
        minx = 1
        for i in range ( 1 , w + 1 ) :
            rx = h
            if i in m :
                for d in m [ i ] :
                    if d == minx :
                        raise
                    elif d > minx :
                        rx = d - 1
                        if minx == d + 1 :
                            ans = min ( ans , rx - 1 )
                        else :
                            ans = min ( ans , rx )
                        break
            if minx == rx :
                break
            minx += 1
            if i + 1 in m :
                while m [ i + 1 ].isdigit ( ) :
                    ans = m [ i ].isdigit ( )
            else :
                ans = m [ i ].isdigit ( )
        return ans
