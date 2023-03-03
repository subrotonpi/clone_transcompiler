def main ( args ) :
    import os
    class Main ( object ) :
        def __init__ ( self , * args ) :
            self.N , self.K = args
            self.ans = 0
            self.vec = [ [ 0 ] for i in range ( self.N ) ]
            for i in range ( self.N ) :
                a = self.N - 1
                if i != 0 :
                    self.vec [ a ].append ( i )
                else :
                    if a != 0 :
                        self.ans += 1
            self.dfs ( 0 , 0 )
            print ( self.ans )
    return Main
