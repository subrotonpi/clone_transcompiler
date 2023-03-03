def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        if N % 2 == 0 :
            print ( - 1 )
            sys.exit ( 0 )
        str = sc.readline ( )
        s = ""
        count = 0
        while len ( s ) < 100 :
            if count == 0 :
                s = "b"
            elif count % 3 == 1 :
                s = "a" + s + "c"
            elif count % 3 == 2 :
                s = "c" + s + "a"
            else :
                s = "b" + s + "b"
            if s == str :
                print ( count )
                sys.exit ( 0 )
            count += 1
        print ( - 1 )
