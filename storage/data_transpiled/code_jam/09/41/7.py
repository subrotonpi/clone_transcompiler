def import import locale
import os
import sys
class A ( object ) :
    def solve ( self ) :
        f = open ( "A-large.in" , "r" )
        f = open ( "A-large.out" , "w" )
        testn = int ( f.readline ( ) )
        for test in range ( testn ) :
            n = int ( f.readline ( ) )
            a = [ ]
            for s in f :
                for j in range ( n ) :
                    a.append ( [ s [ j ] - '0' ] * n )
            last = [ ]
            for i in range ( n ) :
                last.append ( 0 )
                for j in range ( n ) :
                    if a [ i ] [ j ] == 1 :
                        last.append ( j )
        r = 0
        for i in range ( n ) :
            k = - 1
            for j in range ( i , n ) :
                if last [ j ] <= i :
                    k = j
                    break
            if k == - 1 :
                print ( "FAIL" )
                return
            r += k - i
            for j in range ( k , i - 1 , - 1 ) :
                last [ j ] = last [ j - 1 ]
        print ( "Case #%d: %d" % ( test + 1 , r ) )
        print ( "Case #%d: %d" % ( test + 1 , r ) )
    sys.stdout.flush ( )
    os.fsync ( sys.stdout )
