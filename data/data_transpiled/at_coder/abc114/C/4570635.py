def import _scanner
class Main ( object ) :
    def __init__ ( self , T ) :
        self.T = T
        self.dfs ( 0 , 0 , 0 , 0 )
        print ( self.ans )
    def dfs ( x , x3 , x5 , x7 ) :
        if x3 > 0 and x5 > 0 and x7 > 0 and x <= self.T :
            self.ans += 1
        if x * 10 < self.T :
            self.dfs ( x * 10 + 3 , x3 + 1 , x5 , x7 )
            self.dfs ( x * 10 + 5 , x3 , x5 + 1 , x7 )
            self.dfs ( x * 10 + 7 , x3 , x5 , x7 + 1 )
