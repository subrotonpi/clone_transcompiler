def _import ( ) : return sys.stdin.read ( )
import random
import time
import sys
import random
import sys
class Main ( object ) :
    def solve ( self ) :
        N = randint ( 0 , N )
        T = [ random.randint ( 0 , N ) for i in range ( N ) ]
        A = [ random.randint ( 0 , N ) for i in range ( N ) ]
        a = 1
        b = 1
        for i in range ( N ) :
            x = int ( max ( ( a + T [ i ] - 1 ) / T [ i ] , ( b + A [ i ] - 1 ) / A [ i ] ) )
            a = T [ i ] * x
            b = A [ i ] * x
        return a + b
    def main ( self ) :
        sys.stdout.flush ( )
        with open ( '/dev/null' , 'w' ) as f :
            f.write ( '' )
    def read ( self , p = 0 ) :
        buflen = None
        def has_next_byte ( ) :
            if p < self.buflen : return True
            p = p
            try :
                buflen = f.read ( 2048 )
            except TypeError :
                pass
            if buflen <= 0 : return False
            return True
        def has_next_byte ( ) :
            while has_next_byte ( ) and not is_print ( self.buffer [ p ] ) :
                p += 1
            return has_next_byte ( )
        def is_print ( self ) :
            if self.peek ( ) [ 0 ] == '!' and self.peek ( ) [ 0 ] == '~' : return True
            return False
        def next_byte ( ) :
            if not has_next_byte ( ) : return False
            return self.buffer [ p ]
        def next_byte ( self ) :
            if not has_next_byte ( ) : raise StopIteration
            s = [ ]
            b = - 1
            while is_print ( next ( s ) ) :
                s.append ( next ( s ) )
            return s
