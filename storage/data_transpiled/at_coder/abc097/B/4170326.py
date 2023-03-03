def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.x = sys.stdin.read ( )
        self.max = 1
        for i in range ( 2 , 100 ) :
            for j in range ( 2 , 10 ) :
                target = int ( math.pow ( i , j ) )
                if target > self.x :
                    break
                if target > self.max :
                    self.max = self.target
        print ( self.max )
