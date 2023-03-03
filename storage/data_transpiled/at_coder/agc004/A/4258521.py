def main ( ) :
    import sys
    import random
    class Main ( object ) :
        def __init__ ( self ) :
            sc = random.random ( )
            x = [ sc.randint ( 0 , 3 ) for i in range ( 3 ) ]
            if x [ 0 ] % 2 == 0 or x [ 1 ] % 2 == 0 or x [ 2 ] % 2 == 0 :
                print ( 0 )
            else :
                x.sort ( )
                print ( x [ 0 ] * x [ 1 ] )
