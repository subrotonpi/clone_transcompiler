def import java.io.StringIO
import io
from cjkenpipe import pipes
class Main ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream = io.StringIO ( )
        super ( Main , self ).__init__ ( stream )
    def solve ( self , stream ) :
        self.stream.write ( stream.read ( ).replace ( "," , " " ) )
class InputStream ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def read ( self ) :
        yield self.stream.read ( )
    def readline ( self ) :
        s = [ ]
        for b in skip ( ) :
            if not is_space ( b ) :
                s.append ( b )
                b = read ( )
        return s
    def readline ( self ) :
        s = [ ]
        for b in read ( self.stream.read ( ) ) :
            if not is_space ( b ) :
                s.append ( b )
                b = read ( )
        return s
    def readline ( self ) :
        for c in read ( self.stream.read ( ) ) :
            if not is_space ( c ) :
                return c
        return None
    def isspace ( c ) :
        return c < 33 or c > 126
    def read ( self , stream ) :
        if stream is None :
            stream = sys.stdout = sys.__stdout__
        if isinstance ( stream , bytes ) :
            stream = sys.stdin = stream.read ( )
        if isinstance ( stream , bytes ) :
            stream = sys.stdin.read ( )
        return stream.decode ( 'utf-8' )
