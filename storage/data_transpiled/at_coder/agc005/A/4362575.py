def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        x = sc.next ( )
        ss = 0
        ts = 0
        for i in x :
            if i == 'S' :
                ss += 1
            else :
                if ss == 0 :
                    ts += 1
                else :
                    ss -= 1
        print ( ss , ts )
