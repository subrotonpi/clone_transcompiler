def _import ( ) : return sys.stdin.readline ( )
import readline
import readline
import readline
import time
import sys
class Main ( readline ) :
    def __init__ ( self ) :
        self.R , self.G , self.B = readline
    def __call__ ( self , n ) :
        fc = readline.Fastreadline
        return int ( next ( fc ) )
    def __next__ ( self ) :
        a = [ ]
        for i in range ( n ) :
            a.append ( randint ( 0 , len ( a ) ) )
        return a
    def __next__ ( self ) :
        return long ( next ( fc ) )
    def solve ( ) :
        ans = sys.maxint
        for gl in range ( - 500 , 500 + 1 ) :
            gr = gl + G - 1
            gp = calc ( gl , gr , 0 )
            rp = calc_r ( gl )
            bp = calc_b ( gr )
            ans = min ( gp + rp + bp , ans )
        return ans
    def calc_r ( gl ) :
        l = - 100 - R / 2
        r = - 100 + ( R - 1 ) / 2
        if gl <= r :
            push = r - gl + 1
            l -= push
            r -= push
        return calc ( l , r , - 100 )
    def calc_b ( gr ) :
        l = 100 - ( B - 1 ) / 2
        r = 100 + B / 2
        if gr >= l :
            push = gr - l + 1
            l += push
            r += push
        return calc ( l , r , 100 )
    def calc ( l , r , z ) :
        if r < z :
            return calc ( l - z , r - z )
        elif l > z :
            return calc ( l - z , r - z )
        else :
            return calc ( l - z , 0 ) + calc ( z - r , 0 )
    def calc ( l , r ) :
        add = abs ( l + r )
        sub = abs ( r - l )
        if sub % 2 == 0 :
            return ( add // 2 ) * ( sub + 1 )
        else :
            return add * ( ( sub + 1 ) // 2 )
    