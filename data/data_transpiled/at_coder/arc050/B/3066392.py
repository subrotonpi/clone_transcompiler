def import import _readline , _readline , _sys , _collections
from time import gmtime , time
import sys
import os
import sys
import inspect
import random
import sys
import inspect
import os
import sys
import os
import tempfile , sys
from collections import defaultdict
from time import time as gmtime
class Main ( object ) :
    mod = 1000000007
    def __init__ ( self ) :
        sc = _readline ( )
        out = sys.stdout
        r , b , x , y = [ int ( x ) for x in sc ]
        low , high = 0 , min ( r , b ) + 1 , md , s , t
        c , d , ans = 0 , 0 , 0 , 0
        for i in range ( 100 ) :
            md = ( low + high ) / 2
            s = ( b - md ) / ( y - 1 )
            t = ( r - md ) / ( x - 1 )
            if md <= s + t :
                ans = md
                low = md
            else :
                high = md
            out.write ( ans )
            out.flush ( )
    def db ( * os ) :
        sys.stderr.write ( "".join ( map ( str , os ) ) + "\n" )
class P ( object ) :
    def __init__ ( self , id , d ) :
        self.id = id
        self.d = d
    def __lt__ ( self , p ) :
        return d - p.d
class Reader ( object ) :
    def __init__ ( self , x = None ) :
        self.x = x
        self.st = None
    def readline ( self ) :
        while not self.st or not self.st :
            self.st = [ ]
        return self.st
    def __getitem__ ( self , key ) :
        return int ( key )
    def long ( self ) :
        return long ( key )
    def double ( self ) :
        return double ( key )
