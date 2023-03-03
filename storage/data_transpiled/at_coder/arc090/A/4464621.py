def import os , glob
import os
from math import sin , cos , cos , pow
from os import urandom
from os import urandom
from numpy import zeros , float32
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = urandom ( )
        self.N = int ( urandom ( ) )
        self.map = zeros ( ( 2 , N ) )
        for i in range ( 2 ) :
            for j in range ( N ) :
                self.map [ i , j ] = random.randint ( 0 , 2 )
        print ( func ( self.N , self.map ) )
    def func ( self , N , ar ) :
        dp = zeros ( ( 2 , N ) )
        dp [ 0 , 0 ] = ar [ 0 , 0 ]
        for i in range ( 2 ) :
            for j in range ( N ) :
                if i + 1 < 2 :
                    dp [ i + 1 , j ] = max ( dp [ i + 1 , j ] , dp [ i , j ] + ar [ i + 1 , j ] )
                if j + 1 < N :
                    dp [ i , j + 1 ] = max ( dp [ i , j + 1 ] , dp [ i , j ] + ar [ i , j + 1 ] )
        return dp [ 1 , N - 1 ]
