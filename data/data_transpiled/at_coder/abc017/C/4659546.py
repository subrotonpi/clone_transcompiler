def _import ( ) : return sys.stdin.read ( 1 )
import readline
import readline
import readline
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        readline.parse_and_bind ( )
        n = readline.get_byte ( )
        m = readline.get_byte ( )
        l = [ n ]
        r = [ n ]
        s = [ n ]
        imos = [ n ]
        sum = 0
        for i in range ( n ) :
            l.append ( readline.get_byte ( ) - 1 )
            r.append ( readline.get_byte ( ) - 1 )
            s.append ( readline.get_byte ( ) )
            imos [ l [ i ] ] += s [ i ]
            imos [ r [ i ] + 1 ] += - s [ i ]
            sum += s [ i ]
        for i in range ( 1 , m ) :
            imos [ i ] += imos [ i - 1 ]
        min = sys.maxsize
        for i in range ( m ) :
            min = min ( min , imos [ i ] )
        print ( sum - min )
    class FastScanner ( readline ) :
        def __init__ ( self ) :
            readline.parse_and_bind ( )
            self.buffer = sys.stdin.read ( 1024 )
        def readline ( self ) :
            if not self.has_eof ( ) :
                raise EOFError ( )
            return
        def write ( self , buffer ) :
            if self.has_eof ( ) :
                raise EOFError ( )
            return buffer
        def readline ( self ) :
            return sys.stdin.readline ( )
        def readline ( self ) :
            while self.has_eof ( ) and not self.has_eof ( ) :
                self.next ( )
            return ''
    return Main ( )
