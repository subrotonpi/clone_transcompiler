def main ( ) :
    import sys
    from itertools import repeat
    for test_no in range ( 1 , test_count + 1 ) :
        raw_pancakes = sys.stdin.read ( ).decode ( 'utf-8' )
        n = len ( raw_pancakes )
        pancakes = [ c == '+' for c in raw_pancakes ]
        k = len ( sys.stdin.read ( ) )
        answer = 0
        for i in range ( 0 , i + k <= n ) :
            if not pancakes [ i ] :
                answer += 1
                for j in range ( i , i + k ) :
                    pancakes [ j ] = not pancakes [ j ]
        sys.stdout.write ( 'Case #%d: ' % test_no )
        for i in range ( n ) :
            if not pancakes [ i ] :
                sys.stdout.write ( 'IMPOSSIBLE' )
                continue
        sys.stdout.write ( answer )
