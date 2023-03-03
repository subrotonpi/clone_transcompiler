def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.ans = 0
        def __init__ ( self ) :
            self.N = int ( self.N )
            self.dfs ( 0 , 0 , 0 , 0 )
            print ( self.ans )
        def dfs ( self , n , x3 , x5 , x7 ) :
            if x3 > 0 and x5 > 0 and x7 > 0 and n <= N :
                self.ans += 1
            if n * 10 < N :
                self.dfs ( n * 10 + 3 , x3 + 1 , x5 , x7 )
                self.dfs ( n * 10 + 5 , x3 , x5 + 1 , x7 )
                self.dfs ( n * 10 + 7 , x3 , x5 , x7 + 1 )
    return Main ( )
