def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.solve ( )
    def solve ( self ) :
        sc = sys.stdin
        n = 4
        tile = [ ]
        for i in range ( n ) :
            for j in range ( n ) :
                tile [ i ].append ( int ( sc.readline ( ) ) )
        sc.close ( )
        res = "GAMEOVER"
        for i in range ( n ) :
            t = tile [ i ] [ 0 ]
            for j in range ( 1 , n ) :
                if t == tile [ i ] [ j ] :
                    res = "CONTINUE"
                else :
                    t = tile [ i ] [ j ]
        for i in range ( n ) :
            t = tile [ 0 ] [ i ]
            for j in range ( 1 , n ) :
                if t == tile [ j ] [ i ] :
                    res = "CONTINUE"
                else :
                    t = tile [ j ] [ i ]
        print ( res )
