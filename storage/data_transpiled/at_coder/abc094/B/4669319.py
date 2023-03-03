def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        N = sc.number
        M = sc.number
        X = sc.number
        a = [ ]
        pre = 0
        fol = 0
        for place in range ( M ) :
            if place < X :
                pre += 1
            else :
                fol += 1
        print ( min ( pre , fol ) )
