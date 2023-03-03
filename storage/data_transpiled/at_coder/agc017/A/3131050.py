def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.n = int ( self.n )
            self.P = int ( self.P )
    A = [ int ( i ) for i in sys.argv [ 1 : ] ]
    odd = [ 0 ]
    even = [ 0 ]
    odd.append ( A [ 0 ] % 2 == 1 )
    even.append ( A [ 0 ] % 2 == 1 )
    for i in range ( 1 , n ) :
        odd [ i ] , even [ i ] = odd [ i - 1 ] , even [ i - 1 ]
        if A [ i ] % 2 == 1 :
            even [ i ] += odd [ i - 1 ]
            odd [ i ] += even [ i - 1 ] + 1
        else :
            even [ i ] += even [ i - 1 ] + 1
            odd [ i ] += odd [ i - 1 ]
    ans = odd [ n - 1 ] if P == 1 else even [ n - 1 ] + 1
    print ( ans )
