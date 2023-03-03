def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.argv.count ( 'N' )
    def main ( self ) :
        self.N = sys.argv.count ( 'N' )
    ans = 0
    for i in range ( N ) :
        a = sys.argv.pop ( i )
        max = 1
        for j in range ( 1 , a + 1 ) :
            if j % 3 != 2 and j % 2 == 1 :
                max = j
        ans += a - max
    print ( ans )
