def import import sys
import string
import string
import sys
class Main ( object ) :
    def __init__ ( self ) :
        Scanner ( )
    def __init__ ( self ) :
        sc = string.ascii_lowercase
        for i in range ( 3 ) :
            for j in range ( 3 ) :
                c [ i ] [ j ] = sc.next ( )
    a = [ ]
    b = [ ]
    for i in range ( 0 , 100 ) :
        b.append ( i )
        a.append ( c [ 0 ] [ 0 ] - i )
        a.append ( c [ 1 ] [ 0 ] - i )
        a.append ( c [ 2 ] [ 0 ] - i )
        b.append ( c [ 0 ] [ 1 ] - c [ 0 ] [ 0 ] + i )
        b.append ( c [ 0 ] [ 2 ] - c [ 0 ] [ 0 ] + i )
        d = 0
        for j in range ( 1 , 2 ) :
            for k in range ( 1 , 2 ) :
                if a [ j ] + b [ k ] != c [ j ] [ k ] :
                    d += 1
        if d == 0 :
            self.out.println ( "Yes" )
            break
        elif i == 100 :
            self.out.println ( "No" )
