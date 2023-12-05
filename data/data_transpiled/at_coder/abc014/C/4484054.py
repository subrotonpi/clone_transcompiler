def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
    paints = [ 0 ] * 1000001
    max = 0
    nmax = 0
    nmin = 1000000
    for i in range ( N ) :
        a = sys.stdin.read ( )
        b = sys.stdin.read ( )
        paints [ a ] += 1
        if b + 1 < 1000001 :
            paints [ b + 1 ] -= 1
        if a < nmin :
            nmin = a
        if b > nmax :
            nmax = b
    count = 0
    for i in range ( nmin , nmax + 1 ) :
        count += paints [ i ]
        if count > max :
            max = count
    print ( max )
