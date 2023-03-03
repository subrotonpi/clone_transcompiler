def _import ( * args ) : return _import ( sys.stdin , sys.stdout , * args )
import io
import itertools
import sys
import io
import io
import sys
import io
import struct
class Main ( io.IOBase ) :
    def __init__ ( self ) :
        io.IOBase.__init__ ( self )
        self.buffer = io.BytesIO ( )
        self.curbuf = 0
        self.debug = False
    def solve ( self ) :
        a = self.next ( ).decode ( 'utf-8' )
        n = len ( a )
        self.curbuf = 0
        try :
            self.curbuf = self.curbuf
        except AttributeError :
            self.curbuf = 0
        if not self.hasNext ( ) :
            raise StopIteration
        self.curbuf = 0
        while self.curbuf >= 0 :
            self.curbuf = self.curbuf
    def read ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
        self.curbuf = 0
        while self.curbuf == 0 :
            self.curbuf = 0
        return self.curbuf
    def read ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
        self.curbuf = 0
        while self.curbuf == 0 :
            self.curbuf = 0
        return self.curbuf
    def read ( self ) :
        if self.hasNext ( ) :
            raise StopIteration
        self.curbuf = 0
        while self.curbuf == 0 :
            self.curbuf = 0
        return self.curbuf
    def read ( self ) :
        if self.hasNext ( ) :
            raise StopIteration
        self.curbuf = 0
        while self.hasNext ( ) :
            self.curbuf = 0
        return self.curbuf
    def read ( self ) :
        if self.hasNext ( ) :
            raise StopIteration
        self.curbuf = 0
        while self.hasNext ( ) :
            self.curbuf = 0
        return self.curbuf
    def read ( self ) :
        return self.next ( ).decode ( 'utf-8' )
