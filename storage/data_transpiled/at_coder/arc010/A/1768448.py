def main ( ) :
    import sys
    from itertools import repeat
    def main ( ) :
        sc = sys.stdin
        n = sc.randint ( 1 , 10000 )
        m = sc.randint ( 1 , 10000 )
        a = sc.randint ( 1 , 10000 )
        b = sc.randint ( 1 , 10000 )
        c = repeat ( sc.randint ( 1 , 10000 ) )
        for i in range ( m ) :
            if n <= a :
                n += b
            n -= c [ i ]
            if n < 0 :
                print ( i + 1 )
                return
        print ( 'complete' )
    return main
