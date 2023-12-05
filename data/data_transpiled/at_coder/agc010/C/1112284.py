def _import ( ) : return sys.stdin
import readline
import readline
import readline
import readline
import readline
import readline
import sys
import numpy as np
import tokenize
class Main ( ) :
    def solve ( self ) :
        n = ni ( )
        a = nia ( n )
        g = Graph ( n , a )
        for i in range ( n - 1 ) :
            from , to = ni ( ) - 1 , ni ( ) - 1
            g.add_edge ( from , to )
        e = g.dfs ( 0 )
        if e == 0 :
            print ( 'YES' )
        else :
            print ( 'NO' )
    class Graph ( object ) :
        def __init__ ( self , n , a ) :
            self.n = n
            self.graph = [ ]
            self.a = a
            self.visited = [ ]
        def add_edge ( self , from_to ) :
            self.graph.append ( to_to )
            self.graph.append ( from_to )
        def dfs ( x ) :
            self.visited.append ( True )
            if x == 0 and len ( self.graph [ x ] ) == 1 :
                return a [ x ] - dfs ( self.graph [ x ] [ 0 ] )
            if len ( self.graph [ x ] ) == 1 :
                return a [ x ]
            sum = max = 0
            for y in self.graph [ x ] :
                if y in visited : continue
                t = dfs ( y )
                if t == - 1 : return - 1
                sum += t
                max = max ( max , t )
            e = 2 * a [ x ] - sum
            if e < 0 or e < max - ( sum - max ) or e > sum : return - 1
            return e
    ns = ''
    while not readline ( ) :
        ns = readline ( )
    return ns
