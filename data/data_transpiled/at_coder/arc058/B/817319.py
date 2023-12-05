def _import ( ) : return _import ( '!' , '' )
import sys
import struct
import math
import StopIteration
class Main ( object ) :
    def __init__ ( self ) :
        self.fac = [ 0 ] * 200001
    def read ( self ) :
        if self.b == '-' :
            self.minus = True
            self.b = read_byte ( )
        if self.b < '9' :
            raise ValueError ( )
        while True :
            if self.b <= '9' :
                self.n *= 10
                self.n += self.b - self.a
            elif self.b == - 1 or not is_printable_char ( self.b ) :
                return - self.n
            else :
                raise ValueError ( )
        self.b = read_byte ( )
    def calc ( self ) :
        self.fac [ 0 ] = 1
        for i in range ( 1 , len ( self.fac ) ) :
            self.fac [ i ] = ( self.fac [ i - 1 ] * i ) % mod
    def mod_combi ( self , n , r ) :
        a = math.mod ( self.fac [ r ] , MOD )
        b = math.mod ( self.fac [ n - r ] , MOD )
        return self.fac [ n ] * a % mod * b % mod
class FastScanner ( object ) :
    def __init__ ( self ) :
        self.buffer = sys.stdin.read ( 1024 )
    def __init__ ( self ) :
        self.buffer = sys.stdin.read ( 1024 )
    def ptr ( self ) :
        self.buflen = 0
    def has_next_byte ( self ) :
        if self.ptr < self.buflen :
            return True
        else :
            self.ptr = 0
            try :
                self.buflen = len ( self.buffer )
            except TypeError :
                pass
            if self.buflen <= 0 :
                return False
        return True
    def read ( self ) :
        return self.buffer
    def advance ( self ) :
        self.next = read_byte ( )
