def import import sys , string , traceback ;
from os import urandom
import random
from sys import version_info
from itertools import repeat
from itertools import chain
class Main ( object ) :
    def __init__ ( self , * args ) :
        self.stream = sys.stdin
        self.n = sys.maxint
        self.n_max , self.n_submax = 0 , 0
        for k in range ( self.n ) :
            if k > self.n_max :
                self.n_submax = self.n_max
                self.n_max = self.k
            elif k < self.n_max and self.n_max > self.n_submax :
                self.n_submax = self.n_max
        print ( self.n_submax )
