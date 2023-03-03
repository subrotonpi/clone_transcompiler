def import readline
import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = MyScanner ( )
        self.out = sys.stdout
        self.n , m = sc.__next__ ( )
        a , del = [ ] , [ ]
        e , o = 0 , m
        for i in range ( m ) : a.append ( sc.__next__ ( ) )
        for i in range ( m ) :
            if a [ i ] % 2 == 0 : del [ e ]
            else : del [ - o ]
        if o < m - 2 :
            self.out.write ( "Impossible" )
            self.out.close ( )
            return
        if o == m :
            b = [ a [ 0 ] - 1 ]
            for i in range ( 1 , m ) : b.append ( a [ i ] )
            b.append ( 1 )
        elif o == m - 1 :
            del a [ : m ]
            b = [ 1 if a [ m - 1 ] == 1 else m + 1 ]
            if a [ m - 1 ] != 1 : b.append ( a [ m - 1 ] - 1 )
        else :
            a.append ( del [ m - 2 ] )
            a.append ( del [ m - 1 ] )
            for i in range ( m - 2 ) : b.append ( a [ i ] )
            if a [ m - 1 ] != 1 : b.append ( a [ m - 1 ] - 1 )
        for i in range ( m ) : self.out.write ( "%s%s" % ( a [ i ] , "\n" if i == m - 1 else " " ) )
