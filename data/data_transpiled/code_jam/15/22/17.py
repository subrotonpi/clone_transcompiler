def import _open
import os
import sys
class Noisy ( object ) :
    def __init__ ( self ) :
        self.dx = [ 0 , 1 , 0 , - 1 ]
        self.dy = [ 1 , 0 , - 1 , 0 ]
        self.pains [ 0 ] += 1
    def main ( self ) :
        with open ( 'B-large.in' , 'r' ) as f :
            with open ( 'Noisy.out' , 'w' ) as out :
                self.ans = min ( self.ow , self.ow2 )
def write ( self , out ) :
    self.ans = min ( self.ow , self.ow2 )
loops = [ ]
for loop in range ( loops ) :
    r , c , n = [ int ( x ) for x in range ( 0 , r ) ]
    ans = 0
    if ( r * c + 1 ) / 2 >= n :
        ans = 0
    else :
        occupied = np.zeros ( ( r , c ) )
        pains = np.zeros ( ( 5 , n ) )
        left = n
        for i in range ( r ) :
            for j in range ( c ) :
                if ( i + j ) % 2 == 0 :
                    occupied [ i ] [ j ] = True
                    left -= 1
        for i in range ( r ) :
            for j in range ( c ) :
                if not occupied [ i ] [ j ] :
                    pain = 0
                    for k in range ( 4 ) :
                        try :
                            if occupied [ i + dx [ k ] ] [ j + dy [ k ] ] :
                                pain += 1
                        except :
                            pass
                    pains [ pain ] += 1
        ow = 0
        out :
            self.ans = 0
write ( 'Case #%d: %d\n' % ( loop + 1 , ans ) )
