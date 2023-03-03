def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.count = 0
    def __call__ ( self , l , n ) :
        self.count += 1
        return self.count
    def dfs ( l , n ) :
        if l > n :
            return
        l = str ( l )
        if "3" in l and "5" in l and "7" in l :
            self.count += 1
        self.dfs ( 10 * l + 3 , n )
        self.dfs ( 10 * l + 5 , n )
        self.dfs ( 10 * l + 7 , n )
