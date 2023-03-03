def _import ( ) :
    from math import sin , cos
    from math import cos , sin
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            a , b = sc.readline ( ).split ( )
            comp = sin ( a )
            if comp < 0 :
                print ( "LESS" )
            elif comp == 0 :
                print ( "EQUAL" )
            else :
                print ( "GREATER" )
    return Main
