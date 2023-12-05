def import import *
class Main ( object ) :
    def __init__ ( self ) :
        self._win = None
    def __call__ ( self , * args ) :
        xi = args [ 0 ]
        xo = args [ 1 ]
        xt = args [ 2 ]
        xj = args [ 3 ]
        xl = args [ 4 ]
        ans1 = 0
        ans2 = 0
        ans1 += ( xj / 2 ) * 2
        ans1 += ( xl / 2 ) * 2
        ans1 += ( xi / 2 ) * 2
        ans1 += xo
        if xi != 0 and xj != 0 and xl != 0 :
            ans2 += 3
            xj -= 1
            xl -= 1
            xi -= 1
        ans2 += ( xj / 2 ) * 2
        ans2 += ( xl / 2 ) * 2
        ans2 += ( xi / 2 ) * 2
        ans2 += xo
        print ( max ( ans1 , ans2 ) )
        return
