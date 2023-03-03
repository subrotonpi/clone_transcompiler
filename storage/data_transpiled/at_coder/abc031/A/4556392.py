def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = 1
            self.d = 1
            self.ans = max ( ( self.a + 1 ) * self.d , self.a * ( self.d + 1 ) )
            print ( self.ans )
