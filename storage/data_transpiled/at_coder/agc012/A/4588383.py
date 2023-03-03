def import import sys
import string
import sys
import random
import time
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sys.stdout = sys.__stdout__
        sys.stderr = sys.__stderr__
        sys.stdout = sys.__stdout__
        sys.stderr = sys.__stderr__
    def __init__ ( self ) :
        self.N = sys.maxsize
        self.lst = [ ]
        for i in range ( 3 * self.N ) :
            self.lst.append ( random.randint ( 0 , 2 ) )
        self.lst.sort ( reverse = True )
        self.sum = 0
        for i in range ( self.N ) :
            self.sum += self.lst [ 1 + ( 2 * i ) ]
        print ( self.sum )
