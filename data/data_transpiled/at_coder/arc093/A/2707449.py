def import import os
class Main ( object ) :
    def __init__ ( self ) :
        self.N = len ( sys.argv )
    def __init__ ( self ) :
        self.A = [ ]
        self.diff = [ ]
        self.diff2 = [ ]
        sum = 0
        A.append ( 0 )
        for i in range ( 1 , N + 1 ) :
            A.append ( self.A [ i ] )
            diff.append ( abs ( A [ i ] - A [ i - 1 ] ) )
            sum += diff [ i ]
            if i > 1 :
                self.diff2.append ( abs ( A [ i ] - A [ i - 2 ] ) )
        self.diff.append ( abs ( A [ N ] ) )
        sum += diff [ N + 1 ]
        self.diff2.append ( abs ( A [ N - 1 ] ) )
        for i in range ( 1 , N + 1 ) :
            tmp = sum
            tmp -= diff [ i ]
            tmp -= diff [ i + 1 ]
            tmp += self.diff2 [ i ]
            print ( tmp )
