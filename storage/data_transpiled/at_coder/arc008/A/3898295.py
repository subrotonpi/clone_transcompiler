def _import ( ) : return sys.stdin.read ( )
import os
import sys
import os
import sys
import random
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin.readline ( )
        N = sc.__next__ ( )
        self.pl ( min ( ( ( N / 10 ) * 100 + ( N % 10 ) * 15 ) , ( ( N + 9 ) / 10 ) * 100 ) )
class SC ( object ) :
    def __init__ ( self , f ) :
        self.f = f
        self.tokens = None
    def readline ( self ) :
        if not self.tokens or not self.tokens [ 0 ] :
            try :
                self.tokens = list ( self.tokens )
            except AttributeError :
                raise StopIteration
        return self.tokens [ 0 ]
    def randint ( self ) : return int ( self.tokens [ 0 ] )
    def long ( self ) : return long ( self.tokens [ 1 ] )
    def uniform ( self , a ) : return float ( self.tokens [ 2 ] )
    def readline ( self ) :
        try :
            return self.readline ( )
        except AttributeError :
            raise StopIteration
    def pl ( self ) :
        print ( self.tokens )
    def p ( self ) :
        print ( self.tokens )
    def isPrime ( a ) :
        if a < 4 :
            if a == 2 or a == 3 :
                return True
            else :
                return False
        else :
            for j in range ( 2 , 2 * j <= a + 1 ) :
                if a % j == 0 :
                    return False
                if a % j != 0 and ( j + 1 ) * ( j + 1 ) > a :
                    return True
            return True
return Main
