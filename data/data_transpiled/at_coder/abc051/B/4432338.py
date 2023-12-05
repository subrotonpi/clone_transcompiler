def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.k = self.sc.randint ( 1 , 4 )
        self.s = self.sc.randint ( 1 , 4 )
        self.point = 0
        for i in range ( 0 , self.k ) :
            for j in range ( 0 , self.k ) :
                z = self.s - i - j
                if 0 <= z <= self.k :
                    self.point += 1
        print ( self.point )
