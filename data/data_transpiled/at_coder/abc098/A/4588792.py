def import import sys
import os
import sys
import random
import time
class Main ( object ) :
    def __init__ ( self ) :
        self.stream = sys.stdin
    def __call__ ( self , * args , ** kwargs ) :
        a = random.randint ( 0 , 100 )
        b = random.randint ( 0 , 100 )
        x1 = a + b
        x2 = a - b
        x3 = a * b
        print ( max ( max ( x1 , x2 ) , x3 ) )
