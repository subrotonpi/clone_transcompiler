def import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        a = sc.randint ( 0 , 100 )
        b = sc.randint ( 0 , 100 )
        c = sc.randint ( 0 , 100 )
        max = max ( a , max ( b , c ) )
        print ( a + b + c - max )
