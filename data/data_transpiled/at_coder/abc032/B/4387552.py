def import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        dict = { }
        po = sc.readline ( )
        n = sc.count ( )
        for i in range ( len ( po ) - n + 1 ) :
            dict [ po [ i : i + n ] ] = 0
        print ( len ( dict ) )
