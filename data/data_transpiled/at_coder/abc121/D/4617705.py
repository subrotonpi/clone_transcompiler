def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
            self.B = sys.stdin.read ( )
            self.answer = 0
            if self.A % 2 == 1 :
                self.answer ^= ( A - 1 )
                self.A -= 1
            while ( self.B - self.A ) % 4 != 3 :
                self.answer ^= ( self.B + 1 )
                self.B += 1
            print ( self.answer )
