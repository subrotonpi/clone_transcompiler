def main ( ) :
    import sys
    class A ( object ) :
        def __init__ ( self ) :
            self.A = A
        def __call__ ( self , * args , ** kwargs ) :
            with open ( "/proc/stations/" , "r" ) as sc :
                n = sc.read ( )
    num = str ( n )
    if num [ 1 ] != num [ 2 ] :
        print ( "No" )
        return
    mid = num [ 1 ]
    if mid == num [ 0 ] or mid == num [ 3 ] :
        print ( "Yes" )
    else :
        print ( "No" )
