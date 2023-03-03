def import _readline
import readline
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.__debug = False
        self.file_name = 'input.txt'
        global sc
        self.MOD = 1000000007
        def solve ( ) :
            A = sc.next ( )
            print ( '%d %d' % ( self.RAND ( ) , A ) )
        def next ( ) :
            return float ( next ( ) )
    def main ( ) :
        global S
        S = time.time ( )
        sc = ( sys.stdin if sys.stdin.isatty ( ) else sys.stdin )
        solve ( )
        G = time.time ( )
        if sys.stdout.isatty ( ) :
            print ( '---Debug---' )
            print ( '%7d ms' % ( G - S ) )
    class FastScanner ( object ) :
        def __init__ ( self , f ) :
            self.f = f
        def read ( self ) :
            self.f.seek ( 0 )
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    buflen = self.f.read ( self.ptr )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def readByte ( self ) :
            if self.ptr < self.buflen :
                return self.ptr
            else :
                return - 1
        def isPrintableChar ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            while self.ptr < self.ptr :
                if not self.ptr :
                    raise StopIteration
                yield self.ptr
    def next ( ) :
        if not self.ptr :
            raise StopIteration
        s = [ ]
        b = self.readByte ( )
        while self.isPrintableChar ( b ) :
            s.append ( b )
            b = self.readByte ( )
        return s
