def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = sys.stdin.read ( )
            self.Y = sys.stdin.read ( )
            self.Z = sys.stdin.read ( )
    X = Main ( )
    Y = Main ( )
    Z = Main ( )
    X.X = X - Z
    ans = 0
    while X >= 0 :
        X = X - ( Y + Z )
        ans += 1
    print ( ans or 0 )
