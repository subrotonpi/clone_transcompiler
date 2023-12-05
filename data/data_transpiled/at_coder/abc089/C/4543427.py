def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( ).__init__ ( self )
    N = sys.stdin.read ( )
    cnt = [ 0 ] * 5
    for i in range ( N ) :
        char = sc.read ( ) [ 0 ]
        if char == 'M' : cnt [ 0 ] += 1
        if char == 'A' : cnt [ 1 ] += 1
        if char == 'R' : cnt [ 2 ] += 1
        if char == 'C' : cnt [ 3 ] += 1
        if char == 'H' : cnt [ 4 ] += 1
    sum = 0
    for i in range ( 3 ) :
        for j in range ( i + 1 , 4 ) :
            for k in range ( j + 1 , 5 ) :
                sum += cnt [ i ] * cnt [ j ] * cnt [ k ]
    print ( sum )
