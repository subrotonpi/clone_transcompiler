def main ( args ) :
    import sys
    from itertools import islice
    sc = sys.stdin
    n = sc.read ( )
    seen = sorted ( islice ( sc , n ) )
    N = seen.last ( )
    if N / 2 in seen :
        sys.stdout.write ( '%d %d\n' % ( N , N / 2 ) )
        return
    rl = seen.lower ( N / 2 )
    rr = seen.higher ( N / 2 )
    R = rl if rl >= N - rr else rr
    sys.stdout.write ( '%d %d\n' % ( N , R ) )
