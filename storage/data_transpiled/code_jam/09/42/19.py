def main ( ) :
    import sys
    class ProblemB ( CodeJammer ) :
        def process ( self ) :
            data = self.reader.read_array ( )
            r , c , f = data [ 0 ] , data [ 1 ] , data [ 2 ]
            grid = [ [ ( row == '#' ) for row in row ] for row in row ]
            best = r * c + 1
            DFS ( grid , 0 , 0 , 0 , 0 , 0 )
            if best < r * c + 1 :
                self.output ( 'Yes %d' % best )
            else :
                self.output ( 'No' )
        def DFS ( self , grid , row , col , fell , dug , last_act ) :
            if fell > f :
                return
            if row == r - 1 :
                if dug < best :
                    best = dug
                return
            if not self.grid [ row + 1 ] [ col ] :
                DFS ( grid , row + 1 , col , fell + 1 , dug , 0 )
                return
            if col > 0 and not self.grid [ row ] [ col - 1 ] :
                if last_act != 1 :
                    DFS ( grid , row , col - 1 , 0 , dug , - 1 )
                if self.grid [ row + 1 ] [ col - 1 ] :
                    self.grid [ row + 1 ] [ col - 1 ] = False
                    DFS ( grid , row , col , 0 , dug + 1 , 0 )
                    self.grid [ row + 1 ] [ col - 1 ] = True
            if col < c - 1 and not self.grid [ row ] [ col + 1 ] :
                if last_act != - 1 :
                    DFS ( grid , row , col + 1 , 0 , dug , 1 )
                if self.grid [ row + 1 ] [ col + 1 ] :
                    self.grid [ row + 1 ] [ col + 1 ] = False
                    DFS ( grid , row , col , 0 , dug + 1 , 0 )
                    self.grid [ row + 1 ] [ col + 1 ] = True
    def main ( ) :
        p = ProblemB ( )
        p.run ( )
