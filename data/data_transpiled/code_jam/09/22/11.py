def import _solve
import os
import sys
import os
import re
import numpy as np
import numpy as np
import numpy as np
import numpy as np
import numpy as np
import numpy as np
import numpy.random
import numpy.random
import numpy.random
class B :
    def solve ( self ) :
        s = "000000000000000000000000000000000" + sc.next ( )
        c = s.decode ( 'ascii' )
        self.next_perm ( c )
        res = np.array ( c )
        while res.startswith ( '0' ) :
            res = res [ 1 : ]
        return res
    def next_perm ( self , a ) :
        n = len ( a )
        i = n
        if i <= 1 :
            return False
        while True :
            ii = i -= 1
            if a [ i ] < a [ ii ] :
                j = n
                while not ( a [ i ] < a [ -- j ] ) :
                    swap ( a , i , j )
                    for j in range ( n , ii ) :
                        swap ( a , j , ii )
                return True
            if i == 0 :
                self.reverse ( a )
                return False
    def swap ( self , p ) :
        t = p [ i ]
        p [ i ] = p [ j ]
        p [ j ] = t
    def reverse ( self ) :
        for l , r in zip ( self.p [ : - 1 ] , self.p [ 1 : ] ) :
            swap ( self , l , r )
    global infile
    infile = os.path.join ( 'input.txt' , 'B-small-attempt0.in' , 'B-large.in' )
    sc = np.genfromtxt ( infile , delimiter = '\t' )
    fw = open ( 'output.txt' , 'w' , newline = '' )
    N = len ( sc )
    sc.next ( )
    for cas in range ( 1 , N + 1 ) :
        fw.write ( 'Case #%d: ' % cas )
        res = B ( ).solve ( )
        fw.write ( res )
        fw.flush ( )
    fw.close ( )
    return
