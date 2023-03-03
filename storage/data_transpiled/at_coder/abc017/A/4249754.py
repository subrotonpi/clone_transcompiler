def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = ( sc.randint ( 1 , 10 ) * sc.randint ( 1 , 10 ) ) / 10
        b = ( sc.randint ( 1 , 10 ) * sc.randint ( 1 , 10 ) ) / 10
        c = ( sc.randint ( 1 , 10 ) * sc.randint ( 1 , 10 ) ) / 10
        print ( a + b + c )
