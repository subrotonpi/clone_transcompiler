def import java.io.StringIO
import io
from cjkenman.scanner import Scanner
class Main ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream = io.StringIO ( )
        super ( Main , self ).__init__ ( stream )
    def solve ( self , stream ) :
        stream.write ( 'aeiou' if 'vowel' in stream.read ( ) else 'consonant' )
    class InputStream ( Scanner ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def next ( self ) :
            yield ''
            for b in self.skip ( ) :
                if not is_space ( b ) :
                    yield b
            return self.stream.read ( )
        def __next__ ( self ) :
            return int ( self.stream.read ( ) )
        def __next__ ( self ) :
            return long ( self.stream.read ( ) )
        def nextDouble ( self ) :
            return float ( self.stream.read ( ) )
        def next_char ( self ) :
            return chr ( self.stream.read ( ) )
        def skip ( self ) :
            for b in self.stream.read ( ) :
                if not is_space ( b ) :
                    yield b
            return
        def isspace ( self ) :
            return self.stream.read ( 33 )
        def read ( self ) :
            if self.stream is None :
                raise InputError ( 'End of Input' )
            if self.stream.read ( ) >= self.stream.read ( ) :
                self.stream.seek ( self.stream.read ( ) )
            if self.stream.read ( ) <= self.stream.read ( ) :
                return
    return InputStream ( )
