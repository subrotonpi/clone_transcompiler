def _import ( ) :
    import string
    import sys
    import sys
    class Main ( object ) :
        def repeat ( c , n ) :
            ans = ''
            for i in range ( n ) :
                ans = ans + c
            return ans
        def count_char ( s ) :
            ans = [ 0 ] * 26
            for c in s :
                ans [ c - 'a' ] += 1
            return ans
        def main ( ) :
            with open ( 'input.txt' , 'r' ) as sc :
                N = sc.read ( )
            count = [ 100 ] * 26
            for n in range ( N ) :
                s = sc.read ( )
                a = count_char ( s )
                for i in range ( 26 ) :
                    count [ i ] = min ( count [ i ] , a [ i ] )
            for i in range ( 26 ) :
                c = chr ( ord ( 'a' ) + i )
                sys.stdout.write ( repeat ( c , count [ i ] ) )
            sys.stdout.write ( '\n' )
    return Main
