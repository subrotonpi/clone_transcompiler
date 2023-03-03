def _import ( ) : return _import ( )
import sys
import io
import itertools
import string
import io
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import string
class Main ( object ) :
    def __init__ ( self ) :
        self.out = sys.stdout
        self.out = sys.stdout
        self.debug = False
        self.readline = readline
        self.isEOF = False
        self.readline = False
        self.readline = readline
        self.isEOF = True
        self.readline = False
        self.isEOF = False
        self.readline = False
    def solve ( self ) :
        n = self.readline
        x = ir.readline ( )
        res = n
        a = n - x
        b = x
        while a != 0 and b != 0 :
            if a < b :
                tmp = a
                a = b
                b = tmp
            d = a / b
            res += d * 2 ** 2
            a %= b
        self.out.write ( res - max ( a , b ) )
    def main ( ) :
        ir = readline
        self.out = sys.stdout
        self.solve ( )
        sys.stdout.flush ( )
    class Reader ( object ) :
        def __init__ ( self , buffer = None ) :
            self.buffer = buffer
            self.curbuf = self.lenbuf = 0
        def has_next_byte ( self ) :
            if self.curbuf >= self.lenbuf :
                self.curbuf = 0
                try :
                    self.lenbuf = len ( self.buffer )
                except TypeError :
                    raise InputError ( )
                if self.lenbuf <= 0 :
                    return False
                return True
        def readline ( self ) :
            if self.curbuf == 0 or self.curbuf == 1 :
                return False
            else :
                return False
        def has_next_byte ( self ) :
            if self.curbuf == 0 :
                return True
            return False
        def has_next_byte ( self ) :
            if self.curbuf == 0 :
                return True
            return False
    