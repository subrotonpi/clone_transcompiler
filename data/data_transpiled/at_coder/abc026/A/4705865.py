def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.A = sys.stdin.read ( )
    ans = 0
    for i in range ( 1 , 100 ) :
        for j in range ( 1 , 100 ) :
            if i + j == A :
                ans = max ( ans , i * j )
    print ( ans )
