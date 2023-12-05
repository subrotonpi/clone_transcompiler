def _import ( ) :
    import os
    import sys
    import math
    class Main ( object ) :
        def __init__ ( self ) :
            self.head = [ ]
            self.next = [ ]
            self.to = [ ]
            self.cost = [ ]
            self.size = [ ]
            self.edgeCount = 0
            self.ans = 0
            self.N = 0
        def main ( self ) :
            with open ( self.head , 'r' ) as sc :
                self.N = sc.read ( )
            self.head = [ ]
            self.size = [ ]
            self.next = [ ]
            self.to = [ ]
            self.cost = [ ]
            for i in range ( self.N - 1 ) :
                A = sc.read ( )
                B = sc.read ( )
                C = sc.read ( )
                self.addEdge ( A , B , C )
                self.addEdge ( B , A , C )
            self.calcSize ( 1 )
            self.dfs ( 1 )
            print ( self.ans )
        def dfs ( self ) :
            maxNodeSize = self.N - self.size [ self.root ]
            minEdgeCost = float ( 'inf' )
            for e in self.head [ self.root ] :
                destination = self.to [ e ]
                minEdgeCost = min ( minEdgeCost , self.cost [ e ] )
                if self.size [ destination ] < self.size [ self.root ] :
                    maxNodeSize = max ( maxNodeSize , self.size [ destination ] )
                    min = min ( self.size [ destination ] , self.N - self.size [ destination ] )
                    ans = ans + min ( self.cost [ e ] * 2 )
                    self.dfs ( destination )
                    if self.min + min == self.N :
                        ans = ans - self.cost [ e ]
            if self.maxNodeSize * 2 < self.N :
                ans = ans - minEdgeCost
    def calcSize ( self ) :
        self.size = 1
        for e in self.head [ self.root ] :
            if self.size [ to [ e ] ] == 0 :
                self.size [ root ] += calcSize ( to