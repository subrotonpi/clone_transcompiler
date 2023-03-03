def _import ( ) : return _import ( )
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.idx = [ ]
    def __init__ ( self ) :
        self.A = [ ]
        self.even = [ ]
        self.odd = [ ]
        self.all = [ ]
    def main ( self ) :
        f = open ( self.dat )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.readline ( )
        f.write ( " " )
    def update ( self , val ) :
        self.idx += [ val ]
        while self.idx > 0 :
            self.idx = self.idx - 1
            self.dat = min ( self.dat [ self.idx * 2 + 1 ] , self.idx )
