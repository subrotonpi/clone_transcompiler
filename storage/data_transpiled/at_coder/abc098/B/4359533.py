def import import os , string , frozenset
from os import urandom
from random import randint
class Main ( object ) :
    def __init__ ( self ) :
        self.n = randint ( 1 , 10000 )
        self.s = string
        self.max = 0
        for i in range ( 1 , n - 1 ) :
            x = set ( )
            y = set ( )
            for j in range ( i ) :
                x.add ( s [ j ] )
            for j in range ( i , n ) :
                y.add ( s [ j ] )
            count = len ( x.intersection ( y ) )
            if count > self.max :
                self.max = count
        print ( self.max )
        self.n = n
