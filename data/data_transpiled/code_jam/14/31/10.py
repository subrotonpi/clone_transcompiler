def _import ( ) : return ( a , b )
import random
import sys
import sys
class A ( object ) :
    def gcd ( a , b ) : return ( b , a % b )
    def run ( self ) :
        cases = randint ( 0 , len ( self._gen_cases ( ) ) )
        for cs in range ( cases ) :
            s = self._gen_cases ( )
            cc = s.split ( '/' )
            nom = int ( cc [ 0 ] )
            den = int ( cc [ 1 ] )
            g = gcd ( nom , den )
            nom /= g
            den /= g
            if int ( den ) != 1 :
                self.out.write ( "Case #%d: impossible\n" % ( cs + 1 ) )
            else :
                ans = 1
                while ( 1 << ans ) != den and ans < 50 :
                    ans += 1
                if ans > 40 :
                    self.out.write ( "Case #%d: impossible\n" % ( cs + 1 ) )
                else :
                    sub = 0
                    while nom >= ( 1 << sub ) :
                        sub += 1
                    self.out.write ( "Case #%d: %d\n" % ( cs + 1 , ans - sub + 1 ) )
        self.out.flush ( )
    def readline ( ) :
        while not stk or not stk : self._load_line ( )
        return sys.stdin.readline ( )
    def readline ( ) :
        while not stk or not stk : self._load_line ( )
        return sys.stdin.readline ( )
    def readline ( ) :
        while not stk or not stk : self._load_line ( )
        return sys.stdin.readline ( )
    def readline ( ) :
        while not stk or not stk : self._load_line ( )
        return sys.stdin.readline ( )
    return readline
