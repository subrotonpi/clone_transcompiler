def import input_reader
import sys
import os
import sys
import sys
import os
import sys
import subprocess
import shlex
import shlex
class Main ( object ) :
    def __init__ ( self ) :
        self.input_file = sys.stdin
        self.output_file = sys.stdout
        self.stdin = InputReader ( self.input_file )
        self.stdout = open ( self.output_file , 'w' )
        self.solver = Task ( )
        self.solver.solve ( 1 , self.stdin , self.stdout )
        self.stdout.close ( )
class Task ( object ) :
    def solve ( self , test_number , input_reader , output_reader ) :
        A = input_reader.read ( )
        B = input_reader.read ( )
        output_writer.write ( "%d %d\n" % ( B , A ) )
class InputReader ( object ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.tokenizer = None
    def readline ( self ) :
        while not self.tokenizer or not self.tokenizer :
            try :
                self.tokenizer = shlex.split ( self.tokenizer )
            except ValueError :
                self.tokenizer = None
        return self.tokenizer
    def readline ( self ) :
        return self.tokenizer
