def _ _ main _ _ ( ) :
    import sys
    from ..import InputReader , InputWriter , Task
    class Main ( InputReader ) :
        def __init__ ( self , f , l , r ) :
            InputReader.__init__ ( self , f , l , r )
            self.f = f
            self.task = Task ( )
            self.solve ( f , self.f )
            self.f.close ( )
    class Task ( SegmentTree ) :
        def __init__ ( self , n , a ) :
            self.n = n
            self.make_tree ( self.n , 1 , n )
        def range_min_query ( self , x , y ) :
            return self.range_min_query ( self.n , x , y )
        def point_update ( self , x , v ) :
            self.point_update ( self.n , x , v )
        def rm_q ( self , u ) :
            return min ( self.minus.range_min_query ( 1 , u - 1 ) + u , self.range_min_query ( self.n , u ) - u )
        def set_dp ( self , v ) :
            self.plus.point_update ( self , v + u )
            self.minus.point_update ( self , v - u )
        def get_dp ( self , u ) :
            return self.plus.range_min_query ( self , u ) - u + offset
        def solve ( self , f , self ) :
            n , q , a , prev = self.n , self.q , self.a , self.prev
            self.init ( self , n , a )
            for i in range ( 1 , q + 1 ) :
                curr = f.get ( )
                cost = abs ( curr - prev )
                o1 = rmq ( curr )
                o2 = self.get_dp ( prev ) + cost
                self.set_dp ( prev , min ( o1 , o2 ) - cost )
                self.offset += cost
                prev = curr
            ans = long ( 1e18 )
            for i in range ( 1 , n + 1 ) :
                ans = min ( ans , get_dp ( i ) )
            f.write ( ans )
