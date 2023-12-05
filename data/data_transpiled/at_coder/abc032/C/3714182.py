def _import ( ) : return sys.stdout.write
import string
import tokenize
import tokenize
import function
class Main ( object ) :
    def __init__ ( self , f ) :
        sc = sys.stdin
        self.N = sc.__next__ ( )
        self.K = sc.__next__ ( )
        self.A = sc.__next__ ( )
        print ( self.solve ( ) )
    def _eval ( self , * args ) :
        j = string.join
        for a in args :
            if isinstance ( a , int ) :
                j += string.join
            elif isinstance ( a , float ) :
                j += string.join
            elif isinstance ( a , tuple ) :
                j += tuple
            else :
                j += tuple
        print ( j )
    def debug ( self ) :
        for a in self.A :
            if isinstance ( a , int ) :
                return N
        if isinstance ( self.K , int ) :
            return 0
        ans = 0
        r = 0
        mul = 1
        for l in range ( self.N ) :
            while r < self.N :
                if mul * self.A [ r ] <= K :
                    mul *= self.A [ r ]
                    r += 1
                else :
                    break
            ans = max ( r - l , ans )
            if r > self.l :
                mul /= self.A [ r ]
            else :
                r += 1
        return ans
    @ function
    def _readline ( self ) :
        if not self._readline or not self._readline :
            try :
                self._readline = _readline ( self )
            except IOError :
                raise IOError ( "readline not found" )
        return self._readline
    def _readline ( self ) :
        return long ( self )
    def _readline ( self ) :
        return int ( self )
