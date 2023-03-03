def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.x = sys.stdin.read ( )
            self.ans = 0
            self.cout = 0
            while self.ans < self.x :
                self.cout += 1
                self.ans += self.cout
            print ( self.cout )
    return Main ( )
