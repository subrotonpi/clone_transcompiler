def _import ( ) :
    import sys
    import struct
    class Main ( object ) :
        def __init__ ( self ) :
            self.S = self.ns ( )
            ans = 0
            cnt = 0
            for i in range ( len ( S ) ) :
                if S [ i ] == 'W' :
                    ans += i - cnt
                    cnt += 1
            self.out.write ( ans )
        def ni ( self ) :
            return self.ni
        def nl ( self ) :
            return self.nl
        def ns ( self ) :
            return self.ns ( )
        def niarr ( self , N ) :
            a = struct.unpack ( '<I' , self.S )
            return a
        def nlarr ( self , N ) :
            a = struct.unpack ( '<I' , self.S )
            return a
    return Main
