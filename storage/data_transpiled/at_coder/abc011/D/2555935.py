def import readline
import sys
from os import urandom
from io import BytesIO
from os import urandom
from random import randint
from sys import random
class Main ( object ) :
    def __init__ ( self ) :
        super ( Main , self ).__init__ ( )
        self.n , self.d , self.x , self.y = randint ( 0 , randint ( 0 , randint ( 0 , randint ( 0 , randint ( 0 , randint ( 0 , randint ( 0 , randint ( 0 , randint ( 0 , randint ( 0 , randint ( 0 , randint ( 0 , randint ( 0 , 0 , randint ( 0 , 0 , 0 ) ) ) ) ) ) ) ) ) ) ) )
        self.n = self.n
        self.x = self.x
        self.y = self.y
        self.solve ( )
    def solve ( self ) :
        if self.x % self.d != 0 or self.y % self.d != 0 :
            print ( 0.0 )
            return
        x_num = abs ( self.x ) // self.d
        y_num = abs ( self.y ) // self.d
        if x_num + y_num > self.n or ( self.n - x_num - y_num ) % 2 == 1 :
            print ( 0.0 )
            return
        comb = [ [ 1 ] * ( self.n - x_num ) for i in range ( 1 , 1001 ) ]
        for i in range ( 1 , len ( comb ) ) :
            for j in range ( 0 , i ) :
                comb [ i ] [ j ] = ( comb [ i - 1 ] [ j ] + ( j > 0 ? comb [ i - 1 ] [ j - 1 ] : 0 ) ) * 0.5
        ans = 0
        diff = self.n - x_num - y_num
        for i in range ( 0 , diff , 2 ) :
            ans += comb [ x_num + i ] [ x_num + i // 2 ] * comb [ y_num + diff - i ] [ y_num + ( diff - i ) // 2 ] * comb [ n ] [ x_num + i ]
        print ( ans )
class FastReader ( object ) :
    def __init__ ( self ) :
        self.s = FastReader ( )
    def readline ( self ) :
        while not self.s