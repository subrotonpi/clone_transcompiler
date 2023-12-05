def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        str = sc.readline ( )
        while str != "" :
            tmp = len ( str )
            str = str.replace ( str [ 0 ] + "" , "" )
            if len ( str ) - tmp != 1 :
                print ( "no" )
                sys.exit ( )
        print ( "yes" )
