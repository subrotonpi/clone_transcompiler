def import import sys
import string
import string
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
        N = int ( sc.next ( ) )
        M = int ( sc.next ( ) )
        if N == 1 and M == 1 :
            print ( 1 )
        elif N == 1 :
            print ( M - 2 )
        elif M == 1 :
            print ( N - 2 )
        elif N == 2 or M == 2 :
            print ( 0 )
        else :
            print ( ( N - 2 ) * ( M - 2 ) )
