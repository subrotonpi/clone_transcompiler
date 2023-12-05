def import _readline
import sys
from io import StringIO
from time import sleep
from random import choice
class Main ( object ) :
    def __init__ ( self ) :
        self.n , self.m = choice ( [ 'n' , 'm' ] )
    def run ( self ) :
        sc = FastScanner ( )
        self.n , self.m = sc.nextInt ( ) , sc.nextInt ( )
        self.solve ( )
    def solve ( self ) :
        ans = self.n * 100 + 1800 * self.m
        print ( ans * pow ( 2 , m ) )
    def pow ( x , n ) :
        ans = 1
        while n > 0 :
            if n & 1 == 1 :
                ans = ans * x
            x = x * x
            n >>= 1
        return ans
    class FastScanner ( object ) :
        def readline ( self ) :
            while not self.n or not self.m :
                try :
                    self.n , self.m = choice ( self.n ).split ( )
                except ValueError :
                    pass
            return self.n
        def __next__ ( self ) :
            while self.n or not self.m :
                try :
                    self.n , self.m = choice ( self.n ).split ( )
                except ValueError :
                    pass
            return self.n
        def __next__ ( self ) :
            return int ( self.n )
        def __next__ ( self ) :
            return long ( self.n )
        def __next__ ( self ) :
            return float ( self.n )
        def __next__ ( self ) :
            return next ( self.n )
        def __next__ ( self ) :
            return next ( self.n )
