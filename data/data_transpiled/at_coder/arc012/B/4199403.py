def import _decimal
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        va = sc.readline ( ).strip ( )
        vb = sc.readline ( ).strip ( )
        data = sc.readline ( ).strip ( )
        for i in range ( n ) :
            t = data / va
            data = vb * t
        print ( _decimal ( data ).toPlainString ( ) )
