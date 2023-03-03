def main ( ) :
    import sys
    from time import sleep
    from time import sleep
    with open ( 'meat_quantity.txt' , 'r' ) as sc :
        meat_quantity = int ( sc.read ( ) )
        meat_time = [ sleep ( int ( i ) ) for i in range ( meat_quantity ) ]
        min = 1000
        for bit in range ( pow ( 2 , meat_quantity ) ) :
            time1 = time2 = 0
            for i in range ( meat_quantity ) :
                if ( bit >> i & 1 ) == 1 :
                    time1 += meat_time [ i ]
                else :
                    time2 += meat_time [ i ]
            min = time1 if time1 > time2 else min
        print ( min )
