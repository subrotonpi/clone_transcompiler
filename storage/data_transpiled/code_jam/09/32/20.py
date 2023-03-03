def _import ( ) :
    import os
    import math
    import os
    import os
    import math
    import os
    import os
    import math
    import os
    import math
    import os
    import sys
    class CenterofMass ( object ) :
        def __init__ ( self ) :
            self.INPUT = 'input.txt'
            self.OUTPUT = 'output.txt'
        def readline ( self ) :
            line = self.INPUT.readline ( )
            return int ( line )
        def readline ( self ) :
            tokens = self.INPUT.readline ( ).split ( )
            res = [ int ( t ) for t in tokens ]
            return res
    def readInts ( ) :
        f = open ( 'input.txt' , 'r' )
        f.write ( '\n' )
    def readInts ( ) :
        f.close ( )
        return [ ]
    def readInts ( ) :
        f = open ( 'output.txt' , 'w' )
        cn = readInts ( )
        for t in range ( cn ) :
            n = readInts ( )
            a1 , a2 , b1 , b2 , c1 , c2 = 0 , 0 , 0 , 0 , 0
            for a in readInts ( ) :
                a1 += a [ 0 ]
                b1 += a [ 1 ]
                c1 += a [ 2 ]
                a2 += a [ 3 ]
                b2 += a [ 4 ]
                c2 += a [ 5 ]
            a1 , a2 , b1 , b2 , c1 , c2 = a1 / n , a2 / n , b1 / n , b2 / n , c1 / n , c2 / n
            gama = a1 * a1 + b1 * b1 + c1 * c1
            beta = 2 * a1 * a2 + 2 * b1 * b2 + 2 * c1 * c2
            alpha = a2 * a2 + b2 * b2 + c2 * c2
            time = - 1
            val = - 1
            if alpha > 0 :
                time = - beta / 2 / alpha
                if time < 0 :
                    time = 0
            else :
                time = 0
    f.close ( )
    return CenterofMass
