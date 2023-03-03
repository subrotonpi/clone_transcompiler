def import _readline
import readline
import sys
import os
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        self.debug = False
        self.file_name = 'input.txt'
        global sc
        MOD = 1000000007
        def solve ( ) :
            n = sc.randint ( 0 , MOD )
            if nl < sys.maxint or nl > sys.maxint : raise ValueError
            return int ( nl )
        def next ( ) :
            return float ( next ( ) )
    def main ( ) :
        S = time.time ( )
        sc = ( sys.stdin.fileno ( ) if sys.stdin.isatty ( ) else sys.stdin.readline )
        solve ( )
        G = time.time ( )
        if sys.stdout.isatty ( ) :
            print ( '---Debug---' )
            print ( '%7d ms' % ( G - S ) )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
        def read ( self , size = 1024 ) :
            self.stream.seek ( 0 )
            self.stream.read ( size )
        def has_next_byte ( self ) :
            if self.stream.read ( size ) < self.stream.read ( size ) :
                return True
            else :
                self.stream.seek ( 0 )
                return False
        def has_next_byte ( self ) :
            if self.stream.read ( size ) < self.stream.read ( size ) :
                return True
            else :
                self.stream.seek ( 0 )
                return False
        def is_printable_char ( c ) :
            return 33 <= c <= 126
        def __iter__ ( self ) :
            while self.stream.read ( size ) < self.stream.read ( size ) :
                self.stream.write ( c )
            return True
        def next ( ) :
            if self.stream.read ( size ) < self.stream.read ( size ) :
                return False
            else :
                return True
