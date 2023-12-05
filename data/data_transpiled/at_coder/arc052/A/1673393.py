def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.s = sys.stdin.read ( )
            self.ret = int ( self.s.decode ( 'utf-8' ) )
            print ( self.ret )
    return Main
