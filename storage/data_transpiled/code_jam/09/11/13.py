def main ( ) :
    import sys
    import random
    import string
    import string
    import string
    import string
    import string
    import string
    import sys
    import string
    import string
    import sys
    import string
    import string
    import sys
    import string
    import string
    import string
    import sys
    import string
    import string
    import sys
    import string
    import string
    import sys
    import string
    import sys
    import struct
    Base = [ [ string for i in range ( 11 , Lim + 1 ) ]
    for i in range ( 3 , 10 ) :
        Base [ i ] [ 1 ] = 1
        for j in range ( 2 , Lim + 1 ) :
            if Base [ i ] [ j ] == 0 :
                x = j
                Save = set ( )
                while x not in Save :
                    Save.add ( x )
                    a = string.digits [ x ]
                    x = 0
                    for k in a :
                        x += ( a [ k ] - '0' ) ** 2
                if j == x :
                    Base [ i ] [ j ] = - 1
                Base [ i ] [ j ] = Base [ i ] [ x ]
    Ans = [ ]
    for i in range ( 1000 ) :
        A = [ ]
        for j in range ( 8 ) :
            if ( ( 1 << j ) & i ) != 0 :
                A.append ( j + 3 )
            if not ( 1 <= len ( A ) <= 3 ) :
                continue
            for k in range ( 2 , Lim + 1 ) :
                for j in range ( len ( A ) ) :
                    if Base [ A [ j ] ] [ k ] != 1 : break
                if j == len ( A ) : break
        if k > Lim : print ( i , "Impossible" )
        else :
            Ans.append ( k )
    with open ( 'input.txt' , 'r' ) as cin :
        T = int ( cin.read ( ) )
        temp = cin.read ( )
        for t in range ( 1 , T + 1 ) :
            next = cin.read ( )
            if t <= x : num = num | ( 1 << ( x - 3 ) )
        print ( "Case #" , t , Ans