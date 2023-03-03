def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            self.N = len ( sys.argv )
    N = sys.argv [ 1 ]
    A = [ ]
    for i in range ( N ) :
        A.append ( sc.choice ( A ) )
    start = 0
    ans = 0
    while start < N :
        if start == N - 1 :
            ans += 1
            break
        end = start + 1
        while end < N and A [ end ] == A [ end - 1 ] :
            end += 1
        if end == N :
            ans += 1
            break
        if A [ end ] > A [ start ] :
            while end < N and A [ end ] >= A [ end - 1 ] :
                end += 1
            ans += 1
        else :
            while end < N and A [ end ] <= A [ end - 1 ] :
                end += 1
            ans += 1
        start = end
    print ( ans )
