def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = len ( sys.stdin )
        self.dir = [ False ] * n
        s = sys.stdin.read ( )
        for i in range ( self.n ) :
            if s [ i ] == 'E' :
                self.dir [ i ] = True
        cost = 0
        for i in range ( 1 , self.n ) :
            if self.dir [ i ] : cost += 1
        min_cost = cost
        for reader in range ( 1 , self.n ) :
            if not self.dir [ reader - 1 ] : cost += 1
            if self.dir [ reader ] : cost -= 1
            min_cost = min ( cost , min_cost )
        print ( min_cost )
    def readhw ( self , height , width ) :
        hw = [ ]
        with open ( self.name , 'r' ) as f :
            for i in range ( self.height ) :
                for j in range ( self.width ) :
                    hw.append ( f.read ( ) )
        return hw
return Main
