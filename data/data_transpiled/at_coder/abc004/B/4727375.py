def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        c = [ ]
        for i in range ( 4 ) :
            c.append ( sc.readline ( ).split ( ) [ 0 ] )
        for i in range ( 3 , - 1 , - 1 ) :
            for j in range ( 3 , - 1 , - 1 ) :
                if j == 0 :
                    print ( c [ i ] [ j ] )
                else :
                    print ( c [ i ] [ j ] , end = ' ' )
