def main ( args ) :
    import os
    import csv
    import csv
    import os.path
    import sys
    infile = 'A-large.in'
    outfile = infile + '.out'
    lin = csv.reader ( open ( infile ) , delimiter = ' ' )
    out = csv.writer ( open ( outfile , 'w' ) , delimiter = ' ' )
    NCASE = int ( lin.next ( ) )
    for CASE in range ( 1 , NCASE + 1 ) :
        out.write ( 'Case #%d: ' % CASE )
        l = lin.next ( )
        i = l.index ( ' ' )
        N = int ( l [ : i ].strip ( ) )
        K = int ( l [ i + 1 : ].strip ( ) )
        n = ( 1 << N ) - 1
        out.writerow ( ( K & n ) == n and 'ON' or 'OFF' )
    lin.close ( )
    out.close ( )
