def main ( ) :
    import re
    from sympy.core import sympify
    from sympy.polys.polyclasses import PolyClass
    from sympy.polys.polyfuncs import polyfuncs
    from sympy.polys.polyfuncs import polyfuncs
    from sympy.polys.polyfuncs import polyfuncs
    from sympy.polys.polyfuncs import polyfuncs
    a = re.search ( r'^(\d+)$' , sys.stdin ).group ( 1 )
    A = sympify ( a )
    SQ = A * A.gens
    A2 = A + 1
    SQ2 = A2 * A2.gens
    sq = str ( SQ )
    sq2 = str ( SQ2 )
    sq2 = str ( SQ2 )
    sq2 = sq2.replace ( '' , '' )
    zflg = True
    zflg2 = True
    ans = ''
    while sq2 < len ( sq ) :
        wk = sq [ : - sq2 ]
        if sq2 [ - sq2 ] != '0' or sq [ - sq2 + 1 ] != '0' :
            zflg = False
        if sq2 [ sq2 ] != '0' or sq2 [ sq2 + 1 ] != '0' :
            zflg2 = False
        wk2 = sq2 [ : - sq2 ]
        if zflg :
            ans = wk
        elif not wk == wk2 :
            cand = polyfuncs ( [ wk ] , [ ] ) [ 0 ]
            if not ( zflg2 and wk2 == cand ) :
                ans = cand
        sq2 += 2
    print ( ans )
