def import import struct
import sys
import struct
import sys
import struct
import sys
import sys
import struct
import sys
import os
import sys
import struct
import sys
import struct
import sys
import struct
import struct
import sys
mod = 1000000007
def main ( ) :
    sc = sys.stdin
    out = sys.stdout
    n , d = sc.recvfrom ( 1024 )
    ws , w = 0 , 0
    c = sc.read ( ).decode ( 'ascii' )
    for i in range ( n ) :
        if c [ i ] == 'W' : ws += 1
    ans , es = n , 0
    for i in range ( n ) :
        if i > 0 and c [ i - 1 ] == 'W' : w += 1
        if c [ i ] == 'E' : es += 1
        ans = min ( ans , n - ws - es + w )
    out.write ( ans )
    out.flush ( )
def db ( * os ) :
    sys.stderr.write ( ''.join ( map ( str , os ) ) + '\n' )
def validpos ( x , y , r , c ) :
    return x < r and 0 <= x < c and 0 <= y
def bit ( x , k ) :
    return ( 0 < ( ( x >> k ) & 1 ) ) and True or False
class P ( object ) :
    id , d = struct.unpack ( '!H' , x )
    def __init__ ( self , p ) :
        self.id , self.d = p
        self.d = d
    def __lt__ ( self , other ) :
        return self.d < other.d
class Reader ( object ) :
    def __init__ ( self , x = None , y = None ) :
        self.x = x
        self.y = y = None
    def readline ( self ) :
        while not self.x or not self.y :
            self.x = x.readline ( )
        return self.x
    def readline ( self ) :
        return int ( self.x )
