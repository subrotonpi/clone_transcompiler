def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sys = sys
            self.sys.exit ( )
    ab = sys.stdin.read ( )
    sys.stdin.close ( )
    splited = ab.split ( )
    swaped = splited [ 1 ] + ' ' + splited [ 0 ]
    print ( swaped )
