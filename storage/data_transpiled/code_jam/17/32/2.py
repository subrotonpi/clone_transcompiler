def contest.codejam ( ) :
    import sys
    import os
    import subprocess
    class B :
        def __init__ ( self , f = sys.stdin ) :
            self.f = f
            self.stdout = sys.stdout
            self.readline ( )
            self.T , self.C , self.J = self.T , self.C , self.J
            self.left_c , self.left_j = self.left_c , self.left_j
        def readline ( self ) :
            return self.start - self.start
    class Activity ( object ) :
        def __init__ ( self , f = sys.stdin ) :
            self.f = open ( 'B-large.in' , 'r' )
            self.stdout = open ( 'out.txt' , 'w' )
            self.T = self.readInt ( )
            for t in range ( 1 , T + 1 ) :
                C = self.readInt ( )
                self.J = self.readInt ( )
                self.left_c = self.720
                self.left_j = self.720
                A = [ ]
                for i in range ( C ) :
                    l , r = self.readInt ( )
                    self.left_c -= r - l
                    A.append ( ( l , r , 0 ) )
                for i in range ( J ) :
                    l , r = self.readInt ( )
                    self.left_j -= r - l
                    A.append ( ( l , r , 1 ) )
                A.sort ( )
                diffC = [ ]
                diffJ = [ ]
                exchanges = 0
                for i in range ( C + J ) :
                    if self.left_c [ i ] <= self.left_j :
                        exchanges -= 2
                        continue
                    exchanges += 2
                    if i < C + J - 1 :
                        if self.left_c [ i ] == 0 :
                            diffC.append ( self.left_c [ j ] - self.left_c [ i ] )
                        else :
                            diffJ.append ( self.left_j [ i ] - ( self.left_c [ i ] - 720 * 2 ) )
                    else :
                        diffC.append ( self.left_c [ i ] - ( self.left_j [ i ] - 720 ) )
            