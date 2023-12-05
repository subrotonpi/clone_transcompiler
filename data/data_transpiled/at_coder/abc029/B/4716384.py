def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
    def __call__ ( self , * args ) :
        S = [ ]
        for i in range ( 12 ) :
            S.append ( sc.readline ( ) )
    ans = 0
    for i in range ( 12 ) :
        f = 0
        for j in S :
            if j == 'r' :
                f = 1
        if f :
            ans += 1
    print ( ans )
