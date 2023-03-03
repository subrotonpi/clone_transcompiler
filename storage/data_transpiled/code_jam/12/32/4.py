def round1c ( ) :
    import locale
    import math
    import random
    import time
    import random
    import sys
    class B ( object ) :
        def __init__ ( self ) :
            locale.setlocale ( locale.LC_ALL , '' )
            with open ( 'test.txt' , 'r' ) as sc :
                t = random.randint ( 1 , 100 )
                for i in range ( t ) :
                    d = random.randint ( 1 , 100 )
                    n = random.randint ( 1 , 100 )
                    a = random.randint ( 1 , 100 )
                    times = [ random.randint ( 0 , 100 ) for _ in range ( n ) ]
                    positions = [ random.randint ( 0 , 100 ) for _ in range ( n ) ]
                    print ( 'Case #{}:'.format ( i + 1 ) )
                    for _ in range ( a ) :
                        acc = random.randint ( 0 , 100 )
                        other_time = 0 if n == 1 else ( d - positions [ 0 ] ) / ( positions [ 1 ] - positions [ 0 ] ) * ( times [ 1 ] - times [ 0 ] ) + times [ 0 ]
                        my_time = math.sqrt ( d * 2 / acc )
                        print ( '{}'.format ( max ( other_time , my_time ) ) )
    B.__init__ ( )
