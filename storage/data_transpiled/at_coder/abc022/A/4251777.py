def import import StringIO
from StringIO import StringIO
from twisted.python import sys
from twisted.internet import reactor
from twisted.python import util
from twisted.python import log
from twisted.python import ssl
from twisted.python import util
from twisted.python import iterable
class Main ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream = stream
        self.parser = parser
        self.stream = stream
        self.solver = TaskA ( )
        self.solver.solve ( 1 , stream , self.parser )
        self.stream.close ( )
    def solve ( self , test_number , self , stream ) :
        n , s , t = self.parser.args
        w = 0
        ans = 0
        for i in range ( n ) :
            w += self.stream.read ( 1 )
            if w >= s and w <= t :
                ans += 1
        stream.write ( ans )
class TaskA ( object ) :
    def __init__ ( self , stream = None , ** kwargs ) :
        self.stream = stream
        self.parser = parser
        self.bufsize = None
        self.stream = stream
        self.bufsize = None
    def read ( self ) :
        if self.stream.read ( 1 ) :
            if self.stream.read ( 1 ) == self.stream.read ( 1 ) :
                raise EOFError ( )
            self.stream.read ( 1 )
        return self.stream.read ( )
    def isSpaceChar ( self ) :
        return self.stream.read ( )
    def isSpaceChar ( self ) :
        return self.stream.read ( )
    def isSpaceChar ( self ) :
        n = 0
        b = self.stream.read ( 1 )
        while isSpaceChar ( b ) :
            b = self.stream.read ( 1 )
            minus = ( b == '-' )
            if minus :
                b = self.stream.read ( 1 )
            while b >= '0' and b <= '9' :
                n *= 10
                n += b - '0'
                b = self.stream.read ( 1 )
            if not isSpaceChar ( b ) :
                raise ValueError ( )
            return - n
