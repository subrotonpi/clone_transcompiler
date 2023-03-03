def _import ( ) : return _import ( )
import sys
import os
import sys
import time
import random
class Main ( ) :
    def __init__ ( self ) :
        self._import ( )
        self._import ( )
        self._score , self._memo_F , self._memo_G = [ ] , [ ] , [ ]
        self._depth = [ ]
        self._MOD = 1000000007
    def readline ( self ) :
        sc = sys.stdin.readline ( )
        n = sc.__next__ ( )
        self._graph = [ ]
        self._corrected_graph = [ ]
        for i in range ( 0 , n ) :
            self._graph.append ( list ( ) )
            self._corrected_graph.append ( list ( ) )
        for i in range ( 1 , n ) :
            a = sc.__next__ ( )
            b = sc.__next__ ( )
            self._graph [ a ].append ( b )
            self._graph [ b ].append ( a )
        self._score = [ ]
        self._memo_F = [ ]
        self._memo_G = [ ]
        self._depth = [ 1 ]
        self._depth_count = 1
        queue = [ 1 ]
        while not queue.empty ( ) :
            next = queue.pop ( )
            node = self._graph [ next ]
            for j in node :
                if self._depth [ j ] == 0 :
                    self._depth [ j ] = self._depth [ next ] + 1
                    if self._depth_count < self._depth [ j ] :
                        self._depth_count = self._depth [ j ]
                    self._queue.append ( j )
                self._corrected_graph [ next ].append ( j )
        print ( self._score [ 0 ] )
    def f ( self ) :
        if self._memo_F [ 0 ] > 0 :
            return self._memo_F [ 0 ]
        if self._depth [ 0 ] == self._depth_count :
            self._memo_G [ 0 ] = 2
            return 2
        ans = 1
        for adj in self._correc@@