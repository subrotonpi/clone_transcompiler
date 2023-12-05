def _import ( ) : return sys.stdin.read ( )
import os
from sys import byteorder
from itertools import repeat
from itertools import chain
from itertools import repeat
from itertools import chain
from itertools import chain
from itertools import repeat
class Main ( object ) :
    def __init__ ( self , stream , repeat ) :
        self.stream = stream
        self.stream = stream
        self.stream = stream
        self.repeat = repeat
        self.stream = stream
        self.stream = stream
        self.stream = stream
        self.chain = repeat
    def read ( self ) :
        nl = next ( self.stream )
        if nl < int ( self.stream ) or self.stream.read ( 1 ) > self.stream :
            raise ValueError ( )
        return int ( nl )
    def write ( self , stream , repeat ) :
        try :
            self.stream.read ( 1 )
        except :
            pass
    def write ( self , stream , repeat ) :
        self.stream.write ( stream )
    def read ( self , stream ) :
        N = stream.count ( )
        S = stream.read ( )
        ans = - 1
        for i in range ( N ) :
            head , tail = S [ : i ] , S [ i : ]
            cnt = 0
            for c in [ 'a' , 'z' ] :
                if head.find ( c ) > - 1 and tail.find ( c ) > - 1 :
                    cnt += 1
            ans = max ( ans , cnt )
        return ans
    class FastScanner ( object ) :
        def __init__ ( self , stream , repeat ) :
            self.stream = stream
            self.repeat = repeat
        def write ( self , stream , repeat ) :
            self.stream = stream
            self.repeat = repeat
        def read ( self ) :
            if not self.stream.read ( 1 ) :
                raise StopIteration ( )
            return self.stream.read ( )
        def write ( self , stream , repeat ) :
            self.stream.write ( stream )
    return FastScanner ( )
