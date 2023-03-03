def main ( ) :
    import sys
    class Main ( object ) :
        @ classmethod
        def setUpClass ( cls ) :
            from time import sleep
            from sys import exc_info
            H , W , h , w = exc_info ( )
            print ( ( H - h ) * ( W - w ) )
