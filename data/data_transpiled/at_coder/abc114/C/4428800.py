def import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        self.ans = 0
        self.N = 0
        self.dfs ( 0 )
        print ( self.ans )
    def dfs ( x ) :
        if x > self.N :
            return
        x = str ( x )
        if '7' in x and '5' in x and '3' in x :
            self.ans += 1
        self.dfs ( x * 10 + 7 )
        self.dfs ( x * 10 + 5 )
        self.dfs ( x * 10 + 3 )
