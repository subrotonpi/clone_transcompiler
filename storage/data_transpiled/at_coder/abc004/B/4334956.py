def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        i , j = sc.readline ( ).split ( ' ' )
        c = [ sc.readline ( ) [ 0 ] for i in range ( 15 , - 1 , - 1 ) ]
        for i in range ( 1 , 16 ) :
            if i % 4 == 0 :
                print ( c [ i - 1 ] , end = ' ' )
            else :
                print ( c [ i - 1 ] , end = ' ' )
