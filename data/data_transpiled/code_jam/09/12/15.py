def _import ( ) : return ''
import os
import os
import collections
import collections
import collections
import collections
import collections
import collections
import collections
import os
import os
import os
import sys
class b :
    def __init__ ( self , node ) :
        self.cost = node.cost
        self.node = node.node
    def __eq__ ( self , x ) :
        if self.cost < x.cost : return - 1
        elif self.cost > x.cost : return 1
        else : return 0
    def is_terminal ( self , cost , node ) :
        self.cost = cost
        self.node = node
    def get_successors ( self ) :
        res = collections.deque ( )
        for direction in self.neighbors.keys ( ) :
            neighbor = self.neighbors [ direction ]
            if not neighbor.same_intersection ( self.node ) :
                succ = ( cost + 2 , neighbor )
            else :
                succ = ( cost + 1 + delay_until_i_can_go ( self.v [ direction ] , self.node.row , self.node.col , cost ) , neighbor )
        def delay_until_i_can_go ( self , vertical , row , col , time ) :
            return res
    class Node :
        def __repr__ ( self ) :
            return '(%d, %d), %s %s' % ( row , col , 'lower' if self.lower else 'upper' , 'left' if self.lower else 'right' )
        lower , right = False , False
        neighbors = { }
        def same_intersection ( self , other ) :
            return self.row == other.row and self.col == other.col
        def __eq__ ( self , other ) :
            if self.vertical : return 0
            else : return self.row == other.row
        def __ne__ ( self , other ) :
            return self.other == other.row
        def __lt__ ( self , other ) :
            return self.cost < other.cost
        def __eq__ ( self , other ) :
            return self.other == other.node
        def __ne__ ( self , other ) :
            return self.other == other.node
    return Node ( 0 , 0 )
