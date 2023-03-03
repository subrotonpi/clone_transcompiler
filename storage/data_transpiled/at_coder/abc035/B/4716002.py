def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.S = sys.stdin.read ( )
        self.T = sys.stdin.read ( )
        cnt = 0
        x , y = 0 , 0
        for i in S :
            if i == 'L' :
                x -= 1
            elif i == 'R' :
                x += 1
            elif i == 'U' :
                y += 1
            elif i == 'D' :
                y -= 1
            elif i == '?' :
                cnt += 1
        if self.T == 1 :
            ans = 0
            if x >= 0 :
                x += cnt
            else :
                x -= cnt
            ans = abs ( x ) + abs ( y )
            print ( ans )
        elif self.T == 2 :
            ans = 0
            if abs ( x ) + abs ( y ) == cnt :
                print ( 0 )
            elif abs ( x ) + abs ( y ) < cnt :
                ans = cnt - abs ( x ) + abs ( y )
                if ans % 2 == 0 :
                    print ( 0 )
                else :
                    print ( 1 )
            else :
                ans = abs ( x ) + abs ( y ) - cnt
                print ( ans )
