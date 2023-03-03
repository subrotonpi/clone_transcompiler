def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.S = sys.stdin.read ( )
        self.K = sys.maxsize
        s = S.split ( '' )
        ans = '1'
        if self.K <= 100 :
            for i in range ( self.K ) :
                if not i in s :
                    ans = s [ i ]
                    break
        else :
            for i in s :
                if not i in ans :
                    ans = i
                    break
        print ( ans )
