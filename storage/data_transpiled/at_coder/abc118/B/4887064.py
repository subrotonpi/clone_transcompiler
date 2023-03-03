def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        self.N , self.M , self.answer = self.sc.count ( ) , self.N , 0
        self.food = [ 0 ] * self.M
        for i in range ( self.N ) :
            K = self.sc.count ( )
            for j in range ( K ) :
                self.food [ self.sc.count ( ) - 1 ] += 1
        for i in range ( self.M ) :
            if self.food [ i ] == self.N :
                self.answer += 1
        print ( self.answer )
