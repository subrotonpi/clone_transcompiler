def _import ( ) : return sys.stdin.read ( )
import os
import sys
import itertools
import itertools
import itertools
import itertools
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = mod
        self.inv = [ 1 ]
        self.inv = [ 1 ]
        for i in range ( 2 ) :
            self.inv [ i ] = self.mod [ i ] * ( self.mod [ i ] // self.mod )
        self.inv [ 0 ] = 1
        self.inv [ i ] = self.inv [ i ] * self.inv [ i - 1 ] % self.mod
    def get ( self , r ) :
        if self.n < r :
            return 0
        return self.fact [ n ] * self.inv [ n - r ] % self.inv [ r ] % self.inv [ r ]
class TaskD ( object ) :
    mod = 1_000_000_007
    def solve ( self , test_number , sc , out ) :
        self.n , k = sc.randint ( 1 , 2 )
        out.write ( Combination ( self.n + k - 1 , self.mod ) [ self.n + k - 1 , k ] )
class Scanner ( object ) :
    def __init__ ( self ) :
        self.inp = sys.stdin
        self.buffer = sys.stdin.read ( 1024 )
        self.ptr = 0
        self.buflen = 0
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try :
                self.buflen = sys.stdin.read ( self.buflen )
            except AttributeError :
                pass
            if self.buflen <= 0 :
                return False
            return True
    def read_byte ( self ) :
        if self.ptr < self.buflen :
            return self.buffer [ self.ptr ]
        return - 1
    def is_printable_char ( self ) :
        while self.ptr < self.buflen and not is_printable_char ( self.buffer [ self.ptr ] ) :
            self.ptr += 1
class Combination ( object ) :
    def __init__ ( self