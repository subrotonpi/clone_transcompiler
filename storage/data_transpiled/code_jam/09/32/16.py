def test_p ( x ) :
    import math
    import os
    import math
    class P2 ( object ) :
        def p ( self ) :
            a = ""
            a = a + str ( int ( math.floor ( x + 0.0000001 ) ) ) + "."
            for i in range ( 8 ) :
                x = x * 10 - math.floor ( x ) * 10
                a += str ( int ( math.floor ( x ) ) )
            return a
        def main ( args ) :
            with open ( "B-large.in" , "r" ) as s :
                cnt = s.readlines ( )
                for cases in range ( cnt ) :
                    n = s.readlines ( )
                    x , y , z = 0 , 0 , 0
                    vx , vy , vz = 0 , 0 , 0 , 0
                    for a , b , c in itertools.product ( [ x , y , z , vx , vy , vz ] , [ x , y , z , z , vx , vy , vz ] , [ x , y , z , z , a , b , c ] , [ x , y , z , c , a , b , c ] , [ x , y , z , c , a , b , c ] , [ x , y , z , c , a , b , c ] , [ x , y , z , c , a , b , c ] , [ x , y , z , c , a , b , c ] , [ x , y , z , c , a , b , c ] , [ x , y , z , c , a , b , c ] , [ x , y , z , c , a , b , c ] , [ x , y , z , c , a , b , c ] , [ x , y , z , c , a , b , c ] , [ x , y , z , c , a , b , c ] , [ x , y , z , c , a , b , c ] , [ x , y , z , c , a , b , c ] , [ x , y , z , c , a , b , c ] , [ x , y , z , c , a , b , c ] , [ x , y , z , c , a , b , c ] , [ x , y , z