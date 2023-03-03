def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.randint ( 0 , 1 )
        b = sc.randint ( 0 , 1 )
        print ( "Yay!" if ( a <= 8 and b <= 8 ) else ":(" )
