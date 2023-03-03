def import _main
import sys
import os
class Main ( object ) :
    def __init__ ( self ) :
        self.link_list = [ ]
        self.dists = [ ]
    def __call__ ( self , * args ) :
        sc = open ( "../Main.py" )
        N , M = sc.read ( ).split ( )
        self.link_list = [ [ ] for _ in range ( N + 1 ) ]
        self.dists = [ [ ] for _ in range ( N + 1 ) ]
        for l , r , d in zip ( self.link_list , self.dists ) :
            self.link_list [ l ] [ 0 ].append ( r )
            self.link_list [ l ] [ 1 ].append ( d )
            self.link_list [ r ] [ 0 ].append ( l )
            self.link_list [ r ] [ 1 ].append ( - d )
