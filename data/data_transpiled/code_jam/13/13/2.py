def test_C ( ) :
    from sympy import symbols
    from sympy.printing.latex import LatexPrinter
    f = Function ( 'c' )
    T = symbols ( 'T' )
    for t in range ( 1 , T + 1 ) :
        R , N , M , K = map ( Symbol , ' R , N , M , K )
        hm = { }
        for a in range ( 2 , 5 ) :
            for b in range ( 2 , 5 ) :
                for c in range ( 2 , 5 ) :
                    name = "{}{}{}".format ( a , b , c )
                    subs = { 1 : a , b : b , c : c , a * b : a * b , a * c : b * c , a * b * c : a * b * c }
                    hm [ name ] = subs
    print ( "Case #{}:\n".format ( t ) )
    for r in range ( R ) :
        P = [ [ f ( r ) ] * r for f in range ( K ) ]
        printed = False
        for key in hm :
            all = hm [ key ]
            legal = True
            for p in P :
                if p not in all :
                    legal = False
                if legal :
                    print ( key )
                    printed = True
                    break
            if not printed :
                print ( "222" )
