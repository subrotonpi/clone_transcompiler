def _import ( ) : return _import ( )
import os
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        A = nl ( )
        B = nl ( )
        C = nl ( )
        if A + B >= C :
            self.out.write ( B + C )
        else :
            self.out.write ( B + ( A + B ) + 1 )
    def ni ( self ) : return sc.getN ( )
    def nl ( self ) : return sc.getN ( )
    def ns ( self ) : return sc.getN ( )
    def niarr ( self ) :
        a = [ ]
        for i in range ( self.N ) :
            a.append ( sc.getN ( ) )
        return a
    def nlarr ( self ) :
        a = [ ]
        for i in range ( self.N ) :
            a.append ( sc.getN ( ) )
        return a
