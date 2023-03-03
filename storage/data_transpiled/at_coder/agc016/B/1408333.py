def main ( ) :
    import sys
    from itertools import repeat
    n = len ( sys.argv )
    ak = bk = an = bn = 0
    for i in range ( n ) :
        v = sys.argv [ i ]
        if ak == None :
            ak = v
            an += 1
        elif v == ak :
            an += 1
        elif bk == None :
            bk = v
            bn += 1
            if abs ( ak - bk ) > 1 :
                print ( "No" )
                return
        elif v == bk :
            bn += 1
        else :
            print ( "No" )
            return
    if bk == None :
        print ( "Yes" if ( ak == n - 1 or 2 * ak <= n ) else "No" )
    else :
        if ak < bk :
            tk = ak
            ak , bk = bk , tk
            tn = an
            an , bn = bn , tn
        print ( "Yes" if ( bn < ak and 2 * ( ak - bn ) <= an ) else "No" )
