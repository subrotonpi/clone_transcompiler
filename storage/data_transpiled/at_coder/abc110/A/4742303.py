def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = ( sc.randint ( 1 , 10 ) , sc.randint ( 1 , 10 ) , sc.randint ( 1 , 10 ) )
        a = [ int ( i ) for i in a ]
        print ( a [ 2 ] * 10 + a [ 1 ] + a [ 0 ] )
