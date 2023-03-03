def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = [ ]
        max = 0
        mai = 0
        for i in range ( 3 ) :
            a.append ( sc.read ( ) )
            if max < a [ i ] :
                max = a [ i ]
                mai = i
        k = sc.read ( )
        sum = 0
        for i in range ( k ) :
            max = max * 2
        sum = max
        for i in range ( 3 ) :
            if i != mai :
                sum += a [ i ]
        print ( sum )
        sc.close ( )
