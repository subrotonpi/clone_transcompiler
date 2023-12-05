def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.scn = sys.stdin
            name = self.scn.readline ( )
            name = name [ 0 ].upper ( ) + name [ 1 : ].lower ( )
            print ( name )
