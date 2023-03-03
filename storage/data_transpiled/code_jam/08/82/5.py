def _ ( ) : return sys.stdin.read ( )
import os
import sys
import time
import sys
def solve ( __ ) :
    sys.stdout.write ( "Case #%d: " % __ )
    n = sys.stdin.read ( )
    x = [ ]
    y = [ ]
    z = [ ]
    h = { }
    nn = 0
    for s in sys.stdin.read ( ).split ( ) :
        if s in h :
            z.append ( h [ s ] )
        else :
            z.append ( nn )
            h [ s ] = nn
            nn += 1
        x.append ( sys.stdin.read ( ) - 1 )
        y.append ( sys.stdin.read ( ) - 1 )
    for i in range ( n ) :
        for j in range ( i + 1 , n ) :
            if x [ i ] > x [ j ] :
                t = x [ i ]
                x [ i ] = x [ j ]
                x [ j ] = t
                t = y [ i ]
                y [ i ] = y [ j ]
                y [ j ] = t
                t = z [ i ]
                z [ i ] = z [ j ]
                z [ j ] = t
    m = 10000
    best = 2 * n
    for i in range ( nn ) :
        for j in range ( i + 1 , nn ) :
            for k in range ( min ( j + 1 , nn ) , nn ) :
                last = 0
                l = ss = 0
                while l < n and last < m :
                    max = - 1
                    if x [ l ] > last : break
                    while l < n and x [ l ] <= last :
                        if y [ l ] > max and ( z [ l ] == i or z [ l ] == j or z [ l ] == k ) :
                            max = y [ l ] + 1
                        l += 1
                    ss += 1
                    last = max
                if last == m and ss < best :
                    break
    sys.stdout.write ( "IMPOSSIBLE\n" )
