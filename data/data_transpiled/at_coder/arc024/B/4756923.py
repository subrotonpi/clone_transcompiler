def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.n = sys.stdin.read ( )
    def __call__ ( self , * args ) :
        arr = [ ]
        for i in range ( n ) :
            arr.append ( args [ i ] )
    prev = - 1
    count = 0
    max = 0
    for i in range ( 2 * n ) :
        if prev == arr [ i % n ] :
            count += 1
            if max < count :
                max = count
        else :
            count = 1
        prev = arr [ i % n ]
    if max > n :
        print ( - 1 )
    else :
        print ( ( max - 1 ) / 2 + 1 )
