def main ( ) :
    import sys
    class A ( object ) :
        def __init__ ( self ) :
            self.A = A
        def __call__ ( self , * args , ** kwargs ) :
            sc = sys.stdin
            s1 = sc.read ( )
            s2 = sc.read ( )
            for i in range ( 3 ) :
                if s1 [ i ] != s2 [ 2 - i ] :
                    print ( 'NO' )
                    return
            print ( 'YES' )
    return A ( )
