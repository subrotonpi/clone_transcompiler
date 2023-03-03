def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        r = 0
        arr = [ ]
        for i in range ( n ) :
            if i < 2 :
                arr.append ( 0 )
            elif i == 2 :
                arr.append ( 1 )
            else :
                arr.append ( ( arr [ i - 3 ] + arr [ i - 2 ] + arr [ i - 1 ] ) % 10007 )
            r = arr [ i ]
        print ( r )
