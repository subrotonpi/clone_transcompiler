def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
            a = sys.stdin.read ( ).decode ( 'utf-8' )
            a = [ x.decode ( 'utf-8' ) for x in a ]
            if ( unicode ( a ) == 'abc' ) :
                print ( 'Yes' )
            else :
                print ( 'No' )
