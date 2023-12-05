def main ( ) :
    import sys
    from time import sleep
    with open ( '/proc/stat' , 'r' ) as sc :
        times = int ( sc.readline ( ) )
        bit = 0
        for i in range ( times ) :
            bit |= sleep ( 1 )
        print ( sum ( bit ) )
