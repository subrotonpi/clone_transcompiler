def import import _readline , _readline , _sys , _collections
from time import gmtime , time
import sys
import os
import random
import sys
import os
import sys
import os
import tempfile
import struct
import time
import struct
import sys
mod = 1000000007
def main ( ) :
    sc = _readline ( )
    f = sys.stdout
    n , k = sc.randint ( 1 , n )
    id , ans = 0 , 1
    for i , x in enumerate ( sc ) :
        if x == 1 :
            id = i
    if n > k :
        k -= 1
        ans = ( n - 1 ) // k
        if ( n - 1 ) % k != 0 :
            ans += 1
    f.write ( ans )
    f.flush ( )
def db ( * os ) :
    sys.stderr.write ( "".join ( map ( str , os ) ) + "\n" )
def validpos ( x , y , r , c ) :
    return x < r and 0 <= x < c and 0 <= y
def bit ( x , k ) :
    return ( 0 < ( ( x >> k ) & 1 ) ) and True or False
class P ( object ) :
    def __init__ ( self , x , d ) :
        self.x = x
        self.d = d
    def __lt__ ( self , p ) :
        return ( self.d < p.d ) and 1 or - 1
class Reader ( object ) :
    def __init__ ( self , x = None , y = None ) :
        self.x = x
        self.y = y
        self.x = x
        self.d = None
    def readline ( self ) :
        while not self.x or not self.y :
            self.x = x.readline ( )
        return self.x
    def __getitem__ ( self , key ) :
        return int ( key )
    def __getitem__ ( self , item ) :
        return int ( key )
    def __setitem__ ( self , item , value ) :
        self.x = item
        self.y = item
        self.x = item
        self.y = item
