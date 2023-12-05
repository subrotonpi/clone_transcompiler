def import import sys
from os.path import getsize
from os import urandom
from random import randint
class Main ( object ) :
    def __init__ ( self ) :
        self.n = randint ( 1 , 10000 )
        self.m = randint ( 1 , 10000 )
        self.a = [ ]
        self.d = { }
        ans = 0
        self.a.append ( randint ( 1 , 10000 ) )
        for i in range ( 1 , n ) :
            self.a [ i ] = randint ( 1 , 10000 ) + self.a [ i - 1 ]
        for i in range ( n ) :
            if self.a [ i ] % m in self.d :
                self.d [ self.a [ i ] % m ] = self.d [ self.a [ i ] % m ] + 1
            else :
                self.d [ self.a [ i ] % m ] = 1
        for i in self.d :
            q = self.d [ i ]
            if i == 0 :
                ans += q
            ans += ( q * ( q - 1 ) ) / 2
        print ( ans )
