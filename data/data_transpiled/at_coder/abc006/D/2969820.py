def _import ( ) : return sys.stdin.read ( )
import readline
import readline
import readline
import time
import sys
from itertools import chain
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( sys.stdin )
        self.C = sys.stdin.read ( )
        print ( self.solve ( ) )
    def solve ( self ) :
        return N - len ( self.lcs ( C ) )
    def lcs ( self ) :
        A = [ ]
        A.append ( 0 )
        for a in A :
            lo = 0
            hi = len ( A )
            while lo < hi :
                mid = ( hi - lo ) // 2 + lo
                if A [ mid ] >= a :
                    hi = mid
                else :
                    lo = mid + 1
            A.append ( a )
            if lo == len ( A ) :
                A.append ( 1 )
        return chain ( A , B )
    @ property
    def readline ( self ) :
        if self.N or not self.C :
            try :
                return readline ( self.C )
            except IOError :
                raise EOFError
        return readline ( self.C )
    def next_slice ( self , n ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( randint ( 0 , n ) )
        return a
    def next_slice ( self , n ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( next_slice ( self , i ) )
        return a
