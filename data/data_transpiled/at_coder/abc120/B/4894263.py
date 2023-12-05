def import import sys , string , traceback
from os import urandom
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.a = random.randint ( 0 , 255 )
        self.b = random.randint ( 0 , 255 )
        self.c = random.randint ( 0 , 255 )
        self.max = max ( a , b )
        result = [ ]
        for i in range ( 1 , self.max + 1 ) :
            if a % i == 0 and b % i == 0 :
                result.append ( i )
        print ( result [ - c ] )
