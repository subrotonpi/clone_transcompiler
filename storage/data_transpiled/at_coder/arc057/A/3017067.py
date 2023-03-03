def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.NICYOUEN = 2000000000000L
            A = self.A
            K = self.K
            nisu = 0
            if K == 0 :
                print ( NICYOUEN - A )
            else :
                while True :
                    A = 1 + ( K + 1 ) * A
                    nisu += 1
                    if A >= NICYOUEN :
                        print ( nisu )
                        break
