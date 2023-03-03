def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sys = sys.stdin
        self.H , self.W = self.sys.maxsize , self.sys.maxsize
        cnt = 0
        for s in self.sys.stdin :
            for i in range ( self.W ) :
                if s [ i ] == '#' :
                    cnt += 1
        self.sys.stdin.close ( )
        if cnt == self.H + self.W - 1 :
            print ( 'Possible' )
        else :
            print ( 'Impossible' )
