def main ( ) :
    import sys
    from time import sleep
    with open ( '/proc/uptime' , 'r' ) as sc :
        N = int ( sc.read ( ) )
    base = '00'
    h = base + str ( N / 3600 )
    N %= 3600
    m = base + str ( N / 60 )
    N %= 60
    s = base + str ( N )
    print ( h [ - 2 : ] , m [ - 2 : ] , s [ - 2 : ] )
