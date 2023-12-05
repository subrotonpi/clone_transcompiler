def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            x = self.sc.read ( )
            if x < 1200 :
                print ( "ABC" )
            elif x >= 1200 :
                print ( "ARC" )
