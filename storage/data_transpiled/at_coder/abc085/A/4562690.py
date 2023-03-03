def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            s = self.sc.readline ( )
            s = s.replace ( '2017' , '2018' )
            print ( s )
    return Main
