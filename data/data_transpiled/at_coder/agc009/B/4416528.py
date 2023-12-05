def _import ( ) : return _import ( )
import sys
import struct
import sys
import sys
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self._fastscan = _fastscan ( )
        N = self._read_number ( )
        self.list = [ ]
        for i in range ( N ) :
            self.list.append ( [ ] )
        for i in range ( 1 , N ) :
            self.list [ i ] = [ ]
    def read ( ) :
        if not self._fastscan : raise StopIteration
        n = False
        b = self._read_number ( )
        if b == '-' :
            minus = True
            b = self._read_number ( )
        if b < '0' or b <= '9' :
            raise StopIteration
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return int ( - n )
            else :
                raise StopIteration
        b = self._read_number ( )
    def dp ( self ) :
        max = 0
        kids = [ ]
        num = 0
        for e in self.list [ - 1 ] :
            kids.append ( dp ( e ) )
            num += 1
        num = 0
        kids.sort ( )
        for j in range ( len ( self.list [ - 1 ] ) ) :
            max = max ( max , kids [ - 1 - j ] + j + 1 )
        return max
class FastScanner ( object ) :
    def __init__ ( self ) :
        self.buffer = sys.stdin.read ( 1024 )
    def __init__ ( self ) :
        self.buffer = sys.stdin.read ( 1024 )
    def __init__ ( self ) :
        self.buffer = sys.stdin.read ( 1024 )
    def seek ( self , offset ) :
        if not self._fastscan : raise StopIteration
        self.buffer.seek ( offset )
        return offset
    def read ( self ) :
        if not self._fastscan : raise StopIteration
        self.buffer.seek ( offset )
        return offset
