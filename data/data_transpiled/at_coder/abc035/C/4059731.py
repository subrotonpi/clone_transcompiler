def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( sys.stdin.readline ( ) )
        self.q = int ( sys.stdin.readline ( ) )
        arr = [ 0 ] * n
        for i in range ( self.q ) :
            l = int ( sys.stdin.readline ( ) )
            r = int ( sys.stdin.readline ( ) )
            arr [ l - 1 ] += 1
            if r <= self.n - 1 :
                arr [ r ] -= 1
    lines = [ ]
    sum = 0
    for i in range ( self.n ) :
        sum += arr [ i ]
        lines.append ( sum % 2 )
    print ( lines )
