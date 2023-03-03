def import import _sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = 0
    def __call__ ( self ) :
        return _sys.stdin.read ( )
    def main ( ) :
        n = int ( n )
        h = 0
        for i in range ( n , 2 , - 1 ) :
            h += 1
        turn = 1
        x = 1
        while x <= n :
            if turn % 2 == 0 :
                turn += 1
                x = 2 * x if h % 2 == 0 else 2 * x + 1
            else :
                turn += 1
                x = 2 * x if h % 2 == 0 else 2 * x + 1
        if turn % 2 == 0 :
            print ( "Aoki" )
        else :
            print ( "Takahashi" )
