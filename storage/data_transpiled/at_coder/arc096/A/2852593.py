def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = int ( sys.stdin.read ( ) )
            self.B = int ( sys.stdin.read ( ) )
            self.C = int ( sys.stdin.read ( ) )
            self.X = int ( sys.stdin.read ( ) )
            self.Y = int ( sys.stdin.read ( ) )
            self.money = 0
            if self.A + self.B < 2 * C :
                money = A * self.X + B * self.Y
            else :
                if self.X > self.Y :
                    money = min ( C * self.Y * 2 + A * ( self.X - self.Y ) , C * self.X * 2 )
                else :
                    money = min ( C * self.X * 2 + B * ( self.Y - self.X ) , C * self.Y * 2 )
            print ( money )
