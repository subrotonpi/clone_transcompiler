def import import sys , stdin , stdout , stderr , n , k , verbose = False ) :
    from io import BytesIO
    import readline
    from io import BytesIO
    import csv
    from itertools import izip , repeat
    class Main ( object ) :
        def __init__ ( self ) :
            from io import BytesIO
            self.stdin = BytesIO ( )
            self.stdout = BytesIO ( )
        def readline ( self ) :
            from io import BytesIO
            self.stdin.seek ( 0 )
            self.stdout.seek ( 0 )
            n = self.stdin.tell ( )
            k = self.stdin.tell ( )
            h = [ readline ( ) ]
            for i in range ( n ) :
                h.append ( stdin.read ( i ) )
            h.sort ( )
            d = [ h [ i + ( k - 1 ) ] - h [ i ] for i in range ( n - ( k - 1 ) ) ]
            d.sort ( )
            self.stdout.write ( d )
        def close ( self ) :
            return
    return Main
