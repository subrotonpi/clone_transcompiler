def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        n = sc.readline ( )
        sc.close ( )
        d = { }
        for i in range ( n ) :
            po = sc.readline ( )
            if not d [ po ] :
                d [ po ] = 1
            else :
                d [ po ] = d [ po ] + 1
        p = ''
        a = 0
        for key in d :
            if d [ key ] > a :
                a = d [ key ]
                p = key
        print ( p )
