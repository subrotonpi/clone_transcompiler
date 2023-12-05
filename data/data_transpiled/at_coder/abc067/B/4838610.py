def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
        l = [ ]
        for i in range ( self.n ) :
            l.append ( self.n )
        l.sort ( reverse = True )
        ans = 0
        for i in range ( self.k ) :
            ans += l [ i ]
        print ( ans )
