def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.list = [ ]
        N = self.N
        Q = self.Q
        for i in range ( N ) : self.list.append ( 0 )
        for i in range ( Q ) :
            L = self.L
            R = self.R
            T = self.T
            L -= 1
            R -= 1
            for j in range ( L , R + 1 ) : self.list [ j ] = T
    for item in list :
        print ( item )
