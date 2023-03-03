def import import sys , string , randrange
from math import ceil
from os import urandom
from random import randint
class Main ( object ) :
    def __init__ ( self ) :
        self.s = int ( random ( ) )
        self.c = int ( random ( ) )
        self.ans = min ( self.s , c // 2 )
        self.s -= ans
        self.c -= ( ans * 2 )
        if self.s == 0 :
            self.ans += c // 4
        print ( self.ans )
        self.s = s
        self.c = c
    def __repr__ ( self ) :
        return string.encode ( self.s )
