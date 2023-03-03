def import readline
import sys
import readline
import readline
import readline
import time
import random
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        self.n , self.m = 0 , 0
        distances = [ ]
        for i in range ( n ) :
            for j in range ( n ) :
                if i != j :
                    distances [ i ] [ j ] = 1 << 60
        for i in range ( m ) :
            from_i = random.randint ( - 1 , 1 )
            to_i = random.randint ( - 1 , 1 )
            cost = random.randint ( - 1 , 1 )
            distances [ from_i ] [ to_i ] = cost
            distances [ to_i ] [ from_i ] = cost
        self.solve ( )
    def solve ( ) :
        wf = WarshallFloyd ( distances )
        wf.shortest_path ( )
        min_max = sys.maxint
        for i in range ( n ) :
            max = 0
            for j in range ( n ) :
                if wf.distances [ i ] [ j ] > max :
                    max = wf.distances [ i ] [ j ]
            if max < min_max :
                min_max = max
        print ( min_max )
    class WarshallFloyd ( EOFError ) :
        def __init__ ( self ) :
            self.distances = distances
            num_vertexes = len ( self.distances )
        def shortest_path ( self ) :
            for k in range ( num_vertexes ) :
                for i in range ( num_vertexes ) :
                    for j in range ( num_vertexes ) :
                        self.distances [ i ] [ j ] = min ( self.distances [ i ] [ j ] , self.distances [ i ] [ k ] + self.distances [ k ] [ j ] )
