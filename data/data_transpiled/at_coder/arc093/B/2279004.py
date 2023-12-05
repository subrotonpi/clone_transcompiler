def main ( ) :
    import sys
    class GridComponents ( object ) :
        def __init__ ( self ) :
            self.grid_components = [ ]
        def grid_components ( self ) :
            with open ( "grid.txt" , "r" ) as sc :
                A = sc.read ( )
                B = sc.read ( )
                hw = [ [ True for i in range ( 100 ) ] for j in range ( 100 ) ]
                for i in range ( A - 1 ) :
                    x = i / 50 * 2
                    y = i % 50 * 2
                    hw [ x ] [ y ] = False
                for i in range ( B - 1 ) :
                    x = i / 50 * 2 + 51
                    y = i % 50 * 2
                    hw [ x ] [ y ] = True
                print ( "100 100" )
                for i in range ( 100 ) :
                    for j in range ( 100 ) :
                        print ( '#' if hw [ i ] [ j ] else '.' , end = '' )
                    print ( )
