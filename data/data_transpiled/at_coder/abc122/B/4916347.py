def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        str = sc.readline ( )
        ch = str.decode ( 'utf-8' )
        v = 0
        max = 0
        for c in ch :
            if c in [ 'A' , 'C' , 'G' , 'T' ] :
                v = v + 1
            else :
                if max < v :
                    max = v
                v = 0
            if max < v :
                max = v
        print ( max )
