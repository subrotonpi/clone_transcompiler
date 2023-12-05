def _ _ main _ _ ( ) : return sys.stdin
import os
import sys
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import Queue
import tokenize
import tokenize
import tokenize
import tokenize
import StringIO
import tokenize
import tokenize
import tokenize
import tokenize
import StringIO
import csv
class Main ( object ) :
    def __init__ ( self ) :
        self.input_file = sys.stdin
        self.output_file = sys.stdout
        self.input_stream = open ( self.input_file , "r" )
        self.output_file = sys.stdout
        self.output_file = open ( self.output_file , "w" )
        self.solver = TaskD ( )
        self.solve ( 1 , self.input_file , self.output_file )
        self.output_file.close ( )
    def solve ( self , test_number , input_stream , output_file ) :
        n = self.test_number
        l = [ Node ( ) for i in range ( 1 , n + 1 ) ]
        for a , b in zip ( self.input_stream , self.input_stream ) :
            a.neighbors.append ( b )
            b.neighbors.append ( a )
        q = Queue ( )
        seen = set ( )
        q.put ( self.l [ 0 ] )
        seen.add ( self.l [ 0 ] )
        while not q.empty ( ) :
            cur = q.get ( )
            for node in cur.neighbors :
                if node not in seen :
                    node.first = cur.second + 1
                    q.put ( node )
                    seen.add ( node )
        seen = set ( )
        q.put ( self.l [ n - 1 ] )
        seen.add ( self.l [ n - 1 ] )
        size = 0
        while not q.empty ( ) :
            cur = q.get ( )
            if cur.second < cur.first :
                size += 1
            for node in cur.neighbors :
                if node not in seen :
                    node.second = cur.second + 1
                    q.put ( node )
                    seen.add ( node )
        return self.solver
