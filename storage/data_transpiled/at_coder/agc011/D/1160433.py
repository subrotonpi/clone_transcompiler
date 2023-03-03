def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( )
        k = sc.readline ( )
        s = sc.readline ( )
        ss = s.split ( ' ' )
        a = [ ]
        for i in range ( n ) :
            if ss [ i ] == 'A' :
                a.append ( True )
        flip = False
        index = 0
        for i in range ( min ( k , 2 * n + k % 2 ) ) :
            if a [ index ] ^ flip :
                a [ index ] = not a [ index ]
            else :
                flip = not flip
                index = ( index + 1 ) % n
        for i in range ( n ) :
            if a [ ( index + i ) % n ] ^ flip :
                print ( 'A' , end = ' ' )
            else :
                print ( 'B' , end = ' ' )
