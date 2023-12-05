def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.po = { }
    def go ( self ) :
        self.n = int ( self.n )
        ppp = True
        self.g = self.g
        self.po [ g ] = 0
        nstr = self.g [ - 1 ]
        for i in range ( self.n - 1 ) :
            x = self.g [ i ]
            if x in self.po :
                ppp = False
                break
            else :
                if nstr == x [ 0 ] :
                    nstr = x [ - 1 ]
                    self.po [ x ] = 0
                else :
                    ppp = False
                    break
        print ( ( "Yes" if ppp else "No" ) )
