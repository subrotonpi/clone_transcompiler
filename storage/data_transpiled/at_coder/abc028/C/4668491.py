def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        nums = [ sc.randint ( 0 , 5 ) for i in range ( 5 ) ]
        sums = [ 0 for i in range ( 10 ) ]
        length = 0
        for i in range ( 3 ) :
            for j in range ( i + 1 , 4 ) :
                for k in range ( j + 1 , 5 ) :
                    sums [ length ] = nums [ i ] + nums [ j ] + nums [ k ]
                    length += 1
        sums = sums [ length ]
        count = 0
        tmp = 0
        for i in range ( 10 , 0 , - 1 ) :
            count += 1
            if tmp == sums [ i - 1 ] :
                count -= 1
            if count == 3 :
                print ( sums [ i - 1 ] )
                return
