def main ( ) :
    import random
    import sys
    import numpy as np
    import numpy.random
    class Main ( object ) :
        def __init__ ( self ) :
            Scanner = sys.stdin
            N = np.random.randint ( 1 , N + 1 )
            A = np.random.randint ( 1 , N + 1 )
            B = np.random.randint ( 1 , N + 1 )
            v = np.array ( [ random.randint ( 1 , N + 1 ) for i in range ( N ) ] )
            cv = [ ]
            for i in range ( N ) :
                v.append ( v [ i ] )
                if i > 0 :
                    cv [ i ] += cv [ i - 1 ]
        self.freq = { }
        for i in range ( N ) :
            self.freq [ v [ i ] ] = self.freq.get ( v [ i ] , 0 ) + 1
        iv = [ ]
        inum = 1
        iv.append ( 1 )
        for i in range ( 1 , N ) :
            if v [ i ] == v [ i - 1 ] :
                inum += 1
            else :
                inum = 1
            iv.append ( inum )
    C = choose ( N )
    imax = 1
    smax = 0
    count = 0
    for i in range ( A , B + 1 ) :
        s = self.cv [ i - 1 ]
        if s * imax > smax * i :
            imax = i
            smax = s
            count = C [ self.freq [ v [ i - 1 ] ] ] [ iv [ i - 1 ] ]
        elif s * imax == smax * i :
            count += C [ self.freq [ v [ i - 1 ] ] ] [ iv [ i - 1 ] ]
    print ( smax * 1.d / imax )
    print ( count )
    def reverse ( self ) :
        i = 0
        j = len ( self.a ) - 1
        while i < j :
            self.swap ( i , j )
            i += 1
            j -= 1
    return C
