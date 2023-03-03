def import import struct
import sys
import struct
import sys
import struct
import sys
import sys
import struct
import sys
import sys
import os
import sys
import struct
import sys
import struct
import sys
import struct
import sys
import struct
import sys
mod = 1000000007
def main ( ) :
    sc = sys.stdin
    out = sys.stdout
    n = sc.randint ( 0 , 1000000007 )
    k = sc.randint ( 0 , 1000000007 )
    a = [ ]
    d = [ 0 ] * 50
    s = 0
    for i in range ( len ( a ) ) :
        a [ i ] = sc.randint ( 0 , 1000000007 )
    for i in range ( len ( d ) ) :
        for t in range ( len ( a ) ) :
            d [ i ] += ( a [ t ] >> i ) % 2
    e = 0
    for i in range ( 49 , - 1 , - 1 ) :
        if d [ i ] <= n / 2 and ( e | ( 1 << i ) ) <= k :
            e |= 1 << i
    for i in range ( len ( a ) ) :
        s += e ^ a [ i ]
    out.write ( s )
    out.flush ( )
def validpos ( x , y , r , c ) :
    return x < r and 0 <= x < c and 0 <= y
class db ( struct.DictReader , sys.stdout ) :
    def __init__ ( self , x = None , y = None , r = None , c = None ) :
        self.x = x
        self.y = y
        self.r = None
        self.c = None
    def readline ( self ) :
        while not self.x or not self.y :
            self.x = self.x.readline ( )
        return self.x
    def select ( self , size ) :
        r = [ ]
        for i in range ( size ) :
            r.append ( self.x [ i ] )
        return r
