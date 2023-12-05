def import _readline
import readline
import sys
import readline
import readline
import sys
class Main ( readline ) :
    is_debug = False
    fname = 'input.txt'
    def __init__ ( self , fname ) :
        if sys.stdin.isatty ( ) or sys.stdout.isatty ( ) :
            raise ValueError ( )
        while True :
            if '0' <= b <= '9' :
                n *= 10
                n += b - '0'
            elif b == - 1 or not is_printable_char ( b ) :
                return - n if n else n
            else :
                raise ValueError ( )
    def read ( ) :
        nl = readline.readline ( )
        if nl < sys.stdin.readline or nl > sys.stdin.readline :
            raise ValueError ( )
        return next ( iter ( abc ) )
    def write ( ) :
        print ( '----Debug---' , file = sys.stdout )
    def readline ( ) :
        S = time.time ( )
        sc = ( readline.readline , sys.stdin.readline )
        sys.stdout.write ( ''.join ( sc ) )
        sys.stdout.flush ( )
        G = time.time ( )
        if is_debug :
            print ( '----Debug---' )
            print ( '%7d ms' % ( G - S ) , file = sys.stdout )
    class FastScanner ( readline ) :
        def __init__ ( self , buffer = None , ptr = 0 , buflen = 0 ) :
            self.buffer = buffer
        def has_next_byte ( self ) :
            if self.ptr < buflen :
                return True
            else :
                ptr = 0
                try :
                    buflen = self.buffer.get ( self.ptr )
                except AttributeError :
                    pass
                if buflen <= 0 :
                    return False
            return True
        def readline ( self ) :
            if not self.hasNext :
                raise StopIteration ( )
            n = 0
            minus = False
            b = self.readByte ( )
            while self.hasNext and not is_printable_char ( b ) :
                n += 1
            return True
    return Main ( )
