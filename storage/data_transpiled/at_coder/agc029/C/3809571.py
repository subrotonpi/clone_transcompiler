def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.a = [ ]
        for i in range ( n ) :
            self.a.append ( i )
    def main ( ) :
        nodec = True
        for i in range ( 1 , n ) :
            if self.a [ i ] <= self.a [ i - 1 ] :
                nodec = False
        if nodec :
            print ( 1 )
            return
        m = 500
        l , r = 1 , 210000
        mid = 2
        dec = [ 0 ] * m
        out :
        while r - l > 1 :
            mid = ( l + r ) / 2
            dec = [ 1 ] * m
            nout :
            for i in range ( 1 , n ) :
                if self.a [ i ] <= self.a [ i - 1 ] < m :
                    if self.dec [ i - 1 ] < mid :
                        self.dec [ i - 1 ] += 1
                    else :
                        pos = self.a [ i ] - 1
                        while pos > 0 :
                            self.dec [ pos - 1 ] += 1
                            for j in range ( pos , m ) :
                                self.dec [ j ] = 1
                            if self.dec [ pos - 1 ] <= mid :
                                continue nout
                            pos -= 1
                        l = mid
                        continue out
                else :
                    for j in range ( self.a [ i ] - 1 , m ) :
                        self.dec [ j ] = 1
        r = mid
    print ( r )
