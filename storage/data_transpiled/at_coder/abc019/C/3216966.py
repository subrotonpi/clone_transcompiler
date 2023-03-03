def _import ( ) : return [ int ( x ) for x in range ( 10 ) ]
from itertools import chain , repeat
from itertools import chain , repeat
from os import urandom
from itertools import chain , repeat
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( self.N )
        self.A = chain ( [ self.A ] , repeat ( self.N ) )
        print ( self.solve ( ) )
    def solve ( self ) :
        seen = set ( )
        for i in range ( N ) :
            a = A [ i ]
            while a % 2 == 0 :
                a /= 2
            seen.add ( a )
        return len ( seen )
    @ instance
    def __next__ ( self ) :
        if not isinstance ( self.A , chain ) or not isinstance ( self.A , chain ) :
            try :
                self.A = next ( self.A )
            except StopIteration :
                self.A = next ( self.A )
        return next ( self.A )
    def readline ( self ) :
        if not isinstance ( self.A , chain ) or not isinstance ( self.A , chain ) :
            try :
                return next ( self.A )
            except StopIteration :
                self.A = next ( self.A )
        return next ( self.A )
    def __next__ ( self ) :
        return repeat ( self.A )
    def __next__ ( self ) :
        return repeat ( self.A )
    def __next__ ( self ) :
        return repeat ( self.A )
