def round3 ( ) :
    import math
    import os
    import os
    import sys
    import os
    import math
    import os
    import os
    class D :
        def __init__ ( self ) :
            self.stepeni = [ 1 ]
            for i in range ( 1 , len ( self.stepeni ) ) :
                self.stepeni [ i ] = 2 * self.stepeni [ i - 1 ]
        def jePotpunKvadrat ( a ) :
            koren = round ( math.sqrt ( a ) , 1 )
            return koren * koren == a
        def resi ( self , value , position ) :
            if jePotpunKvadrat ( value ) :
                return value
            if position == len ( self.stepeni ) :
                return - 1
            if self.stepeni [ position ] == '?' :
                res = self.resi ( value , position + 1 )
                if res != - 1 :
                    return res
                return self.resi ( value + self.stepeni [ - position - 1 ] , position + 1 )
            else :
                return self.resi ( value , position + 1 )
        def main ( self ) :
            with open ( 'D.in' , 'r' ) as infile :
                with open ( 'D.out' , 'w' ) as outfile :
                    tt = infile.read ( )
                    for ttt in range ( 1 , tt + 1 ) :
                        s = infile.read ( )
                        min = 0
                        for i in range ( len ( s ) ) :
                            if s [ - i - 1 ] == '1' : min += self.stepeni [ i ]
                        res = self.resi ( s , min , 0 )
                        outfile.write ( 'Case #%d: %s\n' % ( ttt , int ( res ) ) )
                        outfile.write ( '\n' )
                outfile.flush ( )
                outfile.close ( )
                infile.close ( )
