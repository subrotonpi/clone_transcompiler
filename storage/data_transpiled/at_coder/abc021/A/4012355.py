def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = sc.read ( )
        map = [ 8 , 4 , 2 , 1 ]
        lst = [ ]
        for i in map :
            if N >= i :
                lst.append ( i )
                N -= i
        print ( len ( lst ) )
        for i in lst :
            print ( i )
