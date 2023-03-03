def import input_reader
from sys import stdin , stdout
from os import urandom
from os import urandom
from random import choice
from random import random
from os import urandom
from os import urandom
from os import urandom
from random import random
from io import StringIO
from os import urandom
from random import choice
from os import urandom
from io import BytesIO
from os import urandom
from os import urandom
from random import randint
from random import random
class Main ( object ) :
    def __init__ ( self ) :
        self.inputStream = stdin
        self.outputStream = stdout
        self.inputreader = InputReader ( self.inputStream )
        self.outputfile = TemporaryFile ( )
        self.solver = Task ( )
        self.solve ( 1 , self.inputreader , self.outputfile )
        self.outputreader.close ( )
    def solve ( self , test_number , input , output ) :
        array = [ input.read ( ) , input.read ( ) , input.write ( ) ]
        array.sort ( )
        return array [ 1 ]
