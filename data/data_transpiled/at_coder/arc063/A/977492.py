def _import ( ) : return _import ( )
from sys import stdout
from os import isatty
from io import BytesIO
from io import BytesIO
from io import BytesIO
class Main ( ) :
    sc = FastScanner ( )
    stdout = BytesIO ( )
    def main ( args ) :
        S = next ( args )
        ans = 0
        char = 'A'
        for i in S :
            d = ord ( i )
            if c == 'A' :
                char = d
            elif c != char :
                ans += 1
                char = d
        print ( ans )
    def next ( ) :
        return sc.next ( )
    def ni ( ) :
        return sc.__next__ ( )
    def nl ( ) :
        return sc.nl
    def na ( n ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( ni ( ) )
        return a
    def nal ( n ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( ni ( ) )
        return a
    def nd ( ) :
        return float ( next ( ) )
class FastScanner ( object ) :
    def __init__ ( self , buffer = BytesIO ( ) ) :
        self.buffer = buffer
        self.ptr = 0
        self.buflen = 0
        def has_next_byte ( ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    self.buflen = len ( buffer )
                except TypeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def readByte ( ) :
            if not self.hasNext ( ) :
                raise StopIteration
            yield buffer
        def isPrintableChar ( c ) :
            return 33 <= c <= 126
        def skip_unprintable ( ) :
            while self.hasNext ( ) and not is_printableChar ( buffer [ ptr ] ) :
                ptr += 1
        def next ( ) :
            return buffer
    return FastScanner ( )
