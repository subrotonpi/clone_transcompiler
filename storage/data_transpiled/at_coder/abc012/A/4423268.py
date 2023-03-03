def import import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        s = sc.readline ( )
        t = sc.readline ( )
        temp = s
        s = t
        t = temp
        print ( s , t )
