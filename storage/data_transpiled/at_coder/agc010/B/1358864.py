def import import _readline , Solver , solver , N
from io import StringIO
import sys
class Main ( object ) :
    def __init__ ( self , f ) :
        self.f = sys.stdin
        self.solver = Solver ( )
        self.solver.__init__ ( self )
        self.solver.read_head ( f.read ( ) )
        for _ in range ( self.solver.n_nodes ) :
            self.solver.read_body ( f.read ( ) )
class Solver ( object ) :
    def __init__ ( self ) :
        self.N = 0
        self.cnt = 0
    def read_head ( self ) :
        str_arr = self.f.read ( )
        self.N = int ( str_arr [ 0 ] )
    def __iter__ ( self ) :
        return self.cnt < 1
    def read_body ( self ) :
        self.cnt += 1
        str_arr = self.f.read ( )
        sum = 0
        for i in range ( self.N ) :
            sum += int ( str_arr [ i ] )
        if sum % ( long ( N ) * ( long ( N ) + 1 ) / 2 ) != 0 :
            print ( "NO" )
            return
        k = sum / ( long ( N ) * ( long ( N ) + 1 ) / 2 )
        able = True
        edge = 0
        for i in range ( self.N ) :
            d = - int ( str_arr [ i ] ) - k
            if i == self.N - 1 :
                d += int ( str_arr [ 0 ] )
            else :
                d += int ( str_arr [ i + 1 ] )
            if d > 0 :
                able = False
                break
            if d < 0 :
                if d % N != 0 :
                    able = False
                    break
                edge -= d
        if able :
            able = ( edge == self.N * k )
        if able :
            print ( "YES" )
        else :
            print ( "NO" )
