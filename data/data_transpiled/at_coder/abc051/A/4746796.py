def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            s1 = self.sc.readline ( )
            s2 = s1.replace ( ',' , ' ' )
            print ( s2 )
    return Main
