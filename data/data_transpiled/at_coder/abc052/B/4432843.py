def import sys , string , I , D , D
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.str = string.strip ( )
        self.s = string.split ( "" )
        self.x = 0
        self.max = 0
        self.I = I
        self.D = D
        for i in range ( self.n ) :
            if i == I :
                self.x = self.x + 1
            elif i == D :
                self.x = self.x - 1
            if self.max <= x :
                self.max = self.x
        print ( self.max )
