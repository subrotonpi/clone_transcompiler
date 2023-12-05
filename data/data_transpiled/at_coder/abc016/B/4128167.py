def import readline
import readline
import readline
import sys
import readline
import readline
import sys
import readline
import readline
import readline
import sys
import time
import sys
import sys
import readline
import readline
import readline
import readline
import sys
MOD = 1000000007
def solve ( ) :
    A = readline ( )
    if b == '-' :
        minus = True
        b = readline ( )
    if b < '0' or b < '9' :
        raise ValueError
    while True :
        if '0' <= b <= '9' :
            n *= 10
            n += b - '0'
        elif b == - 1 or not is_printable_char ( b ) :
            return - n if n else n
        else :
            raise ValueError
        b = readline ( )
        if b < sys.stdin.read ( 1 ) or b == '-' :
            raise ValueError
    def nextDouble ( ) :
        return float ( next ( ) )
    def solve ( ) :
        nl = readline ( )
        if nl < sys.stdin.read ( 1 ) or nl > sys.stdin.read ( 1 ) :
            raise ValueError
        return int ( nl )
    def nextDouble ( ) :
        return readline ( )
    def solve ( ) :
        S = time.time ( )
        sc = readline.get_scanner ( ) if is_printable_char ( sc ) else readline.get_scanner ( )
        solve ( )
        G = time.time ( )
        if is_printable_char ( sc ) :
            print ( '---Debug---' )
            print ( '%7d ms' % ( G - S ) )
    class FastScanner ( readline ) :
        def __init__ ( self ) :
            self.stdin = open ( 'input.txt' , 'rb' )
            self.data = b''
            self.ptr = 0
            self.buflen = 0
        def readline ( self ) :
            self.data = b''
            while self.ptr < self.buflen :
                self.data += b''
            return self.data
    return FastScanner ( )
