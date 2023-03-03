def _ _ main _ _ ( ) : return sys.stdin
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import readline
import tokenize
class Main ( object ) :
    def __init__ ( self , o ) :
        self.i , self.c = o
    def __next__ ( self ) :
        try :
            tok = tokenize.next ( )
        except tokenize.EOF :
            raise InputError ( )
        return tok [ 0 ]
    def __next__ ( self ) :
        return int ( __next__ ( self ) )
    def __next__ ( self ) :
        return float ( __next__ ( self ) )
    def __next__ ( self ) :
        res = [ ]
        for i in range ( self.n ) :
            res.append ( nextLong ( self ) )
        return res
    def __next__ ( self ) :
        return [ ]
    def INF ( self ) :
        return 1 << 27
    def MOD ( self ) :
        return 1000000007
    def mh4 ( self ) :
        return [ 0 , - 1 , 1 , 0 ]
    def mw8 ( self ) :
        return [ - 1 , - 1 , 0 , 0 , 1 , 1 ]
    def mw8 ( self ) :
        return [ - 1 , 0 , 1 , - 1 , 1 , 0 , 1 ]
    def solve ( self , test_number , self , g ) :
        n , m = self.n , self.m
        g = [ ]
        for i in range ( self.n ) :
            for j in range ( self.n ) :
                if i != j :
                    g.append ( INF )
            for j in range ( self.n ) :
                if i != j :
                    g [ i ] [ j ] = max ( g [ i ] [ j ] , g [ i ] [ k ] + g [ k ] [ j ] )
        ps = [ P ( i , j ) for j in range ( self.n ) ]
        return ps
