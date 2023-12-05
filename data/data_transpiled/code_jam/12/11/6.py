def import import sys , random
from os import urandom
from random import seed
class A ( object ) :
    def __init__ ( self ) :
        self.__init__ ( )
    def run ( self ) :
        self.stdin = open ( FNAME + '.in' , 'r' )
        self.stdout = open ( FNAME + '.out' , 'w' )
        self.solve ( )
        self.stdout.close ( )
    def readline ( self ) :
        while not self.stdin or not self.stdout :
            try :
                self.stdin = open ( self.stdin , 'r' )
            except :
                self.stdin = sys.stdin
                self.stdout = sys.stdout
        return self.stdin.readline ( )
    def randint ( self ) :
        return int ( self.stdin.readline ( ) )
    def long ( self ) :
        return long ( self.stdin.readline ( ) )
    def uniform ( self ) :
        return float ( self.stdin.readline ( ) )
    FNAME = 'a'
    def solve ( self ) :
        tests = randint ( 1 , 4 )
        for test in range ( 1 , tests + 1 ) :
            print ( 'Case #%d: ' % test , end = ' ' , file = sys.stderr )
            n = randint ( 1 , 4 )
            m = randint ( 1 , 4 )
            p = [ random.uniform ( - n , n ) for n in range ( n ) ]
            ans = float ( 'inf' )
            def all_right ( self ) :
                for i in range ( len ( p ) ) :
                    all_right *= p [ i ]
                ans = min ( ans , ( m - n ) + 1 + ( 1 - all_right ) * ( m + 1 ) )
            ans = min ( ans , m + 2 )
