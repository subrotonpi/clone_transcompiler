def main ( ) :
    import sys
    from math import sqrt
    scn = sys.stdin
    N = len ( scn )
    ans = 1
    for i in range ( N ) :
        ans = solve ( ans , scn )
    print ( ans )
    def solve ( a , b ) :
        A , B = max ( a , b ) , min ( a , b )
        while A % B != 0 :
            buf = A % B
            A , B = B , buf
        return a / B * b
    return solve ( a , b )
