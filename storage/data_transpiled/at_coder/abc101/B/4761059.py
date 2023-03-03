def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.stdin.read ( )
            self.b = self.a
            self.ans = 0
            while self.a > 0 :
                self.ans += self.a % 10
                self.a /= 10
            if self.b % self.ans == 0 :
                self.print ( "Yes" )
            else :
                self.print ( "No" )
    return Main ( )
