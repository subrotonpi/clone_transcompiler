def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.reader = sys.stdin
            N = self.reader.read ( )
            ans = N // 3
            sys.stdout.write ( ans )
    return Main ( )
