def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.SUM = 2025
    def __call__ ( self , * args , ** kwargs ) :
        sc = sys.stdin
        n = sc.read ( )
        ans = self.SUM - n
        lines = [ ]
        for i in range ( 1 , 9 ) :
            for j in range ( 1 , 9 ) :
                if i * j == ans :
                    lines.append ( "%d x %d\n" % ( i , j ) )
        sys.stdout.write ( "".join ( lines ) )
