def main ( ) :
    import sys
    from os.path import join
    from os import sep
    from os.path import join
    sc = open ( join ( sys.argv [ 1 : ] , 'r' ) , 'w' )
    N = int ( sc.readline ( ) )
    S = sc.read ( )
    cntnum = [ ]
    cnt = 0
    for i in range ( 1 , len ( S ) ) :
        ans = 0
        s1 = S [ : i ]
        s2 = S [ i : N ]
        for c in [ 'a' , 'z' ] :
            d = sep.join ( [ c , d ] )
            if s1.find ( d ) != - 1 and s2.find ( d ) != - 1 :
                ans += 1
        if cnt < ans :
            cnt = ans
    sys.stdout.write ( cnt )
    sys.stdout.flush ( )
