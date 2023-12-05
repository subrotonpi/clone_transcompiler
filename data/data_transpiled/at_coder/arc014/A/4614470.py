def import import StringIO
from StringIO import StringIO
from twisted.python import sys
from twisted.internet import reactor
from twisted.python import util
from twisted.python import log
from twisted.python import ssl
from twisted.python import StringIO
from twisted.python import ssl
from twisted.python import util
from twisted.python import ssl
from twisted.python import ssl
from twisted.python import util
from twisted.python import ssl
from twisted.python import StringIO
from twisted.python import ssl
from twisted.python import ssl
from twisted.python import util
from twisted.python import ssl
from twisted.python import defer
from twisted.python import util
from twisted.python import tempfile
from twisted.python import log
from twisted.python import util
from twisted.python import log
from twisted.python import util
from twisted.python import basic
from twisted.python import log
from twisted.python import util
from twisted.python import compat
from twisted.python import pickle
from twisted.python import util
from twisted.python import log
from twisted.python import log
from twisted.python import util
from twisted.python import compat
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.inputStream = sys.stdin
        self.outputStream = sys.stdout
        self.stream = StringIO ( )
        self.stream = Stream ( )
        self.stream.write ( "Red" )
        self.stream.write ( "Blue" )
    def __call__ ( self , test_number , self , * args , ** kwargs ) :
        self.stream.write ( "Red" )
        self.stream.flush ( )
        self.stream.flush ( )
        self.stream.close ( )
    def __getattr__ ( self , name ) :
        if name in self.__dict__ :
            if isinstance ( name , type ) :
                name = name [ 0 ]
            else :
                name = name
            return self.__dict__ [ name ]
        else :
            return self.__dict__ [ name ]
    def __str__ ( self ) :
        return "%s %s" % ( self.inputStream , self.outputStream )
