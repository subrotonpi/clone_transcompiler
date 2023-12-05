def _main ( ) :
    import Queue
    import sys
    class Main ( object ) :
        def find_path ( self , capacity , s , t ) :
            q = Queue ( )
            self.s , self.t = 0 , N * 2 + 1
            self.as = [ s ]
            self.bs = [ ]
            self.cs = [ ]
            self.ds = [ ]
            self.pred = [ ]
            self.q.append ( q )
            while not self.q.empty ( ) :
                cur = self.q.pop ( )
                for i in range ( self.N ) :
                    if self.capacity [ cur ] [ i ] == 0 or self.pred [ i ] != - 1 :
                        continue
                    self.pred [ i ] = cur
                    if i == t :
                        return self.create_path ( self , pred , s , t )
                    self.q.append ( i )
    def create_path ( self , pred , s , t ) :
        path = [ t ]
        while pred [ t ] != s :
            t = pred [ t ]
            path.append ( t )
        self.path.reverse ( )
        return path
    def flow ( self , capacity , s , t ) :
        V = len ( self.capacity )
        flow = [ ]
        while True :
            path = self.find_path ( capacity , s , t )
            if not path :
                for i in range ( self.V ) :
                    for j in range ( self.i + 1 , self.V ) :
                        if self.flow [ i ] [ j ] > 0 and self.flow [ j ] [ i ] > 0 :
                            self.flow [ i ] [ j ] = max ( self.flow [ i ] [ j ] - self.flow [ j ] [ i ] , 0 )
                            self.flow [ j ] [ i ] = max ( self.flow [ j ] [ i ] - self.flow [ i ] [ j ] , 0 )
            return flow
return Main ( )
