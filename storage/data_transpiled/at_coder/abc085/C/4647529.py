def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        self.Y = sys.maxint
        self.x = 0
        self.y = 0
        self.z = 0
        for i in range ( 0 , N ) :
            for j in range ( 0 , N - i ) :
                k = N - i - j
                sum = ( 10000 * i ) + ( 5000 * j ) + ( 1000 * k )
                if sum == Y :
                    if i + j + k == N :
                        self.x = i
                        self.y = j
                        self.z = k
                        print ( self.x , self.y , self.z )
                        sys.exit ( )
                else :
                    self.x = - 1
                    self.y = - 1
                    self.z = - 1
        print ( self.x , self.y , self.z )
