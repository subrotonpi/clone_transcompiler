def import _duyet
import math
import math
import math
import math
import math
class BaiD :
    def __init__ ( self , a , pos , cur ) :
        if self.res :
            return
        if pos == len ( a ) :
            z = long ( math.sqrt ( cur ) + 0.1 )
            if z * z == cur :
                res = ''.join ( b )
            return
        if a [ pos ] == '0' :
            b [ pos ] = '0'
            self.duyet ( a , pos + 1 , cur * 2 )
        elif a [ pos ] == '1' :
            b [ pos ] = '1'
            self.duyet ( a , pos + 1 , cur * 2 + 1 )
        else :
            b [ pos ] = '0'
            self.duyet ( a , pos + 1 , cur * 2 )
            b [ pos ] = '1'
            self.duyet ( a , pos + 1 , cur * 2 + 1 )
    def main ( self ) :
        with open ( 'Dsmall.out' , 'w' ) as f :
            self.ntest = len ( self.baiD )
            for test in range ( 1 , ntest + 1 ) :
                a = self.baiD [ test ]
                b = [ ]
                self.res = None
                self.duyet ( a , 0 , 0 )
                f.write ( 'Case #%d: ' % test )
                f.write ( res )
                f.write ( '\n' )
