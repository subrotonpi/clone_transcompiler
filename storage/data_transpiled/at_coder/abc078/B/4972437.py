def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = sys.stdin.read ( )
            self.Y = sys.stdin.read ( )
            self.Z = sys.stdin.read ( )
            self.X -= self.Z
            ans = self.X / ( self.Y + self.Z )
            sys.stdout.write ( ans )
            self.X = X
    return Main ( )
