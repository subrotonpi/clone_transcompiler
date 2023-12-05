def _import ( ) : return sys.stdin.read ( 1024 )
import io
import sys
import io
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import string
class Main ( object ) :
    def __init__ ( self ) :
        self.input_stream = sys.stdin
        self.output_file = sys.stdout
        self.stdin = open ( self.input_stream )
        self.stdout = open ( self.output_file , 'w' )
        self.stdin = readline
        self.stdout = open ( self.output_file , 'w' )
        self.stdout = open ( self.output_file , 'w' )
        self.stdin.write ( '' )
        self.stdin.seek ( 0 , 0 )
        self.stdin.seek ( 0 , 0 )
        self.stdin.read ( 1 )
        self.stdout.write ( '' )
        self.stdin.close ( )
    def read ( self ) :
        n = 0
        b = self.read_byte ( )
        while self.is_printable_char ( b ) :
            self.append_ord ( b )
            b = self.read_byte ( )
        return b
    def read ( self ) :
        n = 0
        while self.is_printable_char ( b ) :
            b = self.read_byte ( )
        if not self.is_printable_char ( b ) :
            raise EOFError
        while self.is_printable_char ( b ) :
            b = self.read_byte ( )
        if not self.is_printable_char ( b ) :
            raise EOFError
        return - n if n else n
