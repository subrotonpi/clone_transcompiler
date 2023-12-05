def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = len ( sys.argv )
        def __getitem__ ( self , key ) :
            return self.N
        def __getitem__ ( self , key ) :
            return self.N
        def __getitem__ ( self , key ) :
            return self.N
    arr = [ ]
    gaps = [ ]
    for i in range ( N ) :
        arr.append ( reader.read ( ) )
        if i > 0 :
            r = abs ( arr [ i ] - arr [ i - 1 ] ) + gaps [ i - 1 ]
            if i > 1 :
                r = min ( r , abs ( arr [ i ] - arr [ i - 2 ] ) + gaps [ i - 2 ] )
            gaps.append ( r )
    print ( gaps [ N - 1 ] )
    del gaps [ N - 1 ]
