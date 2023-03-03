def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.r = [ ]
        self.map = [ ]
        self.ans = sum ( self.ans )
    def dfs ( self , start ) :
        flag = True
        for i in range ( 1 , len ( self.visited ) ) :
            self.ans = min ( self.ans )
            return
        for i in range ( 1 , R + 1 ) :
            if not self.visited :
                self.visited [ i ] = True
                self.dfs ( i , self.map [ i ] + start )
                self.visited [ i ] = False
