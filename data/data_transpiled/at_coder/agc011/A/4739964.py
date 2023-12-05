def _import ( ) : return 33
import sys
import os
import sys
import string
import string
import string
import string
import input
import input
import input
import input
from scanner import Scanner
class Main ( Scanner ) :
    def __init__ ( self , stream ) :
        self.N = ord ( 'a' )
        self.C = ord ( 'c' )
        self.K = ord ( 'K' )
        self.T = [ ]
        for i in range ( 0 , N , 1 ) :
            self.T.append ( input ( ) )
        self.T.sort ( )
        self.bus = 1
        self.c = self.C - 1
        self.maxT = self.T [ 0 ] + self.K
        for i in range ( 1 , N , 1 ) :
            if self.c == 0 or self.T [ i ] > self.maxT :
                self.c = self.C - 1
                self.bus += 1
                self.maxT = self.T [ i ] + self.K
            else :
                self.c -= 1
        stream.write ( self.bus )
    def main ( self ) :
        w = sys.stdout
        exec ( string.printable , w )
        w.flush ( )
