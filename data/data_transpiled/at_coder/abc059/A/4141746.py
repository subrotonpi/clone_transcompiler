def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        ar = [ ]
        for i in sc.range ( 3 ) :
            ar.append ( i )
        ans = ""
        for i in ar :
            ans += i [ 0 ]
        print ( ans.upper ( ) )
