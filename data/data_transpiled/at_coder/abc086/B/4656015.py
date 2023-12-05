def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.readline ( )
        b = sc.readline ( )
        ab = a + b
        num = int ( ab )
        for i in range ( 1 , 1000 ) :
            if i * i == num :
                print ( "Yes" )
                return
        print ( "No" )
