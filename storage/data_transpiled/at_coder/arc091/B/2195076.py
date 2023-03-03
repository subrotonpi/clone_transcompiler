def _import ( ) : return sys.stdin
import readline
import tokenize
class Main ( object ) :
    DEBUG = False
    DEBUG_INPUT = [ '5 0' , ]
    class Solver ( object ) :
        def __init__ ( self , f ) :
            self.MIN = - 999_999_999
            self.MAX = 999_999_999
        def solve ( self , f , out ) :
            n , k = next ( self.MIN ) , next ( self.MAX )
            out.write ( self.solve2 ( n , k ) )
        def solve2 ( self , n , k ) :
            if not k :
                return long ( n ) * n
            res = 0
            for b in range ( k + 1 , n + 1 ) :
                p , r = n // b , n % b
                res += long ( p ) * ( b - k )
                res += max ( 0 , r - k + 1 )
            return res
    def main ( ) :
        f = None
        if DEBUG :
            for s in DEBUG_INPUT :
                f = io.StringIO ( s )
                f = open ( f , 'w' )
                f.write ( '===>>> INPUT' )
                f.write ( s + '\n\n' )
                f.write ( '===>>> OUTPUT' )
                start = time.time ( )
                with f :
                    Solver ( ).solve ( f , f )
                    end = time.time ( )
                    f.write ( '\n' )
                    f.write ( ' = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =