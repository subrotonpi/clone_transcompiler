def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( ).split ( '' , 4 )
        a = int ( s [ 0 ] )
        b = int ( s [ 1 ] )
        c = int ( s [ 2 ] )
        d = int ( s [ 3 ] )
        if a + b + c + d == 7 :
            print ( "%d+%d+%d+%d=7" % ( a , b , c , d ) )
        elif a + b + c - d == 7 :
            print ( "%d+%d+%d+%d=7" % ( a , b , c , d ) )
        elif a + b - c + d == 7 :
            print ( "%d+%d+%d+%d=7" % ( a , b , c , d ) )
        elif a + b - c - d == 7 :
            print ( "%d+%d+%d+%d=7" % ( a , b , c , d ) )
        elif a - b + c - d == 7 :
            print ( "%d+%d+%d+%d=7" % ( a , b , c , d ) )
        elif a - b + c - d == 7 :
            print ( "%d+%d+%d+%d=7" % ( a , b , c , d ) )
        elif a - b + c - d == 7 :
            print ( "%d+%d+%d+%d=7" % ( a , b , c , d ) )
        elif a - b + c - d == 7 :
            print ( "%d+%d+%d+%d=7" % ( a , b , c , d ) )
        elif a - b + c - d == 7 :
            print ( "%d+%d+%d=7" % ( a , b , c , d ) )
        else :
            print ( "%d+%d+%d+%d=7" % ( a , b , c , d ) )
