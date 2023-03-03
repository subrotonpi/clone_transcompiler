def import sys
class Main ( object ) :
    def __init__ ( self , n ) :
        self.n = n
        self.str = sys.stdin.read ( )
    c = [ 0 ] * 5
    for i in range ( n ) :
        tmp = int ( self.str [ i ] )
        if tmp == 1 :
            c [ 1 ] += 1
        elif tmp == 2 :
            c [ 2 ] += 1
        elif tmp == 3 :
            c [ 3 ] += 1
        elif tmp == 4 :
            c [ 4 ] += 1
    max = c [ 1 ]
    min = c [ 1 ]
    for i in range ( 2 , 5 ) :
        max = max ( max , c [ i ] )
        min = min ( min , c [ i ] )
    pl.write ( "%d %d\n" % ( max , min ) )
def pr ( x ) :
    sys.stdout.write ( x )
def pl ( x ) :
    print ( x )
