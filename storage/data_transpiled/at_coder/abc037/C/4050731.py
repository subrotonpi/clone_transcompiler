def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = int ( self.n )
        self.k = int ( self.k )
        arr = [ ]
        total = 0
        prev = 0
        for i in range ( self.n ) :
            a = sys.stdin.read ( )
            arr.append ( a )
            prev += a
            if i >= k - 1 :
                total += prev
                prev -= arr [ i - ( k - 1 ) ]
        sys.stdout.write ( '{}\n'.format ( total ) )
