def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        h , w = sc.readline ( ).split ( ' ' )
        map = [ [ ] for i in sc.readline ( ).split ( ' ' ) ]
        gyo = set ( )
        retsu = set ( )
        for i in range ( h ) :
            for j in range ( w ) :
                if map [ i ] [ j ] == '#' :
                    gyo.add ( i )
                    break
        for i in range ( w ) :
            for j in range ( h ) :
                if map [ j ] [ i ] == '#' :
                    retsu.add ( i )
                    break
        for i in range ( h ) :
            F = False
            for j in range ( w ) :
                if i in gyo and j in retsu :
                    print ( map [ i ] [ j ] , end = ' ' )
                    F = True
            if F == True :
                print ( )
