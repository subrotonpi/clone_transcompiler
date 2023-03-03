def import input_reader
from sys import stdin , stdout
from os import urandom
from os import urandom
from random import random
from os import urandom
from random import random
from os import urandom
from os import urandom
from random import random
from io import StringIO
from os import urandom
from random import random
from io import StringIO
from os import urandom
from os import urandom
from random import random
class Main ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream = BytesIO ( )
        self.stream = BytesIO ( )
        self.writer = self.stream
        self.solver = Task ( )
        self.solve ( 1 , stream , self.stream )
        self.stream.seek ( 0 )
    def solve ( self , test_number , self , stream ) :
        S = self.stream.read ( )
        for i in range ( len ( S ) - 2 , 0 , - 2 ) :
            if S [ : i // 2 ] == ( S [ i // 2 : i ] ) :
                self.stream.seek ( i )
                break
        return self.solver.solve ( test_number , self.stream , self.stream )
    def readline ( self ) :
        while not self.stream.readline ( ) or not self.stream.readline ( ) :
            try :
                self.stream.readline ( )
            except EOFError :
                pass
        return self.stream.readline ( )
    def next_char ( self ) :
        return self.stream.read ( self.stream.tell ( ) )
    def randint ( self , size ) :
        return int ( self.stream.tell ( ) )
    def uniform ( self , size ) :
        return uniform ( size , size )
