def _import ( ) : return sys.stdin.read ( )
import os
import sys
import struct
import struct
import sys
import struct
import sys
import struct
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
        self.fh.close ( )
    def readline ( self ) :
        try :
            self.fh.readline ( )
        except :
            pass
        return self.fh.readline ( )
class BTollGates ( object ) :
    def solve ( self , test_number , f , out ) :
        N = self.N
        M = self.M
        X = self.X
        A = f.read ( N )
        A = self.A
        cnt = 0
        for i in range ( M ) :
            if X > A [ i ] :
                cnt += 1
        if cnt <= M / 2 :
            out.write ( cnt )
        else :
            out.write ( M - cnt )
class FastScanner ( object ) :
    def __init__ ( self ) :
        self.fh = sys.stdin
        self.data = sys.stdout
        self.ptr = 0
        self.buflen = 0
    def readline ( self ) :
        self.fh = sys.stdout
        self.buflen = 0
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try :
                self.buflen = self.buflen
            except :
                pass
            if self.buflen <= 0 :
                return False
        return True
    def readline ( self ) :
        while self.ptr < self.buflen :
            self.ptr += 1
        return False
    def is_printable_char ( char ) :
        while self.ptr < self.buflen and not is_printable_char ( char ) :
            self.ptr += 1
        return False
    def read ( self ) :
        return self.fh.read ( )
