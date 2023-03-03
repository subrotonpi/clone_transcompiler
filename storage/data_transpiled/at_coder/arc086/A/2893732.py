def import import struct
import sys
import struct
import sys
import struct
import struct
import sys
import struct
import struct
import sys
import struct
import sys
import struct
import sys
import struct
import struct
import sys
import struct
import struct
import sys
import struct
import struct
import sys
import struct
import struct
import struct
import sys
mod = 1000000007
def main ( ) :
    sc = sys.stdin
    out = sys.stdout
    n , k = sc.recv_size ( )
    d = struct.unpack ( '>i' , 200010 )
    c , x = 0 , 0
    sort ( d )
    for i in range ( len ( d ) ) :
        if d [ i ] :
            if c < 1 :
                c = i
            x += 1
    ans = 0
    if x > k :
        for i in range ( 1 , x - k + 1 ) :
            ans += d [ c ]
            c += 1
    out.write ( ans )
    out.flush ( )
def db ( * os ) :
    sys.stderr.write ( ''.join ( map ( str , os ) ) + '\n' )
def validpos ( x , y , r , c ) :
    return x < r and 0 <= x < c and 0 <= y < c
def bit ( x , k ) :
    return ( 0 < ( ( x >> k ) & 1 ) ) and True or False
class P ( struct.Struct ) :
    def __init__ ( self , data = None ) :
        self.data = data
        self.data = data
        self.pos = None
    def read ( self ) :
        return self.data.read ( self.data.count ( ) )
class Reader ( object ) :
    def __init__ ( self , x = None ) :
        self.x = x
        self.data = x
        self.pos = None
    def readline ( self ) :
        while not self.data or not self.data :
            self.data = x.readline ( )
        return self.data
