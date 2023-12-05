def _import ( ) : return _import ( )
import sys
import io
import inspect
import string
import string
import sys
import string
import string
class Main ( object ) :
    def __init__ ( self ) :
        self.stdin = sys.stdin
        self.stdout = sys.stdout
        self.n = self.n
        self.k = self.k
        self.memo = [ ]
        for i in range ( 0 , self.n ) :
            [ self.memo [ i ] ] = - 1
        self.stdout.write ( string.join ( self.memo , "" ) )
        self.stdout.flush ( )
    def debug ( self , * o ) :
        print ( string.join ( self.memo , "" ) )
    def debug ( self , * o ) :
        return self.debug ( * o )
    def debug ( self , * o ) :
        return self.debug ( * o )
    def debug ( self , * o ) :
        if self.left == 0 or self.idx == self.n :
            return 0.0d
        if self.memo [ self.idx ] [ self.left ] >= 0 :
            return self.memo [ self.idx ] [ self.left ]
        rateofN = 1./ ( self.n - self.idx )
        best = rateofN + ( 1.- rateofN ) * 1./ ( self.idx + 1 )
        bestIsN = rateofN / best
        ret = 0
        eat = best * ( bestIsN + ( 1.- bestIsN ) * dfs ( self.idx + 1 , self.left - 1 ) )
        noteat = best * ( 1.- bestIsN ) * dfs ( self.idx + 1 , self.left )
        ret += max ( eat , noteat )
        ret += ( 1.- best ) * dfs ( self.idx + 1 , self.left )
        self.memo [ self.idx ] [ self.left ] = ret
        return ret
    def next ( self ) :
        self.stream = stream
    def read ( self ) :
        self.stream = self.stream.read ( )
    def write ( self , buf ) :
        self.stream.write ( buf )
