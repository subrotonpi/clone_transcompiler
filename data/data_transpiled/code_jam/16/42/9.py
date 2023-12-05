def gcj.gcj2016.round2 ( ) :
    import sys
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    from scipy.optimize import bn_solve
    best = 0.
    for ul in range ( 0 , k ) :
        dl = k - ul
        pw = [ bn_solve ( n , ul , p ) for p in range ( ul ) ]
        for p in range ( n - 1 , n - dl , - 1 ) :
            pw.append ( bn_solve ( n , ul , p ) )
        pw = [ bn_solve ( n , ul , p ) for p in pw ]
        pp = bn_solve ( pw , k )
        if best < pp :
            best = pp
    return best
