def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = [ ]
        ind = 0
        max = 0
        sum = 0
        for i in range ( 3 ) :
            a.append ( sc.read ( ) )
            if a [ i ] > max :
                max = a [ i ]
                ind = i
        k = sc.read ( )
        for i in range ( k ) :
            a [ ind ] += a [ ind ]
        for i in range ( 3 ) :
            sum += a [ i ]
        print ( sum )
        sc.close ( )
