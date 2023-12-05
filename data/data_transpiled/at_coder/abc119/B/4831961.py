def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            n = sc.readline ( ).strip ( )
            x = [ ]
            u = [ ]
            ans = 0
            for i in range ( n ) :
                x.append ( sc.readline ( ) )
                u.append ( sc.readline ( ) )
                if u [ i ] == 'JPY' :
                    ans += x [ i ]
                else :
                    ans += x [ i ] * 380000
            sys.stdout.write ( ans )
