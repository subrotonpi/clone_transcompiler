def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.a = [ _main ( ) for _ in range ( self.N ) ]
    def go ( self ) :
        self.a = [ _main ( ) for _ in range ( self.N ) ]
        if self.N == 1 :
            print ( 1 )
            return
        l = 0
        r = 0
        con = [ False ] * 100010
        res = 0
        while r != self.N :
            cur = self.a [ r ]
            if not con [ cur ] :
                con [ cur ] = True
                r += 1
                clen = self.r - l
                res = max ( res , clen )
            else :
                con [ self.a [ l ] ] = False
                l += 1
        print ( res )
