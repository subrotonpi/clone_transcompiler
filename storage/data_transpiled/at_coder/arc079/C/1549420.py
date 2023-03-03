def _import ( ) : return next ( )
import sys
import termios
import sys
import struct
import termios
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.isatty = 0
        self.skipWhileSpace = True
        self.stdin.read ( 1 )
        self.stdout.write ( '' )
        self.skipWhileSpace = False
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdout.write ( '' )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
        self.stdin.read ( 1 )
    def count ( self , a ) :
        cnt = 0
        n = len ( a )
        for i in range ( n ) :
            c = a [ i ] / n
            cnt += c
            a [ i ] -= c * ( n + 1 )
        if self.cnt == 0 :
            return 0
        for i in range ( n ) :
            a [ i ] += cnt
        return cnt + count ( self.stdin.read ( 1 ) )
    def debug ( self , * args ) :
        print ( "".join ( args ) , file = sys.stderr )
