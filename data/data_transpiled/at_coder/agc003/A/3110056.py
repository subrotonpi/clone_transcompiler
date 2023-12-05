def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            s = sc.read ( )
            N = 0
            S = 0
            E = 0
            W = 0
            for c in s :
                if c == 'N' :
                    N = N | 1
                if c == 'E' :
                    E = E | 1
                if c == 'S' :
                    S = S | 1
                if c == 'W' :
                    W = W | 1
        flag1 = N ^ S
        flag2 = E ^ W
        ans = 'Yes' if ( flag1 == 0 and flag2 == 0 ) else 'No'
        print ( ans )
