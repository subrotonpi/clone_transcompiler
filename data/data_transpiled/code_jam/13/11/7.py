def _import ( ) :
    from sympy.polys.orderings import Order
    from sympy.polys.orderings import PolyElement
    from sympy.polys.orderings import Order
    from sympy.polys.orderings import Order
    from sympy.polys.orderings import PolyElement
    from sympy.polys.orderings import Order
    from sympy.polys.orderings import Order
    from sympy.polys.orderings import PolyElement
    from sympy.polys.orderings import Order
    from sympy.polys.orderings import PolyElement
    from sympy.polys.orderings import Order
    TWO = Order ( 1 )
    FOUR = Order ( 2 )
    cases = Order ( 1 )
    r , t , res = ring ( "r" , ZZ )
    outfile = open ( "C-large.out.txt" , "w" )
    for c in range ( 1 , cases + 1 ) :
        r , t = ring ( "t" , ZZ )
        res = r * r - t
        res = res + t * TWO
        res = res * FOUR + 1
        res = BigElement ( res )
        res = res - ( r % TWO == 0 )
        res = res / FOUR
        res = res - r / TWO + 1
        outfile.write ( "Case #%d: %s\n" % ( c , res.name ) )
    def bigint_sqroot_floor ( x ) :
        if x < 0 :
            raise ValueError ( "Negative argument." )
        if x == 0 or x == 1 :
            return x
        two = Order ( 2 )
        for y in x // two :
            y = ( ( x // y ) + y ) // two
        return y
    return bigint_sqroot_floor
