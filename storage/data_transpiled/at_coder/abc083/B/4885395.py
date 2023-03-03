def main ( ) :
    import sys
    class Main ( object ) :
        def __init__ ( self ) :
            sc = sys.stdin
            N = int ( sc.readline ( ) )
            A = int ( sc.readline ( ) )
            B = int ( sc.readline ( ) )
    ans = 0
    for i in range ( 1 , N + 1 ) :
        n = i
        sum = 0
        while n > 0 :
            sum += n % 10
            n /= 10
        if sum >= A and sum <= B :
            ans += i
    print ( ans )
