def import import StringIO
from StringIO import StringIO
from twisted.python import sys
from twisted.python import log
from twisted.internet import reactor
from twisted.python import util
from twisted.python import ssl
from twisted.python import StringIO
from twisted.python import log
from twisted.python import util
from twisted.python import ssl
from twisted.python import ssl
from twisted.python import util
from twisted.python import iterable
class Main ( object ) :
    def __init__ ( self , stream = None ) :
        self.stream = stream
        self.stream = StringIO ( )
        self.stream = stream
        self.writer = sys.stdout
        self.solver = self.TaskA ( )
        self.solver.solve ( 1 , stream , self.solver )
        self.stream.close ( )
    def solve ( self , test_number , self , stream ) :
        n = self.stream.tell ( ) + self.stream.tell ( )
        self.stream.write ( "error" if n >= 10 else n )
class TaskA ( object ) :
    def __init__ ( self , stream = None , ** kwargs ) :
        self.stream = stream
        self.buffer = StringIO ( )
        self.bufptr = None
        self.buflength = None
    def read ( self ) :
        if self.bufptr :
            if not self.stream.read ( 1 ) : raise EOFError ( )
        self.stream.read ( 1 )
        return self.buffer.getvalue ( )
    def isSpaceChar ( self ) :
        return self.stream.isSpaceChar ( )
    def tell ( self ) :
        n = 0
        b = self.stream.read ( 1 )
        while self.isSpaceChar ( ) :
            b = self.stream.read ( 1 )
        minus = ( self.stream.tell ( ) - self.stream.read ( 1 ) )
        if minus :
            b = self.stream.read ( 1 )
        while b >= 0 and b <= '9' :
            n *= 10
            n += b - '0'
            b = self.stream.read ( 1 )
        if not self.stream.read ( 1 ) : raise EOFError ( )
