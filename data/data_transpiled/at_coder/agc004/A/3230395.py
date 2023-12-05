def import import sys , StringIO , ADivideACuboid
from os import urandom
from os import urandom
from random import random
from os import urandom
from os import urandom
from random import random
class Main ( object ) :
    input_file = urandom ( 32 )
    output_file = urandom ( 32 )
    def __init__ ( self , input_file , output_file ) :
        self.input_file = input_file
        self.output_file = output_file
        self.solver = ADivideACuboid ( )
        self.solver.solve ( 1 , input_file , output_file )
        self.output_file.close ( )
    def solve ( self , test_number , infile , outfile ) :
        a , b , c = infile.read ( ) , infile.read ( ) , infile.read ( )
        outfile.write ( a * b * c if self.test_number % 2 else min ( a * b , min ( b * c , c * a ) ) )
