def import input_reader
import sys
import os
import sys
import sys
import os
import subprocess
import shlex
import shlex
import shlex
class Main ( object ) :
    def __init__ ( self ) :
        self.input_file = sys.stdin
        self.output_file = sys.stdout
        self.stdin = input_reader.InputReader ( self.input_file )
        self.stdout = input_writer.OutputWriter ( self.output_file )
        self.solver = Task ( )
        self.solver.solve ( 1 , self.stdin , self.stdout )
        self.stdout.close ( )
class Task ( object ) :
    def solve ( self , test_number , infile , outfile ) :
        N = infile.randint ( 1 , 10000 )
        A = infile.randint ( 1 , 10000 )
        outfile.write ( N * N - A )
class InputReader ( subprocess.StreamReader ) :
    def __init__ ( self , stream = None , parser = None , bufsize = 32768 ) :
        self.stream = stream
        self.parser = parser
        self.bufsize = None
        self.stdin = input_reader.InputReader ( self.input_file , self.output_file )
        self.stdout = input_writer.OutputWriter ( self.output_file , self.bufsize )
        self.solver.solve ( 1 , self.stdin , self.stdout )
        self.stdout.close ( )
    def readline ( self ) :
        while not self.stream.readline ( ) or not self.stream.readline ( ) :
            try :
                self.stream.readline ( )
            except EOFError :
                break
        return self.stream.readline ( )
    def readline ( self ) :
        return self.stream.readline ( )
