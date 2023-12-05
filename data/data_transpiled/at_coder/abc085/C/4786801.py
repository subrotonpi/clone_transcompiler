def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.Y = sys.stdin.read ( )
        self.yukichi = - 1
        self.higuchi = - 1
        self.noguchi = - 1
        for i in range ( 0 , N ) :
            for j in range ( 0 , N - i ) :
                if self.Y == self.N + 9 * i + 4 * j :
                    self.yukichi = i
                    self.higuchi = j
                    self.noguchi = self.N - self.yukichi - self.higuchi
                    break
        print ( self.yukichi , self.higuchi , self.noguchi )
