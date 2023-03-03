def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        s = sc.readline ( ).split ( )
        n1 = int ( s [ 0 ] )
        n2 = int ( s [ 1 ] )
        n3 = int ( s [ 2 ] )
        n4 = int ( s [ 3 ] )
        st = 0
        en = 0
        if n1 > n3 :
            st = n1
        else :
            st = n3
        if n2 < n4 :
            en = n2
        else :
            en = n4
        if en - st > 0 :
            print ( en - st )
        else :
            print ( 0 )
