def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = self.N
        self.M = self.M
        s = [ ]
        t = [ ]
        x = [ ]
        b = [ ]
        for i in range ( M ) :
            s.append ( self.N )
            t.append ( self.M )
            l = s [ i ] - 1
            r = t [ i ] - 1
            b [ l ] += 1
            b [ r + 1 ] -= 1
        for i in range ( N + 1 ) :
            b [ i + 1 ] += b [ i ]
        for i in range ( 1 , N + 1 ) :
            if b [ i - 1 ] == 1 :
                x.append ( 1 )
            else :
                x.append ( 0 )
        for i in range ( 1 , N ) :
            x [ i + 1 ] += x [ i ]
        ans = [ ]
        for i in range ( M ) :
            if x [ t [ i ] ] - x [ s [ i ] - 1 ] == 0 :
                ans.append ( i + 1 )
        print ( len ( ans ) )
        for i in ans :
            print ( i )
