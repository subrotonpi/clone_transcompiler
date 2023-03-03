def import math
class Main ( object ) :
    def __init__ ( self ) :
        self.r , self.g , self.b , self.total = int ( math.pow ( 10 , 9 ) )
        self.total = self.r + self.g + self.b
        self.table = [ ]
        for i in range ( 1000 ) :
            for j in range ( 1000 ) :
                if j == self.total :
                    self.table.append ( [ 0 ] )
                else :
                    self.table.append ( self.ENOUGH_BIG )
        for i in range ( 1 , 999 ) :
            for j in range ( total ) :
                self.table [ i ] [ j ] = min ( self.table [ i - 1 ] [ j ] , self.table [ i - 1 ] [ j + 1 ] + cost ( i , j + 1 ) )
        min_score = self.ENOUGH_BIG
        for i in range ( 1000 ) :
            self.min_score = min ( min_score , self.table [ i ] [ 0 ] )
        print ( self.min_score )
    def cost ( self , i , j ) :
        if j > self.g + self.b :
            self.result = abs ( i - 400 )
        elif j > self.b :
            self.result = abs ( i - 500 )
        else :
            self.result = abs ( i - 600 )
        return self.result
return Main
