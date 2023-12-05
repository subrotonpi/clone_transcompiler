def main ( ) :
    import sys
    from sympy.core.compatibility import builtins
    with open ( 'README.txt' , 'r' ) as sc :
        logic ( sc )
    def logic ( ) :
        ans = 0
        m = sys.stdin.readline ( )
        ans = gcd ( sc.readline ( ) , sc.readline ( ) )
        for i in range ( 1 , m - 2 + 1 ) :
            ans = gcd ( ans , sc.readline ( ) )
        sys.stdout.write ( ans )
    def gcd ( a , b ) :
        if not b :
            return a
        return gcd ( b , a % b )
    return logic ( )
