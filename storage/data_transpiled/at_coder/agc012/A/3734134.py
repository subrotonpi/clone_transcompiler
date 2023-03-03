def _import ( ) : return _import ( )
import sys
import struct
from struct import Struct , calcsize
class Main ( struct ) :
    def __init__ ( self ) :
        sc = Struct ( 'i' )
        N = sc.size
        a = [ ]
        for i in range ( 3 * N ) :
            a.append ( sc.unpack ( '>i' , a [ i : i + 2 ] ) )
        a.sort ( )
        ans = 0
        for i in range ( N , 3 * N , 2 ) :
            ans += a [ i ]
        print ( ans )
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def read ( self ) :
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
    def has_next_byte ( self ) :
        if self.stream.read ( ) < self.stream.tell ( ) :
            return True
        else :
            self.stream.seek ( 0 )
            try :
                self.stream.read ( self.stream.tell ( ) )
            except IOError :
                pass
            if self.stream.tell ( ) <= 0 :
                return False
        return True
    def has_next_byte ( self ) :
        if self.stream.read ( 1 ) < self.stream.tell ( ) :
            return True
        else :
            self.stream.seek ( 0 )
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def __iter__ ( self ) :
        while self.stream.read ( 1 ) < self.stream.tell ( ) :
            self.stream.seek ( 0 )
    def next ( self ) :
        if not self.stream.read ( 1 ) < self.stream.tell ( ) :
            raise StopIteration
        yield self.stream.read ( 1 )
