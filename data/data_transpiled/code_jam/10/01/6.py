def SPACETOKEN qualification SPACETOKEN ( ) : SPACETOKEN return SPACETOKEN "ON" SPACETOKEN or SPACETOKEN "OFF" SPACETOKEN """
import os
import sys
import os
import sys
import csv
import csv
import csv
import os
import sys
import os
import sys
file = " A - large "
with open ( file + ".in " , " r" ) as sc :
    with open ( file + ".out " , " w " ) as out :
        cases = sc.next ( )
        sc.next ( )
        for cas in range ( 1 , cases + 1 ) :
            n , k = os.path.split ( file )
            out.write ( " Case SPACETOKEN # % d : SPACETOKEN % s % s \n " % ( cas , "ON" if k == ( 1 << n ) - 1 else "OFF" ) )
