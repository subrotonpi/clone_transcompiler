def import import *
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
        self.res = 0
    def __call__ ( self , * args ) :
        sc = open ( "/proc/" , "r" )
        self.n = int ( sc.read ( ) )
        self.dfs ( 0 )
        print ( self.res )
    def dfs ( l ) :
        if l > self.n :
            return
        l = str ( l )
        if "3" in l and "5" in l and "7" in l :
            res += 1
        self.dfs ( 10 * l + 3 )
        self.dfs ( 10 * l + 5 )
        self.dfs ( 10 * l + 7 )
