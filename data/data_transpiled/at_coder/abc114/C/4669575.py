def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.answer = 0
    def n ( self ) :
        self.set = [ 3 , 5 , 7 ]
    def main ( self ) :
        with open ( "/proc/self/" , "r" ) as sc :
            n = sc.read ( )
        self.dfs ( 0 )
        print ( self.answer )
    def dfs ( x ) :
        if x > n :
            return
        x = str ( x )
        if "3" in x and "5" in x and "7" in x :
            self.answer += 1
        for k in self.set :
            self.dfs ( x * 10 + k )
