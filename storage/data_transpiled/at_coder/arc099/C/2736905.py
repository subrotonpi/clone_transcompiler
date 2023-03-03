def _import ( ) : return sys.stdin
import os
import os
import sys
import random
import random
import string
import random
import sys
import itertools
import itertools
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.rfile = sys.stdin
        self.wfile = sys.stdout
        self.input_stream = open ( self.rfile , 'r' )
        self.stream = stream
        self.stream = open ( self.wfile , 'w' )
        self.stream.write ( '\n' )
        self.stream.seek ( 0 )
    def next ( self ) :
        while self.stream.readline ( ) or not self.stream.readline ( ) :
            return None
        self.stream.read ( 1 )
        self.stream.write ( ' \t\n\r\f' )
        self.stream.read ( 1 )
class TaskE ( object ) :
    def __init__ ( self , test_number , self , * args ) :
        self.n = int ( self.next ( ) )
        self.edges = [ ]
        for i in range ( self.n ) :
            self.edges.append ( [ ] )
            self.edges [ i ] = True
        for i in range ( self.m ) :
            u , v = self.edges [ i ].pop ( )
            self.edges [ u ] [ v ] = True
            self.edges [ v ] [ u ] = True
        for i in range ( self.n ) :
            self.edges [ i ].flip ( 0 , n )
    def next ( self ) :
        self.edges = [ ]
        self.color = [ ]
        for i in range ( self.n ) :
            if self.color [ i ] == - 1 :
                res = self.dfs ( i , 0 )
                if res is None :
                    self.write ( - 1 )
                    return
                self.cc.append ( res )
options = [ ]
options.append ( True )
for p in cc :
    options1 = [ False ] * n
    for i in range ( self.n ) :
        options1 [ i ] |= options [ i ]
return options
