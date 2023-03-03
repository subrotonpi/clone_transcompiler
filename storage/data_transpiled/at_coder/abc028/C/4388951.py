def import import StringIO
from StringIO import StringIO
from twisted.python import sys
from twisted.internet import reactor
from twisted.python import util
from twisted.python import log
from twisted.python import log
from twisted.python import util
from twisted.python import iterable
from twisted.python import log
from twisted.python import util
from twisted.python import iterable
from twisted.python import log
from twisted.python import log
from twisted.python import util
from twisted.python import iterable
from twisted.python import log
from twisted.python import log
from twisted.python import util
from twisted.python import iterable
from twisted.python import log
from twisted.python import log
from twisted.python import util
from twisted.python import pickle
from twisted.python import util
from twisted.python import pickle
from twisted.python import util
from twisted.python import log
from twisted.python import log
from twisted.python import log
from twisted.python import util
from twisted.python import basic
from twisted.python import log
from twisted.python import log
from twisted.python import util
from twisted.python import iterable
class TaskC ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.stream = StringIO ( )
        self.stream = stream
        self.buffer = buffer
        self.bufptr = None
        self.buflength = None
    def read ( self ) :
        if self.bufptr >= self.buflength :
            if not self.bufptr : raise KeyboardInterrupt ( )
        bufptr = ord ( self.buffer [ 0 ] )
        try :
            buflength = self.buffer.size
        except AttributeError :
            bufptr = ord ( self.buffer [ 0 ] )
        if buflength <= 0 :
            return - 1
        return self.buffer [ bufptr ]
    def isSpaceChar ( c ) :
        return c.isSpaceChar ( )
    def __next__ ( self ) :
        n = 0
        b = self.read ( )
        while isSpaceChar ( b ) :
            b = next ( self )
            minus = ( b == '-' )
            if minus :
                b = self.read ( )
            while b >= '0' and b <= '9' :
                n *= 10
            return minus
            