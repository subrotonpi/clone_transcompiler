def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        self.n = sc.n
        s = sc.next ( )
        max = 0
        x = 0
        for i in s :
            if i == 'I' :
                x += 1
                max = max + x
            else :
                x -= 1
                max = max + x
        print ( max )
