def _import ( ) :
    from math import gcd
    if not b :
        return a
    else :
        return gcd ( b , a % b )
    def main ( ) :
        sc = sys.stdin
        n = sc.readline ( ).strip ( )
        answer = gcd ( sc.readline ( ) , sc.readline ( ).strip ( ) )
        for i in range ( 2 , n ) :
            answer = gcd ( answer , sc.readline ( ).strip ( ) )
        print ( answer )
    return main
