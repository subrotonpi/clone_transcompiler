def _import ( ) : return _import ( )
import math
import os
class Main ( object ) :
    def solve ( self , stream ) :
        n , m = next ( stream )
        s , t = next ( stream )
        gcd = int ( gcd ( n , m ) )
        i = 0
        while True :
            a , b = i * n // gcd , i * m // gcd
            if a >= n or b >= m :
                raise StopIteration
            if s [ a ] != t [ b ] :
                stream.write ( - 1 )
                return
            i += 1
        stream.write ( lcm ( n , m ) )
    def gcd ( a , b ) :
        return gcd ( b , a % b ) if b > 0 else a
    def lcm ( a , b ) :
        return a // gcd ( a , b ) * b
    def write ( self , * ar ) :
        print ( "".join ( map ( lambda x : x + "" , ar ) ) )
    def main ( self ) :
        stream = sys.stdin
        stream.write ( "\n" )
        self.main = Main ( )
        self.solve ( stream , stream )
        stream.close ( )
        stream.close ( )
    class FastScanner ( object ) :
        def __init__ ( self , stream ) :
            self.stream = stream
            self.stream = stream
        def has_next_byte ( self ) :
            if self.stream.read ( 1 ) < self.stream.read ( 1 ) :
                return True
            else :
                p = 0
                try :
                    length = stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( self.stream.read ( stream.stream.read ( stream.stream.read ( stream.stream.stream.read ( stream.stream.stream.stream.read ( stream.stream.stream.stream.stream ) ) )