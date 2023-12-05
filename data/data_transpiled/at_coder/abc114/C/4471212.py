def import import _scanner
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.ans = 0
    def __call__ ( self ) :
        sc = _scanner.Scanner ( )
        self.n = sc.n
        sc.close ( )
        self.dfs ( '0' )
        print ( self.ans )
    def dfs ( val ) :
        if int ( val ) > self.n :
            return
        if val.find ( '3' ) not in [ - 1 , - 1 , - 1 , - 1 ] :
            self.ans += 1
        self.dfs ( val + '3' )
        self.dfs ( val + '5' )
        self.dfs ( val + '7' )
