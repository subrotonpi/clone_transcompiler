def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
    def __call__ ( self , * args ) :
        self.n = int ( self.n )
    ans = 0
    for i in range ( n ) :
        po = raw_input ( )
        ans += ( po % 6 == 0 ) * 3
        ans += ( po % 6 == 5 ) * 2
        ans += ( po % 6 == 4 or po % 6 == 2 ) * 1
    print ( ans )
