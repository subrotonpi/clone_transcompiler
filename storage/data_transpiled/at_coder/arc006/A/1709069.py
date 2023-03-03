def import import sys
from itertools import chain
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        E = set ( range ( 6 ) )
        B = sc.__next__ ( )
        L = set ( range ( 6 ) )
        L -= E
        diff = len ( L )
        if diff == 0 :
            print ( 1 )
        elif diff == 1 :
            if B in L :
                print ( 2 )
            else :
                print ( 3 )
        elif diff == 2 :
            print ( 4 )
        elif diff == 3 :
            print ( 5 )
        else :
            print ( 0 )
