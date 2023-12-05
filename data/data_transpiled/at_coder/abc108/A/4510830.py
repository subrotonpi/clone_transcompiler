def _import ( ) :
    import sys
    import string
    import itertools
    class Main ( object ) :
        def process ( K ) :
            import sum
            sum = sum ( ( ( K - i ) + 1 ) // 2 for i in range ( K + 1 ) )
            return str ( sum )
        def main ( ) :
            sc = sys.stdin
            K = sc.__next__ ( )
            result = process ( K )
            print ( result )
    return Main
