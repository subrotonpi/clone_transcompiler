def import input_reader
from sys import stdin , stdout
from os import urandom
from random import randint
from math import sin , cos
from itertools import izip , izip , repeat
class Main ( input_reader ) :
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream = stream
        self.stream = sys.stdout
        self.reader = input_reader
        self.stream = sys.stdin
        self.writer = sys.stdout
        self.solver = Task ( )
        self.solver.solve ( 1 , stream , self.stream )
        self.stream.close ( )
class Task ( object ) :
    def solve ( self , test_number , stream , self ) :
        N = randint ( 1 , 10000 )
        self.stream.write ( N )
        for i in range ( N ) :
            self.stream.write ( 1 )
class InputReader ( input_reader ) :
    def __init__ ( self , stream , stream ) :
        self.stream = stream
        self.stream = input_reader
        self.tokenizer = None
    def next ( self ) :
        while not stream or not stream :
            try :
                stream = self.stream.readline ( )
            except EOFError :
                stream.close ( )
        return stream.__next__ ( )
    def __next__ ( self ) :
        return int ( next ( ) )
