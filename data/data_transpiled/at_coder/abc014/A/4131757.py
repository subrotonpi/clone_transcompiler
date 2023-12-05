def import _readline
import readline
import sys
import readline
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        self.debug = False
        self.fname = 'input.txt'
        if self.fname :
            self.fname = 'input.txt'
        else :
            self.fname = 'input.txt'
        def readline ( self ) :
            self.fname = 'input.txt'
    def readline ( self ) :
        self.fname = 'input.txt'
        self.MOD = 1000000007
        def solve ( ) :
            a = self.read ( 1 )
            b = self.read ( 1 )
            print ( ( b - ( a % b ) ) % b )
        def read ( self ) :
            return int ( self.fname )
    def readline ( self ) :
        S = time.time ( )
        self.sc = ( readline , self.fname ) if self.fname else readline
        self.solve ( )
        G = time.time ( )
        if self.debug :
            print ( '---Debug---' )
            print ( '%7d ms' % ( G - S ) )
    class Pair ( object ) :
        def __init__ ( self , to , len ) :
            self.to = to
            self.len = len
        def read ( self , t , l ) :
            self.to = t
            self.len = l
    class FastScanner ( object ) :
        def __init__ ( self , f ) :
            self.f = f
        def readline ( self ) :
            self.f = f
        def has_next_byte ( self ) :
            if self.ptr < self.buflen :
                return True
            else :
                self.ptr = 0
                try :
                    self.buflen = len ( self.f.read ( self.s ) )
                except AttributeError :
                    pass
                if self.buflen <= 0 :
                    return False
            return True
        def readline ( self ) :
            if self.fname == 'input.txt' :
                return ''
            else :
                return self.fname
    return Pair ( )
