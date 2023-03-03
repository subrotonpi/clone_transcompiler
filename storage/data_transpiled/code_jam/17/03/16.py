def main2 ( t , N , K ) :
    import sys
    import time
    import sys
    class Main ( ) :
        def __init__ ( self , t , N , K ) :
            for step in range ( 0 , N ) :
                groups = ( 1l << step )
                if K > groups :
                    K -= groups
                    continue
                small = N // groups
                big = small + 1
                bigcnt = N % groups
                smallcnt = groups - bigcnt
                x = big
                if K > bigcnt :
                    x = small
                print ( "Case #%d: %d %d\n" % ( t , ( x + 1 ) // 2 - 1 , x // 2 - 1 ) )
                return
    def main ( args ) :
        with open ( "input.txt" , "r" ) as f :
            T = f.read ( )
            for t , N , K in zip ( T , N ) :
                ( Main ( ) , t + 1 , N + 1 , K ) = f.read ( )
