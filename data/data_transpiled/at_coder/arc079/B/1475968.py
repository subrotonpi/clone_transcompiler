def _import ( ) : return int ( next ( ) )
import sys
import tempfile
import time
import sys
import random
import sys
class Main ( object ) :
    def solve ( self ) :
        K = randint ( 0 , N )
        N = 50
        a = [ ]
        for i in range ( 50 ) :
            a.append ( i )
        x = K // N
        y = K % N
        for i in range ( N ) :
            a [ i ] += N * x
            a [ i ] -= ( N - 1 ) * x
            a [ i ] -= y
            if i < y :
                a [ i ] += N + 1
        print ( N )
        for i in range ( N ) :
            if i != 0 :
                print ( " " , end = '' )
            print ( a [ i ] , end = '' )
        print ( )
    def main ( self ) :
        sys.stdout.flush ( )
        with open ( '/dev/null' , 'w' ) as f :
            f.write ( '' )
    def read ( self , p = 0 ) :
        buflen = None
        def has_next_byte ( ) :
            if p < self.buflen :
                return True
            p = 0
            try :
                buflen = f.read ( 2048 )
            except AttributeError :
                pass
            if buflen <= 0 :
                return False
            return True
        def has_next_byte ( ) :
            while has_next_byte ( ) and not is_print ( self.buffer [ p ] ) :
                p += 1
            return has_next_byte ( )
        def is_print ( self ) :
            if self.peek ( ) [ 0 ] == '!' and self.peek ( ) [ 0 ] == '~' :
                return True
            return False
        def next_byte ( ) :
            if not has_next_byte ( ) :
                return - 1
            return self.buffer [ p ]
        def next_byte ( ) :
            if not has_next_byte ( ) :
                raise StopIteration
            yield next_byte
