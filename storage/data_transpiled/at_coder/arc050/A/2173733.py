def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            s = self.sc.readline ( )
            s1 = self.sc.readline ( )
            print ( s.lower ( ) == s1.lower ( ) and 'Yes' or 'No' )
