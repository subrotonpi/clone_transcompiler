def _gao ( x , y , c ) :
    import sys
    from math import sin , cos , cos , tan
    class BB ( object ) :
        def __init__ ( self , x , y , c ) :
            self.p = x
            self.t = 0
            while self.p < y :
                self.p = self.p * c
                self.t += 1
            self.t -= 1
            ret = 0
            while self.t > 0 :
                self.t /= 2
                ret += 1
            return ret
        def __call__ ( self , x , y , c ) :
            with open ( self.p , 'r' ) as f :
                return f.read ( )
    for i in range ( t ) :
        x = BB ( x , y , c )
        ret = gao ( x , y , c )
        print ( "Case #%d: %s" % ( i + 1 , ret ) )
