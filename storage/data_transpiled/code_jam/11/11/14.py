def main ( ) :
    import os
    from cStringIO import StringIO
    from os.path import join
    infile = open ( 'c:\\codejam\\cj2011_r1a_a\\input.txt' , 'r' )
    outfile = open ( 'c:\\codejam\\cj2011_r1a_a\\output.txt' , 'w' )
    t = int ( infile.readline ( ) )
    if t == 0 :
        c , d = 0 , 1
    else :
        c , d = t
    n , pd , pg = map ( int , infile.readline ( ).split ( ) )
    candies = [ ]
    for i in range ( t ) :
        data = infile.readline ( )
        data = data.split ( )
        n , pd , pg = map ( int , data )
        ans = solve ( n , pd , pg )
        outfile.write ( 'Case #%s: %s\n' % ( str ( i + 1 ) , ans ) )
    infile.close ( )
    outfile.close ( )
