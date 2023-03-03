def import import _io , StringIO , StringIO , AMoveAndWin
from os import urandom
from os import urandom
from io import BytesIO
from os import urandom
from random import random
from os import urandom
from os import urandom
from io import StringIO
from os import urandom
from random import random
from io import BytesIO
from os import urandom
from os import urandom
from random import random
from pyamf.tools import AMoveAndWin
class Main ( object ) :
    input_file = urandom
    output_file = urandom
    f = LightScanner ( input_file )
    f = BytesIO ( output_file )
    solver = AMoveAndWin ( )
    solver.solve ( 1 , f , g )
    f.seek ( 0 )
class AMoveAndWin ( AMoveAndWin ) :
    def solve ( self , test_number , f , g ) :
        n , a , b = f.ints
        if ( b - a ) % 2 == 0 :
            g.write ( "Alice" )
        else :
            g.write ( "Borys" )
class LightScanner ( object ) :
    def __init__ ( self , stream = None ) :
        self.stream = stream
        self.tokenizer = None
    def string ( self ) :
        if not self.tokenizer or not self.tokenizer.characters :
            try :
                self.tokenizer = self.tokenizer.characters
            except AttributeError :
                raise EOFError ( )
        return self.tokenizer
    def ints ( self ) :
        return int ( self.string )
