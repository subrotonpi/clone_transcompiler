def _ _ main _ _ ( ) : return sys.argv [ 1 ]
import os
import time
class Main ( object ) :
    class Task ( object ) :
        def __init__ ( self , a , b ) :
            self.a = a
            self.b = b
        def get ( self , yt ) :
            if self.a == yt : return b
            return a
    def label_one_cycle ( u , v , state ) :
        state [ u ] = 1
        for e in edges [ u ] :
            if e.in_cycle : continue
            if state [ e [ u ] ] == 2 : continue
            if e [ u ] == v : continue
            if state [ e [ u ] ] == 1 :
                e.in_cycle = True
                return e [ u ]
            else :
                end = label_one_cycle ( e [ u ] , u , state )
                if end >= 0 :
                    e.in_cycle = True
                    if u == end : return - 2
                    return end
                if end == - 2 : return - 2
        state [ u ] = 2
        return - 1
    def exist_edge ( self ) :
        for edge in self.edges :
            for e in edge :
                if not e.in_cycle : return True
        return False
    def is_vertex_in ( self ) :
        for e in self.edges :
            if not e.in_cycle : return True
        return False
    def is_two_cycle ( self ) :
        state = [ ]
        label_one_cycle ( 0 , - 1 , state )
        if not exist_edge ( self ) :
            raise SystemExit
        state.append ( 0 )
        for i in self.edges :
            if is_vertex_in ( i ) :
                label_one_cycle ( i , - 1 , state )
                return not exist_edge ( self )
        raise SystemExit
    def solve ( self , sc , pw ) :
        n = sc.__next__ ( )
        m = sc.__next__ ( )
        edges = [ ]
        for i in self.edges :
            edges.append ( i )
        return edges [ 0 ]
