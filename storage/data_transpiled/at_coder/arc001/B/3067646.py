def import import sys , StringIO , os , errno
from os import urandom
from os import urandom
from random import randint
from os import urandom
from os import urandom
from os import urandom
from random import random
class Main ( object ) :
    def __init__ ( self ) :
        self.rfile = urandom
        self.wfile = urandom
    def read ( self ) :
        return self.rfile.read ( self.rfile.fileno ( ) )
    def write ( self , data ) :
        return self.wfile.write ( data )
    def solve ( self , test_number , stdin = None , stdout = None ) :
        d = abs ( stdin.read ( ) - self.wfile.read ( ) )
        c = 0
        while d > 0 :
            if d >= 8 :
                c += 1
                d -= 10
                d = abs ( d )
            elif d >= 4 :
                c += 1
                d -= 5
                d = abs ( d )
            else :
                c += d
                d = 0
        return c
