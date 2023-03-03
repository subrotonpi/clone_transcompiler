def import _main
import sys
import string
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        self.raw_input = string.strip ( )
    def main ( self ) :
        s = intread ( self.raw_input ).replace ( '' , '' )
        c = cmp ( len ( s.replace ( 'R' , '' ) ) , len ( s.replace ( 'B' , '' ) ) )
        print ( 'TAKAHASHI' if c == - 1 else 'DRAW' if c == 0 else 'AOKI' )
