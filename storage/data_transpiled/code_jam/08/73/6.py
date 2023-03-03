def import import os , sys , random , locale
from numpy.core import solve
class C ( object ) :
    def __init__ ( self ) :
        self.solve ( )
    def go ( self , p , res ) :
        if p == q :
            buf.append ( res )
            return
        for i in range ( 4 ) :
            go ( self , p + 1 , data [ p ] [ i ] * res )
    def solve ( self ) :
        locale.setlocale ( locale.LC_ALL , '' )
        f = open ( 'c.out' , 'w' )
        f.seek ( 0 )
        N = random.randint ( 1 , N )
        for t in range ( 1 , N + 1 ) :
            f.write ( 'Case #%d: ' % t )
            m = random.randint ( 1 , N )
            q = random.randint ( 1 , N )
            data = [ [ random.uniform ( 0 , 4 ) for i in range ( q ) ] for j in range ( 4 ) ]
            buf = [ ]
            go ( 0 , 1 )
            buf.sort ( )
            ans = 0
            for i in buf [ : - 1 ] :
                ans += i
            f.write ( ans )
        f.close ( )
