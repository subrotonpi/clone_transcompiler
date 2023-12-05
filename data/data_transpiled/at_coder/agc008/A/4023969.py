def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = sys.stdin.read ( )
            self.Y = sys.stdin.read ( )
    class Main ( object ) :
        def __init__ ( self ) :
            self.X = sys.stdin.read ( )
            self.Y = sys.stdin.read ( )
    ans = 0
    if X >= 0 and Y >= 0 :
        if X > Y :
            ans += 1 if Y == 0 else 2
            ans += X - Y
        else :
            ans += Y - X
    elif X >= 0 and Y < 0 :
        if X == abs ( Y ) :
            ans += 1
        else :
            ans += 1
            ans += abs ( X + Y )
    elif X < 0 and Y < 0 :
        if X < Y :
            ans += abs ( X - Y )
        else :
            ans += 2
            ans += abs ( Y - X )
    elif X < 0 and Y >= 0 :
        if abs ( X ) == Y :
            ans += 1
        else :
            ans += Y == 0
            ans += abs ( X + Y )
    print ( ans )
