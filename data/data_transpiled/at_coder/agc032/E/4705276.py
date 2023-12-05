def import _readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import sys
class Main :
    def __init__ ( self , vals ) :
        self.vals = vals
        self.M , self.N = self.N , self.N
    def sum_left ( self , pairs ) :
        ret = 0
        for i in range ( pairs ) :
            ret = max ( ret , self.vals [ i ] + self.vals [ 2 * pairs - 1 - i ] )
        return ret
    def sum_right ( self , pairs ) :
        rem = N - self.pairs
        ret = 0
        for i in range ( rem ) :
            sum = self.vals [ 2 * N - 1 - i ] + self.vals [ 2 * pairs + i ] - M
            if sum < 0 : return M
            ret = max ( ret , sum )
        return ret
    def main ( self ) :
        sc = readline.get_scanner ( )
        f = open ( self.outfile , 'w' )
        N , M = sc.N , sc.M
        vals = [ sc.next ( ) for i in range ( 2 * N ) ]
        vals.sort ( )
        left , right = - 1 , N
        while left + 1 < right :
            med = ( left + right ) // 2
            if sum_right ( med ) < M :
                right = med
            else :
                left = med
        ans = max ( sum_left ( right ) , sum_right ( right ) )
        f.write ( ans )
        f.flush ( )
