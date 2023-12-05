def import _readline
import readline
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.__debug = False
        self.file_name = 'input.txt'
        self.sc = FastScanner ( )
        self.MOD = 1000000007
        def solve ( ) :
            if self.sc.randint ( ) % self.MOD == 0 :
                raise ValueError ( )
            return float ( next ( ) )
    def read ( ) :
        S = time.time ( )
        self.sc = ( sys.stdin.buffer if self.__debug else sys.stdin.buffer )
        self.solve ( )
        G = time.time ( )
        if self.__debug :
            print ( '---Debug--' )
            print ( '%7d ms' % ( G - S ) )
class FastScanner ( object ) :
    def __init__ ( self , f ) :
        self.f = f
    def read ( ) :
        self.f = f
    def has_next_byte ( ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try :
                buflen = self.f.read ( self.ptr )
            except AttributeError :
                pass
            if buflen <= 0 :
                return False
        return True
    def read ( ) :
        if self.ptr < self.buflen :
            return self.ptr
        else :
            return - 1
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def __iter__ ( self ) :
        while self.ptr < self.ptr :
            if not is_printable_char ( self.ptr ) :
                self.ptr += 1
            return self.ptr
    def readline ( self ) :
        if not self.ptr :
            raise StopIteration ( )
        s = [ ]
        b = self.read_char ( )
        while is_printable_char ( b ) :
            s.append ( b )
            b = self.read_char ( )
        return s
    def readline ( ) :
        if self.ptr < self.ptr :
            return self.ptr
        return None
