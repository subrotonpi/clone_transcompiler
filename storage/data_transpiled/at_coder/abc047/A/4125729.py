def import import StringIO
from itertools import repeat
from itertools import chain
from itertools import chain
from StringIO import StringIO
from itertools import chain
from itertools import chain
from itertools import repeat
from itertools import chain
from itertools import chain
class Main ( object ) :
    def __init__ ( self , stream , repeat = None ) :
        self.stream = stream
        self.stream = stream
        self.stream = stream
        self.chain = chain ( repeat , repeat )
    def solve ( self , test_number , stream , repeat = None ) :
        n = stream.read ( 3 )
        n.sort ( )
        print ( n [ 0 ] + n [ 1 ] == n [ 2 ] , "Yes" if repeat else "No" )
    def __next__ ( self ) :
        if self.stream is None :
            return None
        return next ( self.stream )
    def read ( self , n ) :
        self.stream = stream
        self.next = next ( self.stream )
    def write ( self , data ) :
        if self.stream is None :
            self.stream = stream
        return self.stream.read ( n )
    def peek ( self ) :
        if self.stream is None :
            return None
        return next ( self.stream )
    def isSpaceChar ( c ) :
        return c.isspace ( )
    def read ( self , n ) :
        n = 0
        b = next ( self.stream )
        while isSpaceChar ( b ) :
            b = next ( self.stream )
        minus = ( b == '-' )
        if minus :
            b = next ( self.stream )
        while b >= '0' and b <= '9' :
            n *= 10
            n += b - '0'
            b = next ( self.stream )
        if not isSpaceChar ( b ) :
            raise StopIteration
        return minus and n or a
    def select ( self , count , s ) :
        a = [ ]
        for i in range ( count ) :
            a.append ( count )
        return a
