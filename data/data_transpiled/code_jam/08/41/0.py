def test_a ( case ) :
    import locale
    import sys
    class A ( object ) :
        def __init__ ( self ) :
            self.stdin = sys.stdin
            self.stdout = sys.stdout
            self.stdout = sys.stdout
            self.case = case
            n = len ( sys.stdin )
            desired = sys.stdin.randint ( 1 , n + 1 )
            self.and ( self.ans [ 0 ] == ans [ 2 * i ] + 1 )
            self.ans [ 1 ] = inf
            self.ans [ 2 * i ] = [ 0 , ans [ 2 * i ] + 1 ]
    print ( "Case #%s: %s" % ( case , ans [ 1 ] [ desired ] ) )
    def solve ( case ) :
        try :
            f = open ( "a.in" , "r" )
            out = sys.stdout
            n = len ( sys.stdin )
            for i in range ( 1 , n + 1 ) :
                self.ans [ i ] [ 0 ] = ( self.ans [ i ] [ 1 ] == ans [ 2 * i ] + 1 )
        except IOError :
            pass
        else :
            out.close ( )
    for i in range ( n // 2 + 1 , - 1 , - 1 ) :
        if self.ans [ i ] [ 1 ] == inf :
            ans [ i ] [ 1 ] = min ( ans [ i ] [ 1 ] , ans [ 2 * i ] + 1 )
            if self.ans [ i ] [ 1 ] == ans [ 2 * i ] + 1 :
                ans [ i ] [ 0 ] = inf
                ans [ i ] [ 1 ] = min ( ans [ i ] [ 0 ] , ans [ 2 * i ] + 1 )
        else :
            ans [ i ] [ 0 ] = inf
            ans [ i ] [ 1 ] = min ( ans [ i ] [ 0 ] , ans [ 2 * i ] + 1 )
