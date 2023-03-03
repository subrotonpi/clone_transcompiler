def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
    def main ( self ) :
        return self.n
    def number ( self ) :
        return self.n
    cnt , max , ans = 0 , 0 , 0
    for i in range ( 1 , n + 1 ) :
        cnt = j = i
        for cnt in range ( 0 , 1 ) :
            if j % 2 == 0 :
                j /= 2
            else :
                break
        if max < cnt :
            max , ans = cnt , i
    print ( 1 if n == 1 else ans )
