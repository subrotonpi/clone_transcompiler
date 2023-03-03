def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = sys.stdin.read ( )
            self.Y = sys.stdin.read ( )
            self.Z = sys.stdin.read ( )
            self.ans = 0
            self.X -= self.Z
            self.ans = self.X / ( self.Y + self.Z )
            print ( self.ans )
    return Main
