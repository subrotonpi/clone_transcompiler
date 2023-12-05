def _import ( ) : return _import ( '' )
import sys
import string
import string
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
    def read ( self ) :
        self.stdout = sys.stdout
        self.stdout = sys.stdout
        self.A = int ( self.stdin.read ( ) )
        self.B = int ( self.stdin.read ( ) )
        self.M = int ( self.stdin.read ( ) )
        self.g = gcd ( A , B )
        self.left = self.solve ( A , self.M )
        self.right = self.solve ( B , 1 , self.M )
        self.ans = ( self.left * self.right ) % M
        self.stdout.write ( self.ans )
        self.stdout.flush ( )
    def solve ( self , a , g , m ) :
        base = pow ( 10 , g - 1 , m )
        cur = ( a // g ) - 1
        a10 = base * 10 % m
        keta = 1
        ret = 0
        while cur > 0 :
            if cur % 2 :
                ret = ( ret + base * keta ) % m
                keta *= a10
                self.keta %= m
            base = ( base * a10 + base ) % m
            a10 *= a10
            self.a10 %= m
            cur /= 2
        ret *= 10
        ret += 1
        ret %= m
        return ret
    def gcd ( self , a , b ) :
        return b or self.a
    def read ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stdout = sys.stdout
        self.sep = ' '
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.sgn = 0
        self.stdout = sys.stdout
        self.sgn = 0
        self.stdout = 0
        self.sgn = 0
    def read ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.stdout = sys.stdout
        self.sgn = 0
