def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.a = sys.stdin.readline ( )
            self.b = sys.stdin.readline ( )
            self.ans = self.a + self.b
            self.answer = int ( self.ans )
            print ( self.answer * 2 )
            self.a = sys.stdin.readline ( )
            self.b = sys.stdin.readline ( )
            self.ans = self.a + self.b
            self.answer = int ( self.ans )
    return Main ( )
