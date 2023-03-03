def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            A = int ( sc.readline ( ) )
            B = int ( sc.readline ( ) )
            C = int ( sc.readline ( ) )
            X = int ( sc.readline ( ) )
    ans = 0
    for a in range ( 0 , A ) :
        for b in range ( 0 , B ) :
            for c in range ( 0 , C ) :
                if a * 500 + b * 100 + c * 50 == X :
                    ans += 1
    print ( ans )
