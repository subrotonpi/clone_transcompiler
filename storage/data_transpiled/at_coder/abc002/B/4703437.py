def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            s = self.sc.readline ( )
            print ( s.decode ( 'utf-8' ).replace ( 'a' , '' ).replace ( 'i' , '' ).replace ( 'u' , '' ).replace ( 'e' , '' ).replace ( 'o' , '' ) )
