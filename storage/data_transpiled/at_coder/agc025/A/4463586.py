def _import ( ) :
    from itertools import count
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            self.count = sc.count ( )
        def call ( self ) :
            n = sc.readline ( ).split ( '' )
            sum = sum ( [ int ( i ) for i in n ] )
            print ( sum == 1 and 10 or sum )
