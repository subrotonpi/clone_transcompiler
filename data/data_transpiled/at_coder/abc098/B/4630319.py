def main ( ) :
    import sys
    from os.path import join
    from os import sep
    with open ( join ( sys.argv [ 1 : ] , '..' ) ) as sc :
        s = sc.read ( )
        s = sep.join ( s.split ( '' ) )
        S = s.split ( '' )
        ans = 0
        for i in range ( len ( S ) - 1 ) :
            sum = 0
            used = ''
            for j in range ( i ) :
                if used.find ( S [ j ] ) == - 1 and s.find ( S [ j ] , i ) > 0 :
                    sum += 1
                used += S [ j ]
            ans = max ( sum , ans )
        print ( ans )
