def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = [ sc.randint ( 0 , 3 ) for i in range ( 3 ) ]
        max = 0
        sum = 0
        for i in range ( 3 ) :
            max = max ( max , a [ i ] )
            sum += a [ i ]
        print ( sum - max )
