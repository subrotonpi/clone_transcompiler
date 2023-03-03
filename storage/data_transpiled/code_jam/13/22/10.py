def main ( ) :
    import gcj
    import numpy as np
    class FallingDiamonds ( gcj.Diamonds ) :
        def __init__ ( self ) :
            s = gcj.Diamonds.__init__ ( self , 'B' , True )
            self.T = s.size
    for i in range ( 1 , T + 1 ) :
        n , x , y = s.size
        p = 0
        nn = 1
        total = 1
        while total + nn + 1 + nn + 2 <= n :
            total += nn + 1 + nn + 2
            nn += 2
        xy = abs ( x ) + y
        if xy < nn :
            p = 1
        elif xy >= nn + 2 :
            p = 0
        else :
            left = n - total
            if left < y + 1 :
                p = 0
            else :
                nn += 1
                cand = np.zeros ( ( nn + 1 , nn + 1 ) )
                cand [ 0 ] [ 0 ] = 1
                for w in range ( 1 , left + 1 ) :
                    for u in range ( w , nn + 1 ) :
                        v = w - u - 1
                        if v > nn :
                            continue
                        if u == nn :
                            cand [ u , v + 1 ] += cand [ u , v ]
                        elif v == nn :
                            cand [ u + 1 , v ] += cand [ u , v ]
                        else :
                            cand [ u + 1 , v ] += cand [ u , v ] / 2
                            cand [ u , v + 1 ] += cand [ u , v ] / 2
                p = 0
                for u in range ( y + 1 , left + 1 ) :
                    v = left - u
                    if v > nn :
                        continue
                    p += cand [ u , v ]
        gcj.Diamonds.__init__ ( self , float ( p ) )
