def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        data = sc.readline ( ).split ( )
        height = int ( data [ 0 ] )
        width = int ( data [ 1 ] )
        square = [ [ '' for i in range ( height + 2 ) ] for i in range ( width + 2 ) ]
        for line in sc.readlines ( ) :
            for i in range ( 1 , width + 1 ) :
                square [ i ] [ i ] [ j ] = str ( line [ i - 1 ] )
        for i in range ( 1 , height + 1 ) :
            for j in range ( 1 , width + 1 ) :
                if square [ i ] [ j ] == '#' :
                    continue
                bomb_count = 0
                if square [ i - 1 ] [ j - 1 ] == '#' :
                    bomb_count += 1
                if square [ i - 1 ] [ j ] == '#' :
                    bomb_count += 1
                if square [ i ] [ j - 1 ] == '#' :
                    bomb_count += 1
                if square [ i ] [ j + 1 ] == '#' :
                    bomb_count += 1
                if square [ i ] [ j + 1 ] == '#' :
                    bomb_count += 1
                if square [ i ] [ j ] == '#' :
                    bomb_count += 1
                if square [ i ] [ j + 1 ] == '#' :
                    bomb_count += 1
                if square [ i ] [ j ] == '#' :
                    bomb_count += 1
                if square [ i ] [ j + 1 ] == '#' :
                    bomb_count += 1
                if square [ i ] [ j ] == '#' :
                    bomb_count += 1
                if square [ i ] [ j + 1 ] == '#' :
                    bomb_count += 1
                square [ i ] [ j ] = str ( bomb_count )
        for i in range ( 1 , height + 1 ) :
            for j in range ( 1 , width + 1 ) :
                print ( square [ i ] , end = '' )
