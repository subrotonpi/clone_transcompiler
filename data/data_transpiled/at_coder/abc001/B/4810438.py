def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = int ( sc.readline ( ) )
        a = a / 1000
        vv = 0
        if a < 0.1 :
            pass
        elif 0.1 <= a <= 5 :
            vv = a * 10
        elif 6 <= a <= 30 :
            vv = a + 50
        elif 35 <= a <= 70 :
            vv = ( a - 30 ) / 5 + 80
        else :
            vv = 89
        intvv = int ( vv )
        print ( '%02d' % intvv )
        sys.stdout.flush ( )
        sc.close ( )
