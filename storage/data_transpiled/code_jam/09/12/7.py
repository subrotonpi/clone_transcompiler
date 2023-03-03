def _import ( ) :
    import os
    import sys
    class Main ( object ) :
        def __init__ ( self , FNAME ) :
            self.FNAME = FNAME
        def open ( self , f ) :
            self.FNAME = FNAME + '.in'
            self.FNAME = FNAME + '.out'
        def close ( self ) :
            self.FNAME = FNAME + '.out'
        def run ( self ) :
            try :
                solution = Main ( )
                solution.open ( self.FNAME )
                solution.close ( )
            except :
                raise
        def run ( self ) :
            tn = self.BID
            for test in range ( 1 , tn + 1 ) :
                r = self.BID
                c = self.BID
                nsg = [ ]
                ewg = [ ]
                off = [ ]
                for i in range ( r - 1 , - 1 , - 1 ) :
                    for j in range ( c ) :
                        nsg.append ( [ ] )
                        ewg.append ( [ ] )
                        off.append ( [ ] )
                g = [ ]
                dist = [ ]
                for i in range ( 2 * r ) :
                    [ i ] = long ( i ) / 2
                dist.append ( [ ] )
                while not g [ 2 * r - 1 ] [ 2 * c - 1 ] :
                    bi = - 1
                    bj = - 1
                    bd = long ( i ) / 4
                    for i in range ( 2 * r ) :
                        for j in range ( 2 * c ) :
                            if not g [ i ] [ j ] and dist [ i ] [ j ] <= bd :
                                bd = dist [ i ] [ j ]
                                bi = i
                                bj = j
                    g [ bi ] [ bj ] = True
                    m = nsg [ bi >> 1 ] [ bj >> 1 ] + ewg [ bi >> 1 ] [ bj >> 1 ]
                    t = ( - bd + off [ bi >> 1 ] [ bj >> 1 ] ) % m
                    if t > 0 :
                        break
            return True
    return Main ( )
