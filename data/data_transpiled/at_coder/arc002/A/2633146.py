def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.raw_input = raw_input
        def __next__ ( self ) :
            return
    y = Main ( )
    if y % 400 == 0 :
        print ( "YES" )
    elif y % 100 == 0 :
        print ( "NO" )
    elif y % 4 == 0 :
        print ( "YES" )
    else :
        print ( "NO" )
