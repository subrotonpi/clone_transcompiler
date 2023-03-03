def main ( ) :
    import sys
    MOD = 10007
    with open ( '/proc/cpuinfo' , 'r' ) as f :
        a = [ 0 ] * 1000001
        a [ 1 ] = a [ 2 ] = 0
        a [ 3 ] = 1
        n = len ( f.read ( ) )
        for i in range ( 4 , n + 1 ) :
            a [ i ] = ( a [ i - 3 ] + a [ i - 2 ] + a [ i - 1 ] ) % MOD
        print ( a [ n ] )
