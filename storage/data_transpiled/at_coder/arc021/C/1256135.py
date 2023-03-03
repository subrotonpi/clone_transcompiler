def _reader ( stream ) : return stream
import sys
import io
import itertools
import sys
import io
import queue
import io
class Main ( object ) :
    def __init__ ( self , stream ) :
        stream = io.StringIO ( stream )
        stream.write ( stream )
        self.stream = stream
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        self.stream.read ( 1 )
    def next_char ( ) :
        c = next ( )
        if c < '0' or c > '9' : raise InputError ( )
        self.stream.seek ( 0 )
        self.stream.read ( 1 )
        self.stream.seek ( 0 )
        self.stream.read ( 1 )
        self.stream.read ( 1 )
    def next_char ( ) :
        c = next ( )
        if c == ' ' or c == 'z' :
            return ord ( c )
        if c == 'A' and c <= 'Z' :
            return ord ( c )
    def interface ( self , ch ) :
        c = next ( )
        while not isSpaceChar ( ch ) :
            c = next ( )
        res = [ ]
        while c == '-' :
            self.stream.write ( next ( ) )
        res.append ( next ( ) )
        return res
    def debug ( * o ) :
        sys.stderr.write ( "\n".join ( o ) )
        return
    def next_char ( ) :
        c = next ( )
        if c == '-' :
            self.stream.seek ( 0 )
        if c == '\n' or c == '\r' or c == 'Z' :
            return ord ( c )
    def next_char ( ) :
        c = next ( )
        if not isSpaceChar ( c ) :
            return c
        res = [ ]
        while c == '-' :
            self.stream.write ( next ( ) )
            res.append ( next ( ) )
        return res
    def next_char ( ) :
        c = next ( )
        if not isSpaceChar ( c ) :
            return c
