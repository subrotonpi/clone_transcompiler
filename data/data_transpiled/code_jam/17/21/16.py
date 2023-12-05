def r1b2017 ( ) :
    import os
    import sys
    import csv
    import csv
    import csv
    import csv
    import sys
    import os
    import sys
    import csv
    from r1b2017.utils import r1b2017
    from r1b2017.utils import r1b2017
    infile = sys.stdin
    outfile = sys.stdout
    for t , cs in enumerate ( csv.reader ( infile ) ) :
        outfile.write ( "Case #%d: " % cs )
        d , n = csv.reader ( infile )
        max = 0
        for i in range ( n ) :
            k , s = csv.reader ( infile )
            cur = 1.0 * ( d - k ) / s
            if cur > max :
                max = cur
        res = d / max
        outfile.write ( res )
    outfile.flush ( )
