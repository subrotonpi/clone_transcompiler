def main ( ) :
    import sys
    from os.path import join
    infile = open ( 'B-large.in' , 'r' )
    outfile = open ( 'b.out' , 'w' )
    C = int ( infile.readline ( ) )
    for i in range ( 1 , C + 1 ) :
        tz = infile.readline ( ).split ( )
        N = int ( tz [ 0 ] )
        M = int ( tz [ 1 ] )
        A = int ( tz [ 2 ] )
        if A > N * M :
            ans = 'IMPOSSIBLE'
        else :
            a , b , c , d = A // M , 1 , M
            if a * M == A :
                b = 0
            else :
                a += 1
                b = a * d - A
            ans = '0 0 {} {} {} {}'.format ( a , b , c , d )
        outfile.write ( 'Case #{}: {}\n'.format ( i , ans ) )
    infile.close ( )
    outfile.close ( )
