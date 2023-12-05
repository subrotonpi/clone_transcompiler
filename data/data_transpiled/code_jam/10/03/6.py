def main ( arg ) :
    import sys
    from numpy.testing import get_seed
    from numpy.testing import get_seed
    from numpy.testing import get_seed
    from numpy.testing import get_seed
    from numpy.testing import get_seed
    from numpy.testing import get_seed
    from numpy.testing import get_seed
    from numpy.testing import get_seed
    from numpy.testing import get_seed
    tcc = get_seed ( )
    for tc in range ( 1 , tcc + 1 ) :
        r , k , n = get_seed ( )
        arr = get_seed ( )
        ans = 0
        score = [ ]
        vis = [ ]
        pos = 0
        while r > 0 :
            if vis and score :
                if vis [ pos ] != 0 :
                    delta = vis [ pos ] - r
                    change = ans - score [ pos ]
                    reps = r / delta
                    if reps > 0 :
                        r -= delta * reps
                        ans += change * reps
                    vis = None
                    score = None
                    continue
                score.append ( ans )
                vis.append ( r )
            s = k
            g = 0
            while s >= arr [ pos ] and g < n :
                s -= arr [ pos ]
                pos = ( pos + 1 ) % n
                g += 1
            ans += k - s
            del r
        out.write ( "Case #%d: %d\n" % ( tc , ans ) )
