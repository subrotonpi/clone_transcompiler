def import _readline
import readline
import sys
import math
class Main ( object ) :
    def solve ( self , f , out ) :
        out.write ( 'Blue' if sys.byteorder [ 0 ] == 'big' else 'Red' )
    def write ( self , * ar ) :
        print ( ''.join ( [ chr ( ord ( a ) ) for a in ar ] ) , end = '' )
    def close ( self ) :
        try :
            self.close ( )
        except :
            pass
class Main ( object ) :
    def __init__ ( self , f , out ) :
        self.f = f
        self.out = out
    def solve ( self , f ) :
        try :
            self.f.close ( )
        except :
            pass
class FastScanner ( object ) :
    def __init__ ( self , stream ) :
        self.buffer = b''
        self.length , p = 0 , 0
    def read ( self , stream ) :
        self.buffer = stream
        self.length = length , p = 0
    def has_next_byte ( self ) :
        if p < self.length :
            return True
        else :
            p = 0
            try :
                length = self.stream.read ( self.length )
            except :
                pass
            if length <= 0 :
                return False
            return True
    def readByte ( self ) :
        if self.has_next_byte ( ) == True :
            return self.buffer [ p ]
        return - 1
    def isPrintable ( self , n ) :
        return 33 <= n <= 126
    def skip ( self ) :
        while self.has_next_byte ( ) and not isPrintable ( self.buffer [ p ] ) :
            p += 1
    def __iter__ ( self ) :
        return iter ( self )
    def next ( self ) :
        if not self.hasNext ( ) :
            raise StopIteration
        ar = [ ]
        t = self.readByte ( )
        while self.hasNext ( ) :
            ar.append ( next ( self ) )
            t = self.next ( )
        return ar
return Main ( )
