def import import sys
class Main ( object ) :
    def __init__ ( self , n ) :
        self.n = n
    def __call__ ( self , str , n ) :
        if len ( str ) == n :
            print ( str )
            return
        self.n = n
    def dfs ( self , str , n ) :
        if len ( str ) == n :
            print ( str )
            return
        self.n = n
