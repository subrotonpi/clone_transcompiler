def _import ( ) : return sys.stdin.read ( )
import os
import sys
import random
import sys
import sys
from itertools import chain
from itertools import repeat
from itertools import chain
def main ( ) :
    fh = sys.stdin
    fh = sys.stdout
    fh = sys.stdin
    fh = sys.stdout
    fh = open ( fh , 'w' )
    fh.write ( '\n' )
    fh.close ( )
def next_arange ( n ) :
    res = [ ]
    for i in range ( n ) :
        res.append ( randint ( 0 , n ) )
    return res
class BPalace ( object ) :
    def solve ( self , test_number , f , out ) :
        N = len ( f )
        T = f [ 0 ]
        A = f [ 1 ]
        h = f [ 2 ]
        a = T - h [ 0 ] * 0.006
        ans = 0
        for i in range ( 1 , N ) :
            if abs ( T - h [ i ] * 0.006 - A ) < abs ( a - A ) :
                a = T - h [ i ] * 0.006
                ans = i
        out.write ( ans + 1 )
class FastScanner ( object ) :
    def __init__ ( self , f ) :
        self.f = f
        self.buffer = b''
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.buffer.read ( self.buflen )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def readByte ( self ) :
            if self.ptr < self.buflen :
                return self.buffer [ self.ptr ]
            else :
                return - 1
        def isPrintableChar ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            while self.ptr < self.buflen :
                self.ptr += 1
            return __iter__ ( )
