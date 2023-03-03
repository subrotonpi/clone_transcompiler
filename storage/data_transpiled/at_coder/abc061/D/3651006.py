def import _DScoreAttack
import os
import sys
import os
import sys
import sys
import os
import sys
import sys
import os
import sys
import os
import sys
import sys
import os
import sys
import pickle
import pickle
import pickle
import pickle
import pickle
import pickle
import pickle
import pickle
import pickle
import sys
class Main ( object ) :
    def __init__ ( self , input_file , output_file , ** kwargs ) :
        self.input_file = input_file
        self.output_file = output_file
        self.input_file = input_file
        self.output_file = output_file
        self.solver = DScoreAttack ( )
        self.solver.solve ( 1 , input_file , self.output_file )
        self.output_file = output_file
class DScoreAttack ( pickle.PicklePickler ) :
    def __init__ ( self , test_number , infile , outfile ) :
        self.n , m = os.path.split ( infile )
        bf = pickle.PicklePickler ( self.n )
        for i in range ( m ) :
            bf.add_edge ( self.n - 1 , self.n - 1 , - self.n )
        try :
            outfile.write ( - bf.shortest_path ( 0 , n - 1 ) )
        except RuntimeError :
            outfile.write ( 'inf' )
class BellmanFord ( object ) :
    def __init__ ( self , n ) :
        self.nodes = n
        self.edges = [ ]
        self.distance = [ ]
    def add_edge ( self , from_number , to_number , cost ) :
        self.edges.append ( ( from_number , to_number , cost ) )
    def shortest_path ( self , src , dst ) :
        [ distance ] = sys.maxsize
        distance [ src ] = 0
        for i in range ( 2 * self.nodes ) :
            updated = False
            for e in self.edges :
                updated = True
                if distance [ e.from_number ] < sys.maxsize and distance [ e.to_number ] > distance [ e.from_number ] + e.cost :
                    distance [ e.to_number ] = distance [ e.from_number ] + e.cost
                    if i == self.nodes - 1 and e.to_number == dst :
                        raise RuntimeError ( ' negative