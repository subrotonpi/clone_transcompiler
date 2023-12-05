def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        h , w = sc.readline ( ).split ( '' )
        aka = [ ]
        ao = [ ]
        for i in range ( h ) :
            for j in range ( w ) :
                if i % 2 == 0 :
                    if j == 0 :
                        aka.append ( [ 1 , 1 ] )
                    else :
                        ao.append ( [ 1 , 1 ] )
                else :
                    if j == ( w - 1 ) :
                        ao.append ( [ 1 , 1 ] )
                    else :
                        aka.append ( [ 1 , 1 ] )
        data = sc.read ( )
        for j in range ( w ) :
            if data [ j ] == '#' :
                aka.append ( [ 1 , 1 ] )
                ao.append ( [ 1 , 1 ] )
    self.pl ( aka )
    self.pl ( ao )
def pl ( ta ) :
    for i in range ( len ( ta ) ) :
        for j in range ( len ( ta [ 0 ] ) ) :
            print ( ( ta [ i ] [ j ] == 1 ) and '#' or '.' , end = '' )
        print ( )
