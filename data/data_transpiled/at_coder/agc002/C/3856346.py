def import import sys , string , traceback
from os import urandom
from random import randint
class Main ( object ) :
    def __init__ ( self ) :
        self.s = sys.stdin
        self.N = randint ( 1 , 10000 )
        self.L = randint ( 1 , 10000 )
        self.a = [ randint ( 1 , N ) for n in range ( self.N ) ]
        root = - 1
        for n in range ( 1 , N ) :
            if self.a [ n ] + self.a [ n - 1 ] >= self.L :
                root = n
        if root < 0 :
            print ( "Impossible" )
            return
        print ( "Possible" )
        for i in range ( 1 , root ) :
            print ( i )
        for i in range ( N - 1 , root - 1 , - 1 ) :
            print ( i )
        print ( root )
