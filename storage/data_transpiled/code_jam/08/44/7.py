def _import ( ) :
    import sys
    import string
    import struct
    class x :
        def __init__ ( self , mn , a , l , k ) :
            if x >= k :
                for j in range ( l // k ) :
                    for d in range ( k ) :
                        c2 [ k * j + a [ d ] ] = c1 [ k * j + d ]
                cc = '@'
                cnt = 0
                for j in range ( l ) :
                    if c2 [ j ] != cc :
                        cc = c2 [ j ]
                        cnt += 1
                mn = min ( cnt , mn )
            else :
                for i in range ( k ) :
                    if not b [ i ] :
                        b [ i ] = True
                        a [ x ] = i
                        self.rec ( x + 1 )
                        b [ i ] = False
    def rec ( x ) :
        if x >= k :
            for j in range ( l // k ) :
                for d in range ( k ) :
                    c2 [ k * j + a [ d ] ] = c1 [ k * j + d ]
        else :
            for i in range ( k ) :
                if not b [ i ] :
                    b [ i ] = True
                    a [ x ] = i
                    self.rec ( x + 1 )
                    b [ i ] = False
    def main ( args ) :
        with open ( 'input.txt' , 'r' ) as f :
            t = int ( f.read ( ) )
            for tt in range ( 1 , t + 1 ) :
                k , s = f.read ( ).split ( ' ' )
                l , c1 = s.split ( ' ' )
                c2 = [ ]
                mn = int ( 1e9 )
                a = [ ]
                b = [ ]
                self.rec ( 0 )
                print ( 'Case #%d: %d' % ( tt , mn ) )
