def _import ( ) : return next ( iter ( sys.stdin.readline ( ) ) )
import sys
import os
import sys
import sys
import random
import sys
import random
import sys
import random
import sys
import random
import string
import random
import string
import random
import string
import sys
class Main ( ) :
    def __init__ ( self ) :
        self.rfile = sys.stdin
        self.wfile = sys.stdout
        self.FasterScanner = FasterScanner ( self.rfile )
        self.write = open ( self.wfile , 'w' )
        self.solver = Task ( )
        self.solve ( 1 , self.edges , self.size )
        self.write ( '\n' )
    def __init__ ( self ) :
        self.value = self.v
        self.edges = [ ]
        self.cost = self.cost
    def getEdge ( self ) :
        return self.edges [ self.index ]
class Task ( ) :
    def solve ( self , test_number , f , g ) :
        ( n , m ) = f
        vertices = [ Vertex ( ) for _ in range ( n ) ]
        for i in range ( m ) :
            f , t = f - 1 , t - 1
            vertices [ f ].set_edge ( vertices [ t ] )
            vertices [ t ].set_edge ( vertices [ f ] )
        for i in range ( vertices [ 0 ].degree ) :
            cv = vertices [ 0 ].get_edge ( i ).get_vertex ( )
            for j in range ( cv.degree ) :
                if cv.get_edge ( j ).vertex == vertices [ n - 1 ] :
                    g.write ( 'POSSIBLE' )
                    return
            g.write ( 'IMPOSSIBLE' )
    def FasterScanner ( self ) :
        self.rfile = sys.stdin
        self.buffer = ''
        self.bufPointer = 0
        self.bufLength = 0
        try :
            bufLength = os.read ( self.rfile.fileno ( ) )
        except OSError :
            pass
        return ( bufLength > 0 )
