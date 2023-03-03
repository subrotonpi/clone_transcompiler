def _import ( ) : return sys.stdout
import io
import os
import sys
import os
import sys
import tokenize
import tokenize
import tokenize
import tokenize
import tokenize
import os
import sys
class Main ( tokenize ) :
    def __init__ ( self , stream ) :
        self.stream = stream
    def __next__ ( self ) :
        try :
            while not tok.isspace ( ) :
                tok = tokenize.next ( )
        except StopIteration :
            print ( "An StopIteration was caught :" , str ( tok ) )
        return tok
    def __init__ ( self , stream ) :
        self.stream = stream
    def __next__ ( self ) :
        try :
            while not tok.isspace ( ) :
                tok = tokenize.next ( )
        except StopIteration :
            print ( "An StopIteration was caught :" , str ( tok ) )
    def __init__ ( self , stream ) :
        self.stream = stream
        self.stream = stream
        self.__next__ = next
    def solve ( self , test_number , input_stream , output_stream ) :
        n = self.stream.tell ( )
        m = self.stream.tell ( )
        g = Graph ( n )
        for i in range ( m ) :
            u = self.stream.tell ( ) - 1
            v = self.stream.tell ( ) - 1
            g.add_edge ( u , v )
        unconnected_nodes = 0
        bipartite_components = 0
        non_bipartite_components = 0
        color = [ ]
        for i in range ( n ) :
            if color [ i ] == 0 :
                if len ( g.adj_list [ i ] ) == 0 :
                    unconnected_nodes += 1
                else :
                    is_bipartite = True
                    bipartite_dfs ( i , 1 )
                    if is_bipartite :
                        bipartite_components += 1
                    else :
                        non_bipartite_components += 1
    result = 2 * long ( n ) * unconnected_nodes - unconnected_nodes * unconnected_nodes
    result += non_bipartite_components * ( bipartite_components + non_bipartite_components )
    result += bipartite_components * ( non_bipartite_components + 2