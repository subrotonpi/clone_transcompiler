def main ( ) :
    import sys
    import string
    import string
    import string
    import string
    import string
    import string
    import string
    import sys
    import string
    import string
    import string
    import sys
    import string
    import string
    import string
    import string
    import string
    import sys
    T = sys.stdin.read ( )
    for zz in range ( 1 , T + 1 ) :
        C = sys.stdin.read ( )
        combine = string.split ( string.punctuation )
        D = sys.stdin.read ( )
        oppose = string.split ( string.punctuation )
        N = sys.stdin.read ( )
        S = string.split ( string.punctuation )
        list = [ ]
        for c in S :
            list.append ( c )
            removed = False
            if len ( list ) >= 2 :
                l1 = list [ - 2 ]
                l2 = list [ - 1 ]
                for comb in combine :
                    a = comb [ 0 ]
                    b = comb [ 1 ]
                    if ( a == l1 and b == l2 ) or ( a == l2 and b == l1 ) :
                        list.pop ( )
                        list.pop ( )
                        list.append ( comb [ 2 ] )
                        removed = True
                        break
            if not removed :
                done :
                    for k in list :
                        for j in range ( len ( list ) ) :
                            if k == j : continue
                            for opp in oppose :
                                if list [ k ] == opp [ 0 ] and list [ j ] == opp [ 1 ] :
                                    list = [ ]
                                    break done
        ans = string.join ( list )
        print ( "Case #%d: %s\n" % ( zz , ans ) )
