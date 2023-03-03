def _import ( ) : return _import ( )
import sys
import os
import sys
import struct
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.readbuf ( )
        for i in range ( len ( self.readbuf ) ) :
            self.readbuf ( )
    def close ( self ) :
        if not self.readbuf : self.readbuf.close ( )
f = InputUtil ( )
f = sys.stdout
N = M = ans = 0
def input ( ) :
    N = f.tell ( )
    M = f.tell ( )
def solve ( ) :
    ans = ( 1900 * M + 100 * ( N - M ) ) * pow2 ( M )
def pow2 ( m ) :
    ret = 1
    for i in range ( m ) :
        ret *= 2
    return ret
def output ( ) :
    f.write ( ans )
    f.flush ( )
class InputUtil ( object ) :
    BUFSIZ = 100000
    def __init__ ( self , f , bufsiz = 0 ) :
        self.f = f
        self.buf = None
        self.ptr = 0
        self.max = - 1
    def read ( self ) :
        self.buf = buf
        self.bufsiz = bufsiz
    def write ( self , buf ) :
        self.buf = buf
        self.ptr += 1
        self.readbuf ( )
    def read ( self ) :
        self.ptr += 1
        self.readbuf ( )
    def readbuf ( self ) :
        if self.ptr >= self.max and self.buf :
            if self.max :
                self.buf = self.buf [ self.ptr : self.max ]
            self.max = self.buf.read ( self.ptr )
            self.ptr = 0
    def isnum ( self ) :
        return '0' <= self.ptr <= '9'
    def isminus ( self ) :
        return self.ptr == '-'
    def _randint ( self ) :
        return self.ptr
