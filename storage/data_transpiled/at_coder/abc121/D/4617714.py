def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A , self.B , self.ans = sys.stdin.read ( ).decode ( ).decode ( ).split ( '\n' )
            if self.A % 2 == 1 :
                self.ans ^= A - 1
                self.A -= 1
            while ( self.B - self.A + 1 ) % 4 :
                self.ans ^= self.B + 1
                self.B += 1
            print ( self.ans )
