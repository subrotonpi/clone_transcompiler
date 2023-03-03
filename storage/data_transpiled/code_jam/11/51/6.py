def _solve ( ) :
    import os
    import sys
    import random
    import sys
    import time
    import sys
    class A ( object ) :
        def __init__ ( self , W , L , U , G ) :
            with open ( 'input.txt' , 'w' ) as f :
                self.W = W
                self.L = L
                self.U = U
                self.G = G
                self.xl = [ ]
                self.yl = [ ]
                for i in range ( L ) :
                    self.xl.append ( self.W )
                    self.yl.append ( self.U )
                self.xu = [ ]
                self.yu = [ ]
                self.ss = count ( W )
                res = [ ]
                for i in range ( 1 , G ) :
                    s = ss * i / G
                    ll = 0
                    rr = self.W
                    while rr > ll + 1e-9 :
                        mm = ( ll + rr ) / 2
                        ms = count ( mm )
                        if ms < s :
                            ll = mm
                        else :
                            rr = mm
                    res.append ( "%.2f" % ll )
                return res
            def calc ( x , y , i , xx ) :
                i = 0
                j = 0
                xx = 0
                res = [ ]
                while xx < x :
                    xxx = min ( x , min ( xl [ i + 1 ] , xu [ j + 1 ] ) )
                    h1 = calc ( xu , yu , j , xx ) - calc ( xl [ i ] , yl [ i ] , xx )
                    h2 = calc ( xu , yu , j , xxx ) - calc ( xl [ i ] , yl [ j ] , xxx )
                    res += ( h1 + h2 ) * ( xxx - xx ) / 2
                    if xl [ i + 1 ] == xxx :
                        i += 1
                    if xu [ j + 1 ] == xxx :
                        j += 1
                return res
            return None
    return A ( )
