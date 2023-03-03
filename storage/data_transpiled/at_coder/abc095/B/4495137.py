def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.N = sys.stdin.read ( )
        self.X = sys.stdin.read ( )
    def __call__ ( self , X ) :
        m = [ ]
        sum = 0
        for i in range ( N ) :
            m.append ( sys.stdin.read ( ) )
        for i in range ( N ) :
            sum = sum + m [ i ]
        min = m [ 0 ]
        for i in range ( N ) :
            if min > m [ i ] :
                min = m [ i ]
        rest = X - sum
        counter = self.N
        while rest >= min :
            rest = rest - min
            counter += 1
        sys.stdout.write ( counter )
