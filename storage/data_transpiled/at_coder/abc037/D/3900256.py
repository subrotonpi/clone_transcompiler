def _import ( ) : return _import ( )
import struct
import math
import struct
import sys
class Main ( ) :
    MOD = 1000000007
    def __init__ ( self , ptr ) :
        self.ptr = ptr
        self.H = self.W = self.H
        self.W = self.W
        self.a = [ ]
        self.f = [ ]
        self.solved = [ ]
    def read ( self ) :
        nl = randint ( 0 , int ( self.ptr ) )
        if self.nl < int ( self.ptr ) or self.nl > int ( self.ptr ) :
            raise StopIteration
        while True :
            if self.b == '-' :
                self.minus = True
            if self.b < '0' or self.b <= '9' :
                self.n *= 10
            elif self.b == - 1 or not is_printable_char ( self.ptr ) :
                self.ptr += 1
            else :
                raise StopIteration
        b = self.read ( )
        if not self.hasNext :
            raise StopIteration
        self.n = 0
        self.minus = False
        b = self.read ( )
        if b == '-' :
            self.minus = True
        if self.b < '0' :
            self.n *= 10
        elif b == - 1 or not is_printable_char ( self.ptr ) :
            self.ptr += 1
        else :
            raise StopIteration
    def write ( self , data ) :
        if self.solved [ 0 ] :
            return data [ 0 ]
        ans = 1
        if self.i + 1 < self.H and self.a [ i + 1 ] [ j ] > self.a [ i ] [ j ] :
            ans = ( ans + self.f ( i + 1 , j ) ) % MOD
        if self.i - 1 >= 0 and self.a [ i - 1 ] [ j ] > self.a [ i ] [ j ] :
            ans = ( ans + self.f ( i , j + 1 ) ) % MOD
        if self.j - 1 >= 0 and self.a [ i ] [ j - 1 ] > self.a [ i ] [ j ] :
            ans = ans
            