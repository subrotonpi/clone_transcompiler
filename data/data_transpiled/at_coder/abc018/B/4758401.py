def import import sys , string , randrange
from os import urandom
from random import randint
class Main ( object ) :
    def __init__ ( self ) :
        self.s = string
        self.n = int ( self.n )
        self.l = [ randint ( 0 , n - 1 ) for i in range ( self.n ) ]
        self.r = [ randint ( 0 , n - 1 ) for i in range ( self.n ) ]
        for i in range ( self.n ) :
            tmp = ""
            for j in range ( len ( s ) ) :
                if j < self.l [ i ] or j > self.r [ i ] :
                    tmp += s [ j ]
                else :
                    tmp += s [ self.r [ i ] - ( j - self.l [ i ] ) ]
            s = tmp
        print ( s )
        self.s = s
