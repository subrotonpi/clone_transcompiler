def import _readline
import readline
import sys
import math
class Main ( object ) :
    def solve ( self , f ) :
        s = f.read ( )
        f.write ( f.read ( ).replace ( s , '' ) )
    def write ( self , * ar ) :
        print ( * ar )
    def close ( self ) :
        try :
            f.close ( )
        except :
            pass
    def read ( self , stream ) :
        self.stream = stream
    def has_next_byte ( ) :
        if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
            return True
        else :
            p = 0
            try :
                length = self.stream.read ( 1 )
            except :
                pass
            if length <= 0 :
                return False
            return True
    def read ( self , stream ) :
        if self.stream.read ( 1 ) == True :
            return stream.read ( 1 )
        return - 1
    def is_printable ( n ) :
        return 33 <= n <= 126
    def skip ( self ) :
        while self.stream.read ( 1 ) == b'' :
            p += 1
    def __iter__ ( self ) :
        return iter ( self )
    def next ( self ) :
        if not self.stream.read ( 1 ) :
            raise StopIteration
        lines = [ ]
        t = self.stream.read ( 1 )
        while self.stream.read ( 1 ) == b'' :
            lines.append ( t )
            t = self.stream.read ( 1 )
        return ''.join ( lines )
    def __iter__ ( self ) :
        return iter ( self )
return Main
