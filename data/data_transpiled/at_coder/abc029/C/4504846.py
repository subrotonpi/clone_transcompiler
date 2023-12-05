def main ( ) :
    import os
    class Main ( object ) :
        def __init__ ( self ) :
            self.ans , self.N = 0 , 0
        def __call__ ( self , n , s ) :
            if n == self.N :
                print ( s )
                return
            self.dfs ( n + 1 , s + 'a' )
            self.dfs ( n + 1 , s + 'b' )
            self.dfs ( n + 1 , s + 'c' )
    return Main
