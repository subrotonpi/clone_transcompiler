def import import sys , string , traceback ;
from os import urandom
import random
class Main ( object ) :
    def __init__ ( self ) :
        self.buffer = sys.stdout
    def __call__ ( self , * args , ** kwargs ) :
        if not args :
            print ( 'Hello World' )
        else :
            a = random.randint ( 0 , 100 )
            b = random.randint ( 0 , 100 )
            print ( a + b )
