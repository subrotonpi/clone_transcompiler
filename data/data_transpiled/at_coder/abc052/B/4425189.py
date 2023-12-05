def import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        n = sc.readline ( )
        po = sc.readline ( ).split ( '' , 0 )
        x , y = 0 , 0
        for i in range ( n ) :
            y += ( po [ i ] == 'I' )
            x = max ( x , y )
        print ( x )
