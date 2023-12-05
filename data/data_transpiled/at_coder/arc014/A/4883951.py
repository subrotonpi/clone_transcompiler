def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.name = args [ 0 ]
        def __repr__ ( self ) :
            return "Blue"
        def __call__ ( self ) :
            return "Red"
    if int ( sys.argv [ 1 ] ) % 2 == 0 :
        print ( "Blue" )
    else :
        print ( "Red" )
