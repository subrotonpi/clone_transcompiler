def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        with open ( '/proc/self/status' ) as sc :
            line = sc.read ( ).split ( )
        r = int ( line [ 0 ] ) * 100
        g = int ( line [ 1 ] ) * 10
        b = int ( line [ 2 ] )
        result = r + g + b
        if result % 4 == 0 :
            print ( 'YES' )
            return
        print ( 'NO' )
