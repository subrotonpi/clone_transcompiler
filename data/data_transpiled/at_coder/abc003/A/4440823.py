def main ( args ) :
    import sys
    from numpy.testing import get_sample_file
    with open ( '../data/samples/' ) as sc :
        N = sc.read ( )
    ans = 0
    for i in range ( 1 , N + 1 ) :
        ans += ( 10000 * i ) / N
    print ( ans )
