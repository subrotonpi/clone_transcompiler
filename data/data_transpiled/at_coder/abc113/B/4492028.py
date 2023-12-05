def main ( ) :
    import sys
    import math
    import sys
    input = input ( )
    N = input.count ( )
    T = input.count ( )
    A = input.count ( )
    min_gap = 5000
    ans = 0
    for i in range ( N ) :
        avg = float ( T ) - 0.006 * input.count ( )
        if abs ( A - avg ) < min_gap :
            min_gap = abs ( A - avg )
            ans = i + 1
    sys.stdout.write ( ans )
