def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
    def run ( self ) :
        N = sys.stdin.read ( )
        count = 0
        while N >= 10 :
            N -= 10
            count += 1
        if 0 <= N <= 6 :
            print ( count * 100 + 15 * N )
        elif 7 <= N <= 9 :
            print ( 100 * ( count + 1 ) )
