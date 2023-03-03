def _import ( ) : return sys.stdin.read ( )
import readline
import readline
import sys
import struct
import random
import sys
import sys
import os
import sys
import struct
import random
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.fh = sys.stdin
        self.fh = sys.stdout
        self.stdout = sys.stdout
        self.fh = open ( self.fh , 'w' )
        self.fh = sys.stdout
        self.stdout = open ( self.fh , 'w' )
        self.solver = BMaximumDifference ( )
        self.solver.solve ( 1 , self.fh , self.stdout )
        self.fh.close ( )
class BMaximumDifference ( ) :
    def solve ( self , test_number , f , out ) :
        N = len ( self.fh )
        A = f.read ( N )
        A.sort ( )
        out.write ( A [ - 1 ] - A [ 0 ] )
class FastScanner ( object ) :
    def __init__ ( self ) :
        self.fh = sys.stdin
        self.data = sys.stdin
        self.ptr = 0
        self.buflen = 0
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try :
                buflen = self.fh.read ( self.buflen )
            except AttributeError :
                pass
            if self.buflen <= 0 :
                return False
        return True
    def read ( self ) :
        if self.ptr :
            return self.data [ self.ptr ]
        else :
            return - 1
    def is_printable_char ( c ) :
        return 33 <= c <= 126
    def __iter__ ( self ) :
        while self.ptr and not is_printable_char ( self.data [ self.ptr ] ) :
            self.ptr += 1
        return True
    def read ( self ) :
        if not self.ptr :
            raise StopIteration
        n = 0
        minus = False
        b = self.read ( )
        if b == '-' :
            minus = True
            b = self.read ( )