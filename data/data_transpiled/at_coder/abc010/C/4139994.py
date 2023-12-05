def import import math
class Main ( object ) :
    def __init__ ( self ) :
        self.tttttttv = sys.stdin.readline ( ).split ( ) [ 6 : ]
        txa = int ( self.tttttv [ 0 ] )
        tya = int ( self.tttv [ 1 ] )
        txb = int ( self.tttv [ 2 ] )
        tyb = int ( self.tttv [ 3 ] )
        T = int ( self.tttv [ 4 ] )
        V = int ( self.tttv [ 5 ] )
        max_distance = float ( T * V )
        n = int ( self.tttttv [ 0 ] )
        for xy in self.tttttv [ 1 : ] :
            x = int ( xy [ 0 ] )
            y = int ( xy [ 1 ] )
            distance_a = self.distance ( txa - x , tya - y )
            distance_b = self.distance ( txb - x , tyb - y )
            if distance_a + distance_b <= max_distance :
                print ( "YES" )
                return
        print ( "NO" )
    def distance ( self , x_diff , y_diff ) :
        return math.sqrt ( self.x_diff ** 2 + self.y_diff ** 2 )
