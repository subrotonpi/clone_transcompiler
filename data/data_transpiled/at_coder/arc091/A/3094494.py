def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.maxint
        self.m = sys.maxint
    def run ( self ) :
        n = self.n
        m = self.m
        if n > m :
            tmp = n
            self.n = m
            self.m = tmp
        if n == 1 :
            if m == 1 :
                print ( "1" )
            else :
                print ( m - 2 )
        elif n == 2 :
            print ( "0" )
        else :
            print ( ( n - 2 ) * ( m - 2 ) )
