def year2017.round1b ( ) :
    import os
    import sys
    import random
    import sys
    class PonyExpress ( object ) :
        def __init__ ( self ) :
            self.inputFile = open ( 'C-large.in' , 'r' )
            self.inputFile = open ( 'output.txt' , 'w' )
            self.outputFile = open ( 'output.txt' , 'w' )
            self.T = self.T
    for t in range ( 0 , len ( sys.argv ) ) :
        N = sys.argv [ 1 ]
        Q = sys.argv [ 2 ]
        E = [ ]
        S = [ ]
        for n in range ( N ) :
            E.append ( sys.argv [ 1 ] )
            S.append ( sys.argv [ 2 ] )
        D = [ [ ] for _ in range ( N ) ]
        for from_i in range ( N ) :
            for to_i in range ( N ) :
                D [ from_i ] [ to_i ] = sys.argv [ 1 ]
        for k in range ( N ) :
            for i in range ( N ) :
                for j in range ( N ) :
                    if i != j and D [ i ] [ k ] != - 1 and D [ k ] [ j ] != - 1 :
                        new_dist = D [ i ] [ k ] + D [ k ] [ j ]
                        if D [ i ] [ j ] == - 1 or D [ i ] [ j ] > new_dist :
                            D [ i ] [ j ] = new_dist
        dist = [ ]
        for from_i in range ( N ) :
            for to_i in range ( N ) :
                if from_i != to_i and D [ from_i ] [ to_i ] != - 1 and D [ from_i ] [ to_i ] <= E [ from_i ] :
                    dist.append ( D [ from_i ] [ to_i ] / float ( S [ from_i ] ) )
                else :
                    dist.append ( np.inf )
    return
