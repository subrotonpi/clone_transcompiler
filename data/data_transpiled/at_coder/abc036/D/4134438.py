def _import ( ) : return sys.stdin
import StringIO
import StringIO
import collections
import collections
import io
import io
import io
import io
import io
import configparser
import configparser
import ConfigParser
import configparser
import ConfigParser
import configparser
import ConfigParser
import configparser
import ConfigParser
import configparser
import ConfigParser
import io
import StringIO
class Main ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self._buffer_pointer = 0
        self._buffer_length = 0
    def read ( self ) :
        if self._buffer_pointer >= 0 : raise InputError ( )
        self._buffer_pointer = self._buffer_pointer
        self._buffer_length += 1
        return self._buffer_pointer
    def read ( self ) :
        self._buffer_pointer = 0
        self._buffer_length = 0
    def read ( self ) :
        self._buffer_pointer = 0
        self._buffer_length = 0
    def read ( self ) :
        if self._buffer_pointer == - 1 : raise InputError ( )
        self._buffer_pointer = 0
        return self._buffer_pointer
    def write ( self , buffer ) :
        self._buffer_pointer = 0
        self._buffer_length = 0
    def solve ( self , test_number , stream , stream ) :
        n = read_number ( )
        vertices = [ ]
        for i in range ( n ) :
            vertices.append ( { } )
        for a , b in zip ( self._buffer_pointer , self._buffer_length ) :
            vertices [ a ].update ( b )
        vertices [ b ].update ( self._buffer_pointer )
        ans = ( self.getB ( vertices [ 0 ] , None ) + self.getW ( vertices [ 0 ] , None ) ) % mod
        stream.write ( ans )
    def getB ( self , v , p ) :
        if v in self._edges : return self._edges [ v ]
        cb = 1
        for e in self._edges :
            if e.to != p : cb = ( cb * self.getW ( e.to , v ) + self.getB ( e.to , v ) ) % mod
            self._edges [ v ] =