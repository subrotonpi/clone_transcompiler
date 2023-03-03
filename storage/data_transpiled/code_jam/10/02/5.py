def import _large
import os
import sys
import os
import sys
import binascii
import binascii
import string
infile = 'B-large.in'
outfile = infile + '.out'
lin = _large.open ( infile )
out = open ( outfile , 'w' )
NCASE = int ( lin.readline ( ) )
for CASE in range ( 1 , NCASE + 1 ) :
    out.write ( 'Case #%d: ' % CASE )
    l = lin.readline ( )
    ll = l.split ( )
    N = int ( ll [ 0 ] )
    t = [ binascii.unhexlify ( ll [ i + 1 ] ) for i in range ( N ) ]
    T = None
    for a in range ( N ) :
        for b in range ( a , N ) :
            d = t [ a ] - t [ b ]
            if T is None :
                T = d
            else :
                T = T.gcd ( d )
        y = t [ 0 ] % T
        if not y in [ 0 , 1 ] :
            y = T - y
        out.write ( y )
    lin.close ( )
    out.close ( )
