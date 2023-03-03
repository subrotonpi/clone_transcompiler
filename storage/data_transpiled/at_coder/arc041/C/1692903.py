def _import ( ) : return sys.stdin.read ( )
import struct
import struct
import sys
import struct
import sys
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
    def read ( self , * args ) :
        self.buffer = sys.stdin.read ( 1024 )
        self.ptr = 0
        self.buflen = 0
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            raise StopIteration
        while self.ptr == self.buflen :
            self.ptr += 1
    def read ( self , * args ) :
        self.buffer.append ( self.buffer )
        self.buflen = 0
    def write ( self , * args ) :
        self.buffer.append ( self.buffer )
        self.buflen = 0
    def write ( self , * args ) :
        self.buffer.append ( self.buffer )
        self.buflen = 0
    def write ( self , * args ) :
        self.buffer.append ( self.buffer )
        self.buflen = 0
    def read ( self , * args ) :
        self.buf = [ ]
        self.buflen = 0
    def write ( self , * args ) :
        self.buf = [ ]
        self.buflen = 0
    def write ( self , * args ) :
        self.buf.append ( self.buf )
        self.buflen = 0
    def write ( self , * args ) :
        self.buf.append ( self.buf )
        self.buflen = 0
    def read ( self , * args ) :
        self.buf.append ( self.buf )
        self.buflen = 0
    def write ( self , * args ) :
        self.buf.append ( self.buf )
        self.buflen = 0
    write ( self , * args )
    write ( self , * args )
    write ( self , * args )
    write ( self , * args )
    return write
