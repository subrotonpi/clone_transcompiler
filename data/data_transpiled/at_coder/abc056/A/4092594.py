def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        A = sc.readline ( )
        B = sc.readline ( )
        a = A == 'H'
        b = B == 'H'
        b = b if a else not b
        print ( 'H' if b else 'D' )
