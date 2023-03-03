def import import StringIO
from itertools import islice
from itertools import chain
from itertools import product , repeat
from os import urandom
from random import randint
from itertools import chain
from itertools import product , repeat
from os import urandom
from os import fdopen , fdopen
from os.path import join
from os import urandom
from random import choice
from itertools import chain
class Main ( object ) :
    def __init__ ( self , stream = sys.stdout , ** kw ) :
        self.stream = stream
        self.stream = open ( join ( self.stream , 'a' ) , 'w' )
        self.stream = open ( join ( self.stream , 'a' ) , 'w' )
        self.solver = TaskA ( )
        self.solver.solve ( 1 , stream , self.solver )
        self.stream.close ( )
    def solve ( self , test_number , self , stream = sys.stdout ) :
        dj = self.stream.read ( 2 )
        sum = 0
        for i in range ( 7 ) :
            sum += max ( dj [ 0 ] [ i ] , dj [ 1 ] [ i ] )
        stream.write ( sum )
