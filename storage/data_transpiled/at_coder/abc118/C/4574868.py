def main ( ) :
    import sys
    from math import gcd
    with open ( sys.argv [ 1 ] , 'r' ) as sc :
        N = int ( sc.readline ( ) )
        i = [ int ( i ) for i in sc.readlines ( ) ]
        ans = gcd ( i [ 0 ] , i [ 1 ] )
        for i in i [ 2 : ] :
            ans = gcd ( ans , i [ i ] )
        print ( ans )
    def gcd ( a , b ) :
        if b == 0 : return a
        return gcd ( b , a % b )
    return gcd ( a , gcd ( b , a ) )
