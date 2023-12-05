def main ( ) :
    import sys
    from itertools import chain
    sc = sys.stdin
    n = sum ( 1 for i in range ( n ) )
    rev = [ i for i in range ( n + 1 ) if i > 0 ]
    ts = chain ( [ - 1 , n ] , [ n ] )
    ans = 0
    for i in range ( 1 , n + 1 ) :
        ridx = rev [ i ]
        ts.append ( ridx )
        l = ridx - ts.lower ( ridx )
        r = ts.higher ( ridx ) - ridx
        ans += long ( l ) * r ** i
    print ( ans )
