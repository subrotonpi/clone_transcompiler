def import solve
import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.max = 0
    def solve ( self ) :
        sc = sys.stdin
        n = sc.read ( )
        a = [ ]
        b = [ ]
        c = [ ]
        d = [ ]
        judge = [ True ]
        count = 0
        for i in range ( n ) :
            a.append ( sc.read ( ) )
            b.append ( sc.read ( ) )
        for i in range ( n ) :
            c.append ( sc.read ( ) )
            d.append ( sc.read ( ) )
        for i in range ( n ) :
            for j in range ( i + 1 , n ) :
                if a [ i ] > a [ j ] :
                    tmp = a [ i ]
                    a [ i ] = a [ j ]
                    a [ j ] = tmp
                    tmp = b [ i ]
                    b [ i ] = b [ j ]
                    b [ j ] = tmp
                elif a [ i ] == a [ j ] and b [ i ] > b [ j ] :
                    tmp = a [ i ]
                    a [ i ] = a [ j ]
                    a [ j ] = tmp
                    tmp = b [ i ]
                    b [ i ] = b [ j ]
                    b [ j ] = tmp
                if c [ i ] > c [ j ] :
                    tmp = c [ i ]
                    c [ i ] = c [ j ]
                    c [ j ] = tmp
                    tmp = d [ i ]
                    d [ i ] = d [ j ]
                    d [ j ] = tmp
                elif c [ i ] == c [ j ] and d [ i ] > d [ j ] :
                    tmp = c [ i ]
                    c [ i ] = c [ j ]
                    c [ j ] = tmp
                    tmp = d [ i ]
                    d [ i ] = d [ j ]
                    d [ j ] = tmp
    print ( count )
