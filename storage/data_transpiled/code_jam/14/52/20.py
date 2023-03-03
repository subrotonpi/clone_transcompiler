def round3 ( ) :
    import math
    import numpy as np
    import math
    class B ( object ) :
        def __init__ ( self , index , missed , turn , monster ) :
            if index == self.n :
                return 0
            if self.DP [ index ] [ missed ] [ turn ] [ monster ] != - 1 :
                return self.DP [ index ] [ missed ] [ turn ] [ monster ]
            max = np.inf
            if monster == 0 and missed * self.P >= self.H [ index ] :
                hits = int ( math.ceil ( self.H [ index ] * 1.0 / self.P ) )
                max = max ( max , self.G [ index ] + self.get ( index + 1 , missed - hits , turn , 0 ) )
            if turn == 1 :
                if ( monster + 1 ) * self.Q >= self.Q :
                    max = max ( max , self.get ( index + 1 , missed , 0 , 0 ) )
                else :
                    max = max ( max , self.DP [ index ] [ missed ] [ turn ] [ monster ] = self.get ( index , missed , 0 , monster + 1 ) )
            else :
                max = max ( max , self.get ( index , missed + 1 , 1 , monster ) )
                if monster * self.Q + ( self.Q + self.P >= self.Q ) :
                    hits = int ( math.ceil ( ( self.Q - self.monster * self.Q ) * 1.0 / self.P ) )
                    max = max ( max , self.G [ index ] + self.get ( index + 1 , missed - hits + 1 , 1 , 0 ) )
            return self.DP [ index ] [ missed ] [ turn ] [ monster ] = max
    def main ( ) :
        with open ( 'test.txt' , 'r' ) as f :
            t = int ( f.read ( ) )
            for _ in range ( 1 , t + 1 ) :
                P , Q , n = [ int ( f.read ( ) ) for f in f.readlines ( ) ]
                H = [ int ( f.read ( ) ) for f in f.readlines ( ) ]
                G = [ int ( f.read ( ) )