def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.maxint
        self.K = sys.maxint
        self.sum = 0
        for i , a in enumerate ( sys.argv ) :
            self.sum += a * ( min ( i + K , N ) - max ( i - K + 1 , 0 ) - K + 1 )
        print ( self.sum )
