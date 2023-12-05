def import import sys
class Main ( object ) :
    def __init__ ( self , * args ) :
        sc = sys.stdin
        s = sc.readline ( )
        k = sc.readline ( )
        work = - 1
        for i in range ( len ( s ) ) and s [ i ].isdigit ( ) :
            work = int ( s [ i ] )
            if work != 1 :
                break
        sys.stdout.write ( work )
