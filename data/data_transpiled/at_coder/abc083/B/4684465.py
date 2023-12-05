def main ( ) :
    import sys
    import string
    import string
    import string
    import string
    import string
    import sys
    stdin = sys.stdin
    inputs = filter ( None , stdin.readline ( ).split ( ) )
    ans = 0
    for i in range ( 0 , inputs [ 0 ] ) :
        sum = reduce ( lambda x , y : x + y , str ( i ).split ( ) )
        if inputs [ 1 ] <= sum <= inputs [ 2 ] :
            ans += i
    print ( ans )
