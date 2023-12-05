def round3 ( ) :
    import os
    import sys
    import math
    import numpy as np
    import os.path
    import sys
    class A :
        I_DONT_KNOW = "I don't know."
        def main ( self ) :
            with open ( self.filename + '.in' , 'w' ) as f :
                f.write ( "%s\n" % self.filename )
    def solve ( self ) :
        for i in range ( 1 , k ) :
            zz = ( a [ i - 1 ] * aa + bb ) % p
            if a [ i ] != zz :
                ok = False
                break
        if not ok :
            continue
        r = ( a [ k - 1 ] * aa + bb ) % p
        if res == - 1 :
            return I_DONT_KNOW
        res = r
    if res == - 1 :
        raise Error ( )
    return "%s" % res
def solve ( self ) :
    d = len ( self.data )
    k = len ( self.data )
    a = np.array ( [ x for x in self.data [ k ] ] )
    if k == 1 :
        return I_DONT_KNOW
    max = 1
    for i in range ( d ) :
        max *= 10
    z = np.zeros ( max , dtype = int )
    z [ : ] = - 1
    for i in range ( k ) :
        if z [ a [ i ] ] >= 0 :
            p = i - z [ a [ i ] ]
            return "%s" % a [ k - p ]
        z [ a [ i ] ] = i
    if k == 2 :
        print ( "%s %s" % ( d , " ".join ( a ) ) )
        return I_DONT_KNOW
    pr = np.zeros ( max , dtype = int )
    pr [ : ] = True
    for i in range ( 2 , len ( pr ) ) :
        if i * i > len ( pr ) :
            break
        if pr [ i ] :
            for j in range ( i * i , len ( pr ) , i ) :
                pr [ j ] = False
    return res
    