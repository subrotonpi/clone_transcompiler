def main ( args ) :
    import re
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            s = self.sc.readline ( )
            print ( re.sub ( r'[aiueo]' , '' , s ) )
    return Main
