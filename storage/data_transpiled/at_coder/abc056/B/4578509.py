def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.w = sys.argv [ 1 ]
            self.a = sys.argv [ 2 ]
            self.b = sys.argv [ 3 ]
            self.ans = None
            if self.a < self.b :
                if self.a + self.w >= self.b :
                    self.ans = None
                else :
                    self.ans = self.b - ( self.a + self.w )
            else :
                if self.b + self.w >= self.a :
                    self.ans = None
                else :
                    self.ans = self.a - ( self.b + self.w )
            print ( self.ans )
            self.ans = None
    return Main ( )
