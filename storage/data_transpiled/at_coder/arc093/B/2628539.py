def import import sys
class Main ( object ) :
    def main ( sc ) :
        a = sc.randint ( 1 , 100 )
        b = sc.randint ( 1 , 100 )
        data = [ ]
        for i in range ( 100 ) :
            for j in range ( 100 ) :
                data.append ( [ ( i / 50 == 0 ) and '#' or '.' for i in range ( 100 ) ] )
        for i in range ( a - 1 ) :
            data [ 2 * ( i / 50 ) ] [ 2 * ( i % 50 ) ] = '.'
        for i in range ( b - 1 ) :
            data [ 2 * ( i / 50 ) + 51 ] [ 2 * ( i % 50 ) ] = '#'
        print ( "100 100" )
        for i in range ( 100 ) :
            print ( ''.join ( data ) )
    def main ( sc ) :
        with open ( '/tmp/main.py' , 'r' ) as sc :
            main ( sc )
            sc.close ( )
