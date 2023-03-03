def main ( args ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            self.data = sys.stdin.read ( )
            self.print ( self.data.replace ( '2017' , '2018' ) )
