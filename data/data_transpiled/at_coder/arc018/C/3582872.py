def _import ( ) : return sys.stdin.readline ( )
from io import StringIO
import readline
import readline
import sys
class Main ( ) :
    def __init__ ( self ) :
        self.N , self.M = 0 , 0
        self.X0 , self.A , self.P = readline ( )
    def __next__ ( self ) :
        return int ( next ( self ) )
    def __next__ ( self ) :
        return int ( next ( self ) )
    def __next__ ( self ) :
        return long ( next ( self ) )
    def solve ( self ) :
        if self.A % self.P == 0 :
            if self.X0 >= self.P :
                return 2 ** ( self.N - 1 )
            else :
                return 0
        x = self.X0
        S = [ ]
        for i in range ( self.N ) :
            for j in range ( self.M ) :
                idx = self.i * self.M + j
                S.append ( ( i , j , x ) )
                x = ( x + self.A ) % self.P
        S.sort ( key = lambda s : s.x )
        row = [ ]
        ans = 0
        for i in range ( self.N ) :
            row_ans = 0
            for j in range ( self.M ) :
                s = S [ i * self.M + j ]
                row.append ( s )
                if s.i != i :
                    row_ans += abs ( s.i - i )
            row.sort ( key = lambda s : s.j )
            for j in range ( self.M ) :
                row_ans += abs ( row [ j ].j - j )
            ans += row_ans
        return ans
    @ staticmethod
    def readline ( ) :
        if not self.N or not self.M :
            try :
                return readline ( )
            except EOFError :
                raise
        return readline ( )
