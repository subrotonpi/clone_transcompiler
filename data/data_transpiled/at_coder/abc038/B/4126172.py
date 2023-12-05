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
        self.stream = StringIO ( )
        self.stream = stream
        self.solver = TaskB ( )
        self.solver.solve ( 1 , stream , self.solver )
        self.stream.close ( )
    def solve ( self , test_number , self , stream ) :
        h1 , w1 , h2 , w2 = [ s for s in self.stream if s != test_number ]
        if h1 == h2 or w1 == w2 or h1 == w2 or h2 == w1 :
            stream.write ( "YES" )
        else :
            stream.write ( "NO" )
    def read ( self , size = 1024 ) :
        self.stream.seek ( 0 , os.SEEK_SET )
        return self.stream.read ( size )
    def write ( self , data ) :
        if self.stream.read ( 1 ) >= self.stream.tell ( ) :
            if not data :
                raise EOFError ( )
            self.stream.seek ( 0 , os.SEEK_SET )
            return data
        return self.stream.read ( size )
    def isSpaceChar ( c ) :
        return c in ( ' ' , '\n' , '\r' , '\t' , '-' )
    def read ( self , size = 1024 ) :
        n = 0
        b = self.read ( size )
        while isSpaceChar ( b ) :
            b = self.read ( size )
        minus = ( b == '-' )
        if minus :
            b = self.read ( size )
        while b >= '0' and b <= '9' :
            n *= 10
            n += b - '0'
            b = self.read ( size )
        if not isSpaceChar ( b ) :
            raise ValueError ( )
        return minus
