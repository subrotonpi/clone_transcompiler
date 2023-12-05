def import _csv
import os
import csv
import os
import sys
import csv
import csv
import csv
import csv
import sys
class B :
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import sys
    import sys
    import os
    import sys
    import os
    import sys
    import os
    import tempfile
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    import csv
    MAXP = 1000
    def divide_time ( num , limit ) :
        time = 0
        for i in range ( limit + 1 , MAXP + 1 ) :
            time += num [ i ] * ( ( i - 1 ) / limit )
        return time
    def solve ( ) :
        ans = sys.maxsize
        d = csv.reader ( sys.stdin )
        num = [ ]
        for i in range ( d ) :
            num [ csv.reader ( sys.stdin ).next ( ) ] += 1
        for limit in range ( 1 , MAXP + 1 ) :
            cur = divide_time ( num , limit ) + limit
            if ans > cur :
                ans = cur
        csv.writerow ( [ str ( ans ) , str ( '' ) ] )
        csv.writerow ( [ str ( '' ) ] )
    def run ( ) :
        sc = csv.reader ( sys.stdin )
        out = csv.writer ( sys.stdout )
        t = sc.__next__
        for i in range ( 1 , t + 1 ) :
            out.writerow ( [ 'Case #%d: ' % i ] )
            solve ( )
        sc.close ( )
        out.close ( )
    def main ( ) :
        return B ( )
    main ( )
