def solve ( A , B ) :
    from math import fabs
    ans = fabs ( A )
    for one in [ - 4 , 4 ] :
        for five in [ - 1 , 1 ] :
            for ten in [ - 10 , 10 ] :
                if A + one + 5 * five + 10 * ten == B :
                    ans = min ( ans , fabs ( one ) + abs ( five ) + abs ( ten ) )
    return ans
