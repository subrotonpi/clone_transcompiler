def import input_reader
from sys import stdin , stdout
from os import urandom
from os import urandom
from random import choice
from random import random
from os import urandom
from os import urandom
from random import choice
from os import urandom
from random import random
from os import urandom
from random import choice
from os import urandom
from random import random
from os import urandom
from os import urandom
from os import urandom
from random import random
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = stdin
        self.stdout = stdout
        self.input_reader = InputReader ( self.stdin )
        self.output_reader = OutputWriter ( self.stdout )
        self.solver = choice
        self.solve ( 1 , self.input_reader , self.output_reader )
        self.close ( )
    def solve ( self , test_number , self , input , output ) :
        N , K , X , Y = input
        total = 0
        if N < K :
            for i in range ( N ) :
                total += X
        else :
            for i in range ( K ) :
                total += X
        for i in range ( N - K ) :
            total += Y
        output.write ( total )
    def input_reader ( self , stream ) :
        stream = open ( stream , 'r' , 32768 )
        stream.seek ( 0 )
        while stream is None or not stream.read ( 32768 ) :
            try :
                stream.seek ( 0 )
            except IOError :
                break
        return stream.read ( )
    def __next__ ( self ) :
        return int ( next ( stream ) )
