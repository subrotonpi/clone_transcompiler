def _ ( ) : return sys._getframe ( ).f_code.co_name
import os
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        self.N , x = self.ni ( )
        a = niarr ( N )
        a.sort ( )
        num = 0
        i = 0
        while i < N and x >= a [ i ] :
            x -= a [ i ]
            i += 1
            num += 1
        if x and num and i == N :
            num -= 1
        self.out.write ( num )
    def ni ( self ) : return sc.ni ( )
    def nl ( self ) : return sc.nl ( )
    def ns ( self ) : return sc.ns ( )
    def niarr ( self ) :
        a = [ sc.ni ( ) for i in range ( self.N ) ]
        return a
    def nlarr ( self ) :
        a = [ sc.nlarr ( ) for i in range ( self.N ) ]
        return a
