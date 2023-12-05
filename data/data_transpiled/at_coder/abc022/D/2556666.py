def import _readline
import sys
from io import StringIO
from time import sleep
from random import randint
from random import uniform
from random import uniform
from random import uniform
from random import uniform
from random import uniform
from numpy import sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , sin , cos , sin , cos , sin , cos , sin , cos , sin , cos , sin , sin , , cos , sin , , cos , sin , , sin , , , sys
class Main ( object ) :
    def readline ( self ) :
        sc = FastReader ( )
        n = sc.__next__ ( )
        axs = [ ]
        ays = [ ]
        bxs = [ ]
        bys = [ ]
        for i in range ( n ) :
            axs.append ( sc.__next__ ( ) )
            ays.append ( sc.__next__ ( ) )
        for i in range ( n ) :
            bxs.append ( sc.__next__ ( ) )
            bys.append ( sc.__next__ ( ) )
        solve ( )
    def solve ( ) :
        cgax = 0
        cgay = 0
        cgbx = 0
        cgby = 0
        for i in range ( n ) :
            cgax += axs [ i ]
            cgay += ays [ i ]
            cgbx += bxs [ i ]
            cgby += bys [ i ]
        cgax /= n
        cgay /= n
        cgbx /= n
        cgby /= n
    max_distance_a = 0
    for i in range ( n ) :
        distance = distance ( axs [ i ] , ays [ i ] , cgax , cgay )
        if max_distance_a < distance :
            max_@@