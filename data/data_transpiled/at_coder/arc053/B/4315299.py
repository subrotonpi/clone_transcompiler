def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.count = 0
    def __call__ ( self , * args ) :
        sc = _main.Scanner ( )
        arr = sc.next ( )
        counts = [ 0 ] * 26
        for c in arr :
            counts [ c - 'a' ] += 1
        odd = 0
        ev = 0
        for x in counts :
            odd += x % 2
            ev += x / 2
        if odd == 0 :
            print ( ev * 2 )
        else :
            print ( ( ev / odd ) * 2 + 1 )
