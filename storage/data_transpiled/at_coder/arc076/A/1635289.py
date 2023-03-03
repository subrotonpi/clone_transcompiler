def _import ( ) : return sys.stdout.write
import readline
import readline
import time
import math
import random
import sys
class Main ( ) :
    MOD = int ( 1e9 ) + 7
    def solve ( self ) :
        N , M = randint ( 0 , 1e9 ) , randint ( 0 , 1e9 )
        if abs ( N - M ) >= 2 :
            self.out.write ( 0 )
            return
        ans = 1
        for i in range ( N , 1 , - 1 ) :
            ans *= i
            ans %= MOD
        for i in range ( M , 1 , - 1 ) :
            ans *= i
            ans %= MOD
        if N % 2 == M % 2 :
            ans *= 2
            ans %= MOD
        self.out.write ( ans )
    def main ( self ) :
        sys.stdout.flush ( )
        with open ( '/dev/null' , 'w' ) as f :
            f.write ( '' )
    def read ( self , p = 0 ) :
        buflen = None
        def has_next_byte ( ) :
            if p < self.buflen : return True
            p = 0
            try :
                buflen = self.stream.read ( 2048 )
            except EOFError :
                pass
            if buflen <= 0 : return False
            return True
        def has_next_byte ( ) :
            while self.stream.read ( p ) and not is_print ( self.stream.read ( ) ) :
                p += 1
            return self.stream.read ( p )
        def is_print ( ch ) :
            if ch in '!' and ch in '~' : return True
            return False
        def next_byte ( ) :
            if not self.stream.read ( p ) : return - 1
            return self.stream.read ( p )
        def next ( self ) :
            if not self.stream.read ( p ) : raise EOFError
        s = [ ]
        b = - 1
        while is_print ( next ( s ) ) :
            s.append ( next ( s ) )
        return s
    def next ( self ) :
        return next ( s )
