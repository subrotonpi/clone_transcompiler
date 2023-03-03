def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = self.n
            self.x = self.x
            self.y = self.y
            self.a = [ ]
        def doit ( self ) :
            return self.a
    n = int ( sys.argv [ 1 ] )
    x = int ( sys.argv [ 2 ] )
    y = int ( sys.argv [ 3 ] )
    a = [ x ]
    max = abs ( a [ n - 1 ] - y )
    if n != 1 :
        max = max ( max , abs ( a [ n - 1 ] - a [ n - 2 ] ) )
    print ( max )
