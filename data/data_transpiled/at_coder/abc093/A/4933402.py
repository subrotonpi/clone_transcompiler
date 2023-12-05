def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.sc = sys.stdin
        def readline ( self ) :
            return self.sc.readline ( ).strip ( )
    c = [ x.strip ( ) for x in sys.stdin.readlines ( ) ]
    c.sort ( )
    print ( ''.join ( c ) == 'abc' and 'Yes' or 'No' )
