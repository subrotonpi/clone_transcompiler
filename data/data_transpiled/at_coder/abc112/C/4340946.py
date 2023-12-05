def import readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = MyScanner ( )
        n = sc.__next__ ( )
        x = [ ]
        y = [ ]
        h = [ ]
        ansx = 0
        ansy = 0
        ansh = 0
        for i in range ( n ) :
            x.append ( sc.__next__ ( ) )
            y.append ( sc.__next__ ( ) )
            h.append ( sc.__next__ ( ) )
    def readline ( ) :
        return ""
    def readline ( ) :
        return readline ( )
    def lmin ( ) :
        return int ( lmin ( ) )
    def lmax ( ) :
        return float ( lmax ( ) )
    def lmax ( ) :
        return lmax ( )
    def lmax ( ) :
        return lmax ( )
    tall = 0
    for i in range ( 0 , 100 ) :
        for j in range ( 0 , 100 ) :
            top = True
            for k in range ( n ) :
                if h [ k ] != 0 :
                    if tall == 0 :
                        tall = abs ( i - x [ k ] ) + abs ( j - y [ k ] ) + h [ k ]
                    elif tall != abs ( i - x [ k ] ) + abs ( j - y [ k ] ) + h [ k ] :
                        top = False
                if k == n - 1 and top :
                    for g in range ( n ) :
                        if h [ g ] != max ( tall - abs ( i - x [ g ] ) - abs ( j - y [ g ] ) , 0 ) :
                            top = False
                    if top :
                        ansx = i
                        ansy = j
                        ansh = tall
                if k == n - 1 :
                    tall = 0
    print ( ansx , ansy , ansh )
    def l_min ( a ) :
        a.sort ( )
        return a [ 0 ]
    def l_max ( a ) :
        l = len ( a )
        a.sort ( )
        return l
