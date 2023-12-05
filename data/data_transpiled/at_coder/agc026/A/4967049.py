def _import ( ) :
    from os import urandom
    from nlarr import nlarr
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = urandom ( )
        def read ( self ) :
            N = self.ni
            a = niarr ( N )
            cnt = 0
            for i in range ( 1 , N ) :
                if a [ i - 1 ] == a [ i ] :
                    cnt += 1
                    i += 1
            self.out.write ( cnt )
        def ni ( self ) :
            return self.sc.ni
        def nl ( self ) :
            return self.sc.nl
        def ns ( self ) :
            return self.sc.ns
        def niarr ( self ) :
            a = [ ]
            for i in range ( self.N ) :
                a.append ( self.sc.ni ( i ) )
            return a
        def nlarr ( self ) :
            a = [ ]
            for i in range ( self.N ) :
                a.append ( self.sc.nlarr ( i ) )
            return a
    return Main
