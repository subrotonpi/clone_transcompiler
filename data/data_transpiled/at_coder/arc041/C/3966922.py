def import _help
import sys
import os
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.mod = 1000000000 + 7
    def __init__ ( self ) :
        with open ( sys.argv [ 1 ] ) as sc :
            n = int ( sc.read ( ) )
            L = sc.read ( )
            x = [ ]
            dir = [ ]
            for i in range ( n ) :
                x.append ( sc.read ( ) )
                d = sc.read ( )
                dir.append ( 'L' if d == 'L' else 'R' )
            ans = self.help ( n , x , dir , L )
            print ( ans )
    def help ( self , n , x , dir , len ) :
        ans = 0
        start , end = 0 , n - 1
        while start < n and dir [ start ] == 'L' :
            ans += x [ start ] - ( start + 1 )
            start += 1
        while end >= 0 and dir [ end ] == 'R' :
            ans += ( len + 1 - ( n - end ) ) - x [ end ]
            end -= 1
        cur_right = list ( )
        if end < start :
            return ans
        left = x [ start ]
        while start <= end :
            if dir [ start ] == 'R' :
                right = start
                while right < end and dir [ right ] == 'R' :
                    cur_right.append ( x [ right ] )
                cntleft , leftstart = 0 , right
                while leftstart <= end and dir [ leftstart ] == 'L' :
                    leftstart += 1
                    cntleft += 1
                left = x [ right - 1 ] if len ( cur_right ) <= cntleft else x [ right ] - 1
                res = - ( len ( cur_right ) ) * ( len ( cur_right ) - 1 ) / 2
                while len ( cur_right ) > 0 :
                    res += left - cur_right.pop ( )
                ans += res
                start = right
        else :
            ans += x [ start ] - left - 1
            left += 1
return Main
