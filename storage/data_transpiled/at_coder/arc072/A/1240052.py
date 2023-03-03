def _import ( ) : return sys.stdin.read ( 2048 )
import os
import sys
import struct
import math
class Main ( object ) :
    def __init__ ( self , mode ) :
        self.N = 0
        self.a = [ ]
    def calc ( self , mode ) :
        sum = 0
        cnt = 0
        for i in range ( self.N ) :
            sum += self.a [ i ]
            if i % 2 == mode :
                if sum <= 0 :
                    cnt += 1 - sum
                    sum = 1
            else :
                if sum >= 0 :
                    cnt += 1 + sum
                    sum = - 1
        return cnt
    def solve ( self ) :
        self.N = randint ( 1 , N )
        self.a = [ randint ( 1 , N ) for i in range ( self.N ) ]
        ans = min ( self.calc ( 0 ) , self.calc ( 1 ) )
        self.out.write ( ans )
    def main ( self ) :
        sys.stdout.flush ( )
        with open ( '/dev/null' , 'w' ) as f :
            f.write ( '' )
    def read ( self , p = 0 ) :
        self.p = p
        self.buflen = None
        def has_next_byte ( ) :
            if self.p < self.buflen : return True
            p = 0
            try :
                buflen = self.p
            except AttributeError :
                pass
            if self.buflen <= 0 : return False
            return True
        def has_next_byte ( ) :
            while self.p < self.buflen and not is_print ( self.buffer [ p ] ) :
                self.p += 1
            return self.p
        def is_print ( self ) :
            if self.ch in '!' and self.ch in '~' : return True
            return False
        def next_byte ( self ) :
            if not self.p : return - 1
            return self.buffer [ p ]
    def next_byte ( self ) :
        if self.p < self.buflen : raise StopIteration
        self.p += 1
        return next_byte
