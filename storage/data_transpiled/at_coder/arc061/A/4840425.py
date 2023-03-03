def _import ( ) : return _import ( '' , '' , '' )
import sys
import string
import string
import input
import input
import input
class Main ( object ) :
    def f ( self , s , end , acc ) :
        n = int ( s [ 0 : end ] )
        if end == len ( s ) :
            return acc + n
        else :
            return f ( s , end + 1 , acc ) + f ( s [ end : ] , 1 , acc + n )
    def read ( self , size ) :
        S = self.next ( )
        self.write ( f ( S , 1 , 0 ) )
    def main ( self ) :
        w = sys.stdout.buffer
        exec ( input ( self.next ( ) ) , w )
        w.flush ( )
    class MyScanner ( object ) :
        BUFFER_SIZE = 1024
        def __init__ ( self , f ) :
            self.f = f
        def read ( self , size ) :
            self.f = f
        def readByte ( self ) :
            if self.point < self.readLength :
                result = self.buffer [ self.point ]
                self.point += 1
                return result
            try :
                readLength = self.f.read ( size )
            except AttributeError :
                pass
            if readLength == - 1 :
                return - 1
            self.point = 1
            return self.buffer [ 0 ]
        def isPrintableCharExceptSpace ( c ) :
            return 33 <= c <= 126
        def next ( self ) :
            b = [ ]
            c = self.readByte ( )
            while not ( c == - 1 or isPrintableCharExceptSpace ( c ) ) :
                c = self.readByte ( )
            if c == - 1 :
                raise input ( )
            while True :
                b.append ( c )
                c = self.readByte ( )
            return b
    f = MyScanner ( )
    f.read = 1
    f.close = 1
    return f
