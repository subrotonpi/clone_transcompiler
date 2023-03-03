def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.tx , self.ty = sys.stdin.readline ( ).split ( ' ' )
        self.TV = self.tx ** 2
        self.n = self.n
        x = [ ]
        y = [ ]
        for i in range ( self.n ) :
            x.append ( i )
            y.append ( i )
        for i in range ( self.n ) :
            kyori = 0
            for j in range ( 2 ) :
                kyori += math.sqrt ( math.pow ( abs ( x [ i ] - tx [ j ] ) , 2 ) + math.pow ( abs ( y [ i ] - ty [ j ] ) , 2 ) )
            if kyori <= TV :
                self.print ( "YES" )
                return
        self.print ( "NO" )
