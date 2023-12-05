def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A , self.B = sys.stdin.read ( ).split ( '\n' )
    A = Main ( )
    B = Main ( )
    A.close ( )
    B.close ( )
    ans = 0
    for i in range ( A + 1 ) :
        for j in range ( A + 1 ) :
            if B - i - j <= A and B - i - j >= 0 :
                ans += 1
    print ( ans )
