def test_main ( ) :
    import sys
    from sympy.stats import Normal , Die , Exponential , pspace , rand
    class Main ( object ) :
        def __init__ ( self ) :
            super ( Main , self ).__init__ ( )
            with self.open ( 'r' ) as f :
                r = randint ( 0 , len ( f.readlines ( ) ) )
        def createValue ( self ) :
            return rand ( self )
    r = randint ( 0 , len ( f.readlines ( ) ) )
    c = randint ( 0 , len ( f.readlines ( ) ) )
    k = randint ( 0 , len ( f.readlines ( ) ) )
    n = randint ( 0 , len ( f.readlines ( ) ) )
    a = [ 0 ] * n
    b = [ 0 ] * n
    h = { }
    w = { }
    for i in range ( n ) :
        a [ i ] = randint ( 0 , len ( f.readlines ( ) ) )
        b [ i ] = randint ( 0 , len ( f.readlines ( ) ) )
        h [ a [ i ] - 1 ] += 1
        w [ b [ i ] - 1 ] += 1
    hn = { }
    wn = { }
    for i in range ( c ) :
        hn [ w [ i ] ] += 1
    for i in range ( r ) :
        wn [ h [ i ] ] += 1
    count = 0
    for i in range ( k ) :
        count += long ( hn [ i ] * wn [ k - i ] )
    for i in range ( n ) :
        sum = h [ a [ i ] - 1 ] + w [ b [ i ] - 1 ]
        if sum == k :
            count -= 1
        if sum == k + 1 :
            count += 1
    print ( count )
