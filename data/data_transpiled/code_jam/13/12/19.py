def import _graph
class Edge ( object ) :
    def __init__ ( self , t , f , c ) :
        self.t = t
        self.f = f
        self.c = c
    def new_pair ( self , s , t , f , c ) :
        self.T = int ( self.cas )
        for cas , E , N in self.T :
            v = [ ( t , f , c ) , ( s , 0 , - c ) ]
            self.v.twin = self.v
            self.s.put ( self.s , self.t , self.v )
            self.v.put ( self.v )
            self.v.put ( self.v )
        print ( "Case #%d: %d" % ( - g.min_c ( ) , - g.min_c ( ) ) )
        print ( cas )
    class Graph ( object ) :
        def __init__ ( self , n ) :
            self.nodes = [ ]
            for i in range ( n ) :
                self.nodes.append ( Node ( ) )
            self.dist = [ ]
        def set_s ( self , s ) :
            self.s = s
        def set_t ( self , t ) :
            self.t = t
        def add_e ( self , s , t , f , c ) :
            Edge.new_pair ( self.nodes [ s ] , self.nodes [ t ] , f , c )
        def min_c ( self ) :
            ans = 0.
            path = self.spfa ( )
            while path :
                f = path [ 0 ].f
                for e in path :
                    f = min ( f , e.f )
                for e in path :
                    ans += f * e.c
                    e.f -= f
                    e.twin.f += f
                path = self.spfa ( )
            return ans
    def spfa ( self ) :
        q = [ ]
        for v in self.nodes :
            v.dist = int ( 1e9 )
        self.nodes [ s ].dist = 0
        self.nodes [ t ].pre = None
        q.append ( v )
    return Graph ( )
