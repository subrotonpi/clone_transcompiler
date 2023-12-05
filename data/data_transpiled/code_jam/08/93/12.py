def import import sys , stdin , stdout , stderr , c , verbose , verbose , filename_verbose , verbose , filename , ** kwargs ) :
    from io import open
    from pydot.util import get_filename
    infile = open ( 'C-small-attempt0.in' , 'r' )
    outfile = open ( 'c.out' , 'w' )
    n = len ( stdin )
    for i in range ( 1 , n + 1 ) :
        r , c = [ i for i in range ( 0 , r ) ]
        a = [ [ ] for x in range ( r ) for y in range ( c ) ]
        w = [ False ] * ( r * c )
        verbose = verbose
        verbose = verbose
        while True :
            eq = True
            nm = 0
            main :
            for x in range ( r ) :
                for y in range ( c ) :
                    co = 0
                    for dx in [ - 1 , 1 ] :
                        for dy in [ - 1 , 1 ] :
                            nx , ny = x + dx , y + dy
                            if 0 <= nx < r and 0 <= ny < c and w [ nx * c + ny ] :
                                co += 1
                    if w [ x * c + y ] and x == r / 2 :
                        nm += 1
                    if co != a [ x , y ] :
                        eq = False
                        break main
        if eq :
            verbose = max ( verbose , nm )
        k = 0
        while k < len ( w ) and w [ k ] :
            w [ k ] = False
            k += 1
        if k >= len ( w ) :
            break
        w [ k ] = True
    stdout.write ( 'Case #%d: %d\n' % ( i , max ) )
    print ( '.' , file = outfile )
