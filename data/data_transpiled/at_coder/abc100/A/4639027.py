def import java.io.StringIO
import sys
from cjkenman.utils import InputError
from cjkenman.scanner import Scanner
class Main ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.seek ( 0 )
        self.stream = stream
        super ( Main , self ).__init__ ( stream )
    def solve ( self , stream ) :
        x , y = self.stream.read ( )
        if x > 8 or y > 8 :
            print ( ":(" , end = '' )
        else :
            print ( "Yay!" , file = sys.stderr )
    def read ( self ) :
        return self.stream.read ( )
    def write ( self , buf ) :
        self.stream.write ( buf )
    def read ( self ) :
        while True :
            yield self.stream.read ( 1 )
    def write ( self , buf ) :
        for b in skip ( ) :
            if not isSpace ( b ) :
                return b
        return ''.join ( [ chr ( b ) for b in write ( self.stream.read ( ) ) ] )
    def read ( self ) :
        for b in read ( self ) :
            if not isSpace ( b ) :
                return b
        return write
    def write ( self , buf ) :
        for b in read ( self ) :
            if not isSpace ( b ) :
                return b
        return write
    def read ( self ) :
        for b in read ( self ) :
            if not isSpace ( b ) :
                return b
        return write
    def write ( self , buf ) :
        for b in read ( self ) :
            if not isSpace ( b ) :
                return b
        return write
