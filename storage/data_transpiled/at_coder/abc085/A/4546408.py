def import import _main
class Main ( object ) :
    def __init__ ( self ) :
        sc = _main ( )
        s = sc.read ( )
        print ( s.replace ( '2017/01/' , '2018/01/' ) )
