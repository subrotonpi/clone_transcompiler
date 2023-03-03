def main ( ) :
    import sys
    from os.path import join
    reader = open ( join ( sys.argv [ 1 : ] , '..' ) )
    S = reader.readline ( )
    T = reader.readline ( )
    ans = 'No'
    for i in range ( len ( S ) ) :
        if S == T :
            ans = 'Yes'
            break
        S = S [ - 1 ] + S [ : - 1 ]
    reader.close ( )
    sys.stdout.write ( ans )
