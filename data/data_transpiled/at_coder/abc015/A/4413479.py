def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n , m = sc.readline ( ).split ( ' ' )
        if len ( n ) > len ( m ) :
            print ( n )
        else :
            print ( m )
