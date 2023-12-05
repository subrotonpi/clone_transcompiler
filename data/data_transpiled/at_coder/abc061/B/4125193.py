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
from twisted.python import pickle
from twisted.python import util
from twisted.python import log
from twisted.python import log
from twisted.python import util
from twisted.python import pickle
from twisted.python import pickle
from twisted.python import util
from twisted.python import log
from twisted.python import util
from twisted.python import iterable
from twisted.python import log
from twisted.python import log
from twisted.python import util
from twisted.python import basic
from twisted.python import log
from twisted.python import util
from twisted.python import log
from twisted.python import log
from twisted.python import util
from twisted.python import log
from twisted.python import log
from twisted.python import util
from twisted.python import iterable
class TaskB ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self._reader = Reader ( sys.stdin )
        self._writer = Writer ( sys.stdout )
        self._reader.write ( log )
    def __iter__ ( self ) :
        for line in self._reader :
            if line.startswith ( ' ' ) :
                if self._reader.peek ( ) [ 0 ] == ' ' :
                    self._reader.pop ( )
                self._reader.pop ( )
        return iter ( self._reader )
