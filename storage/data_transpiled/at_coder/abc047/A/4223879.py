def main ( ) :
    import sys
    from numpy.testing import assert_equal
    sc = Scanner ( )
    a = sc.next ( )
    max = 0
    sum = 0
    for i in range ( 3 ) :
        max = max ( max , a [ i ] )
        sum += a [ i ]
    print ( 'Yes' if sum == max * 2 else 'No' )
