def _import ( ) : return sys.stdin.read ( )
import io
import struct
import struct
import sys
import time
import sys
class Main ( object ) :
    def __init__ ( self , file = io.StringIO ( ) ) :
        self.file = file
        self.file = file
        self.INPUT = ''
        self.read = self.read
        self.EOF = False
    def solve ( ) :
        n , m = self.ni ( )
        a = self.na ( 2 * n )
        a.sort ( )
        low , high = 0 , n + 1
        outer :
            while b in ( b , b ) :
                b = b
            if b in ( b , b ) :
                num = b
            else :
                return - num
    def nl ( ) :
        b = self.nl ( )
        if b in ( b , b ) :
            return b
        else :
            return b
    def tr ( * o ) :
        if len ( self.input ) != 0 :
            print ( [ x for x in self.input ] )
    def main ( ) :
        S = time.time ( )
        self.file = file or sys.stdin
        self.solve ( )
        self.file.flush ( )
        G = time.time ( )
        tr ( '%dms' % ( G - S ) )
    def eof ( ) :
        if len ( self.input ) == 0 :
            return True
        lptr = self.ptrbuf
        while lptr < self.lenbuf :
            if not is_space_char ( self.input [ lptr ] ) :
                return False
        try :
            self.file.seek ( 0 )
        except IOError :
            return True
    def read ( ) :
        return sys.stdin.read ( 1024 )
    def write ( self , * args ) :
        return self.file.read ( 1024 )
