def main ( args ) :
    from math import log
    from os.path import join
    from os import sep
    sc = open ( join ( args [ 1 : ] , sep ) )
    N = int ( sc.read ( ) )
    S = sc.read ( )
    cnt = [ 1 ] * 26
    cnt [ 0 ] = 1
    for i in range ( N ) :
        cnt [ S [ i ] - 97 ] += 1
    ans = 1
    for i in range ( 26 ) :
        ans = ( ans * cnt [ i ] ) % 1000000007
    print ( ans - 1 )
