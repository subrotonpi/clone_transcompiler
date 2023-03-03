def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N , sum = sc.readline ( ).rstrip ( ) , 0
        r = sys.stdin.read ( N + 1 ).rstrip ( )
        sc.close ( )
        for i in range ( N ) :
            if r [ i ] == 'F' :
                continue
            sum += 'E' - r [ i ]
        print ( float ( sum ) / N )
