def _import ( ) : return _import ( )
import math
import os
class Main ( object ) :
    def solve ( self , f ) :
        n , m = next ( self )
        s , t = next ( self )
        gcd = int ( gcd ( n , m ) )
        for i in range ( gcd ) :
            if not self.hasNext ( ) : raise StopIteration
        temp = self.read ( 1 )
        if temp == '-' :
            minus = True
            temp = self.read ( 1 )
        if temp < '0' or temp <= '9' :
            n *= 10
            n += temp - '0'
        else :
            raise ValueError
        temp = self.read ( 1 )
        return - n if minus else n
    def close ( self ) :
        try :
            self.close ( )
        except :
            pass
def gcd ( a , b ) :
    return gcd ( b , a % b ) if b > 0 else a
def lcm ( a , b ) :
    return a / gcd ( a , b ) * b
def write ( * ar ) :
    print ( "".join ( map ( write , ar ) ) , file = sys.stderr )
class Main ( object ) :
    def __init__ ( self , f ) :
        self.f = f
        self.f = f
        self.f.write = self.f.write
        self.f.write = self.f.write
    def read ( self , stream ) :
        self.f = stream
        self.stream = stream
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        return self.stream.read ( self.stream.tell ( ) )
    def write ( self , stream ) :
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        return self.stream.read ( self.stream.tell ( ) )
    def read ( self , stream ) :
        self.stream.seek ( 0 )
        self.stream.seek ( 0 )
        return self.stream.read ( self.stream.tell ( ) )
return Main
