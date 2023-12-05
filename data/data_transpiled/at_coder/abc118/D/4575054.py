def import import string , check , dp
from os import urandom
from random import randint
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        self.n = randint ( 1 , 10000 )
        self.m = randint ( 1 , 10000 )
        self.list = [ ]
        self.set = [ 0 , 2 , 5 , 5 , 4 , 5 , 6 , 3 , 7 , 6 ]
        self.a = [ ]
        self.dp = [ '' ] * ( n + 1 )
    def check ( self , a , b ) :
        if b is None or len ( a ) > len ( b ) :
            return True
        if len ( a ) < len ( b ) :
            return False
        return a > b
    def check ( self , a , b ) :
        if a is None :
            return False
        return a > b
    def check ( self , a , b ) :
        if a is None :
            return False
        return a > b
