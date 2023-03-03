def import import sys , math , out
import os
import sys , math
class Main ( object ) :
    mod = 1000000007
    def __init__ ( self ) :
        self.mod = mod
    def run ( self ) :
        with open ( self.infile , 'r' ) as f :
            n , m = struct.unpack ( '>i' , f.read ( ) )
            score = [ 0 ] * ( m + 2 )
            sum = 0
            for l , r , s in [ ( l , r , s ) for s in [ 1 , 2 , 3 , 4 ] ] :
                score [ l ] += s
                score [ r + 1 ] -= s
                sum += s
            for i in range ( 1 , m + 1 ) :
                score [ i ] += score [ i - 1 ]
        ans = 0
        for i in range ( 1 , m + 1 ) :
            ans = max ( ans , sum - score [ i ] )
        out.write ( ans )
