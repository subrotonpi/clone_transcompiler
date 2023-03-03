def _import ( ) : return sys.stdin.read ( )
import io
import os
import sys
class Main ( object ) :
    def __init__ ( self , buf ) :
        file = sys.stdout
        f = open ( self.buf , 'w' )
        self.buf = [ ]
        try :
            f.read ( self.buf )
        except IOError as e :
            raise InputError ( e )
        if len ( f ) <= 0 :
            return - 1
    def solve ( self , f ) :
        n , m = struct.unpack ( '>I' , f.read ( 4 ) )
        c = { }
        d = [ ]
        for t , u in struct.unpack ( '>I' , f.read ( 4 ) ) :
            d.append ( t )
            d.append ( u )
            x = c.get ( t , [ ] )
            x.append ( u )
            c [ t ] = x
        h = { }
        for k , v in c.items ( ) :
            h [ k ] = [ v ]
        for i in range ( m ) :
            x = h [ d [ 0 ] [ i ] ]
            index = bisect.bisect_right ( x , d [ 1 ] [ i ] )
            f.write ( "%06d%06d\n" % ( d [ 0 ] [ i ] , index + 1 ) )
    class InputStream ( object ) :
        def __init__ ( self , f ) :
            self.buf = [ ]
            self.f = f
        def next ( self ) :
            yield self.buf
            for b in self.skip ( ) :
                yield b
                b = self.read ( )
            return b
        def __next__ ( self ) :
            return int ( next ( ) )
        def __next__ ( self ) :
            return long ( next ( ) )
        def __next__ ( self ) :
            return int ( next ( ) )
        def __next__ ( self ) :
            return long ( next ( ) )
