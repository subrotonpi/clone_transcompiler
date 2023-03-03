def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( )
        n = n [ : - 2 ]
        a = n [ 0 ]
        b = n [ - 1 ]
        print ( a , end = " " )
        print ( len ( a ) , end = " " )
        print ( b , end = " " )
