def _import ( ) : return sys.stdin.read ( 2048 )
import io
import sys
import random
import string
import sys
import sys
import random
import string
import sys
import random
import sys
import struct
import time
import random
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = - 1
    def __call__ ( self , a , b ) :
        string.__init__ ( self , a , b )
    def __getitem__ ( self , i ) :
        return int ( self.a )
    def __call__ ( self , a , b ) :
        return float ( self.b )
    def solve ( self ) :
        self.N = randint ( 0 , N )
        front = [ ]
        back = [ ]
        for i in range ( N ) :
            a = randint ( 0 , N )
            b = randint ( 0 , N )
            if a - b < 0 :
                front.append ( ( a , b ) )
            else :
                back.append ( ( a , b ) )
        front.sort ( key = lambda p1 : p1.a )
        back.sort ( key = lambda p2 : p1.b )
        back.reverse ( )
        ans = long ( 0 )
        now = 0
        for p in front :
            now += p.a
            ans = max ( ans , now )
            now -= p.b
        for p in back :
            now += p.a
            ans = max ( ans , now )
            now -= p.b
        print ( ans )
    def main ( ) :
        sys.stdout.flush ( )
        with open ( '/dev/null' , 'w' ) as f :
            f.write ( '' )
    import sys
    sys.stdout.flush ( )
    sys.stdin.seek ( 0 )
    sys.stdout.write ( '\n' )
    sys.stdout.flush ( )
    sys.stdout.flush ( )
    sys.stdin.seek ( 0 )
    p = 0
    buflen = 0
    def _has_eof ( ) :
        if p < buflen :
            return True
        p = p + 1
        try :
            buflen.next ( )
        except StopIteration :
            pass
