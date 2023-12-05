def import import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        a = sc.randint ( 0 , 10 )
        b = sc.randint ( 0 , 10 )
        c = abs ( a - b )
        print ( ( c > 5 ) * 10 - c )
