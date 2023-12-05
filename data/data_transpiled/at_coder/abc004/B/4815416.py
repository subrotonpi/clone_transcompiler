def import sys
class Main ( object ) :
    def __init__ ( self ) :
        with open ( 'main.txt' ) as sc :
            table = [ ]
            for line in sc.readlines ( ) :
                table.append ( line.split ( ) , 0 )
            for i in range ( 3 , - 1 , - 1 ) :
                print ( table [ i ] [ 3 ] , table [ i ] [ 2 ] , table [ i ] [ 1 ] , table [ i ] [ 0 ] )
