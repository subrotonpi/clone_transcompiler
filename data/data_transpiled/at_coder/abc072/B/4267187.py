def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.str = sys.stdin.read ( )
            for i , char in enumerate ( self.str ) :
                if i % 2 == 0 :
                    print ( char , end = ' ' )
            print ( )
