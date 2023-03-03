def import _main
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.head = [ ]
        self.next = [ ]
        self.to = [ ]
        self.cost = [ ]
        self.size = [ ]
        self.edge_count = 0
        self.ans = 0
        self.N = 0
    def main ( self ) :
        with open ( self.head , 'r' ) as sc :
            self.head = [ ]
            self.size = [ ]
            self.next = [ ]
            self.to = [ ]
            self.cost = [ ]
            for i in range ( self.N - 1 ) :
                A = sc.read ( )
                B = sc.read ( )
                C = sc.read ( )
                self.add_edge ( A , B , C )
                self.add_edge ( B , A , C )
            self.calc_size ( 1 )
            self.dfs ( 1 )
            print ( self.ans )
    def dfs ( self ) :
        max_node_size = self.N - self.size [ self.root ]
        min_edge_cost = float ( self.cost [ self.root ] )
        for e in self.head [ self.root ] :
            destination = self.to [ e ]
            min_edge_cost = min ( min_edge_cost , self.cost [ e ] )
            if self.size [ destination ] < self.size [ self.root ] :
                max_node_size = max ( max_node_size , self.size [ destination ] )
                min = min ( self.size [ destination ] , self.N - self.size [ destination ] )
                ans = ans + min ( self.cost [ e ] * 2 )
                self.dfs ( destination )
                if min + min == self.N :
                    ans = ans - self.cost [ e ]
        if self.max_node_size * 2 < self.N :
            ans = ans - min_edge_cost
    def calc_size ( self ) :
        self.size [ self.root ] = 1
        for e in self.head [ self.root ] :
            if self.size [ self.to [ e ] ] == 0 :
                self.size [ self.root ] += calc_size ( self.to