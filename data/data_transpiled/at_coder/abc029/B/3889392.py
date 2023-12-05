def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        S = [ ]
        ans = 0
        for i in range ( 12 ) :
            S.append ( sc.get ( i ) )
            if 'r' in S :
                ans += 1
        print ( ans )
