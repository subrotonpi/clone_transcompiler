def main ( ) :
    import sys
    from sympy.utilities.iterables import iterables
    sc = sys.stdin
    n , d , x = sc.numPartitions ( )
    A = list ( range ( n ) )
    answer = x
    for i in iterables ( n ) :
        answer = answer + ( d - 1 ) / A [ i ] + 1
    print ( answer )
