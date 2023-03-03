def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.reader = sys.stdin
            A = self.reader.read ( )
            B = self.reader.read ( )
            ans = min ( A - B , B - 1 )
            print ( ans )
            self.reader.close ( )
    return Main ( )
