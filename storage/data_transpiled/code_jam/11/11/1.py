def main ( arg ) :
    import sys
    from math import gcd
    with open ( sys.argv [ 1 ] ) as sc :
        T = int ( sc.readline ( ) )
        for ii in range ( 1 , T + 1 ) :
            N , PD , PG = sc.readline ( ).split ( )
            broken = ( PG == 100 and PD < 100 )
            broken |= ( PG == 0 and PD > 0 )
            K = ( PD , gcd ( PD , 100 ) )
            broken |= ( N < 100 / K )
            print ( "Case #%d: %s\n" % ( ii , "Broken" if broken else "Possible" ) )
    def gcd ( a , b ) :
        while b != 0 :
            tmp = b
            b = a % b
            a = tmp
        return a
    return gcd
