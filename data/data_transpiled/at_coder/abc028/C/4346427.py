def import import max , a , b , c , d , e
from os import urandom
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.a = random.randint ( 1 , 10000 )
        self.b = random.randint ( 1 , 10000 )
        self.c = random.randint ( 1 , 10000 )
        self.d = random.randint ( 1 , 10000 )
        self.e = random.randint ( 1 , 10000 )
        print ( max ( self.e + d + a , self.e + c + b ) )
