def _import ( ) :
    import sys
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            a = sc.randint ( 0 , 100 )
            b = sc.randint ( 0 , 100 )
            k = sc.randint ( 0 , 100 )
            self.sorted = sorted ( [ i for i in range ( a , min ( b , a + k - 1 ) + 1 ) if i <= b ] )
            for i in range ( b , max ( a , b - k + 1 ) - 1 ) :
                self.sorted.append ( i )
    return Main
