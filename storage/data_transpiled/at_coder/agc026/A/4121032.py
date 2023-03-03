def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.dp = [ ]
    def go ( self ) :
        sc = _main.sc
        n = sc.n
        prev = - 1
        count = 0
        for a in sc.go ( ) :
            if prev == a :
                count += 1
                prev = - 1
            else :
                prev = a
        print ( count )
