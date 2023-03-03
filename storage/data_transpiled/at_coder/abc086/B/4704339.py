def main ( ) :
    import math
    from math import floor , sqrt
    stdin = sys.stdin
    n = int ( stdin.readline ( ).rstrip ( ) )
    r = int ( floor ( sqrt ( n ) ) )
    ans = 'Yes' if n == r ** 2 else 'No'
    print ( ans )
