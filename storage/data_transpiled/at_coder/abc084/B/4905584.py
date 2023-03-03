def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = int ( sc.readline ( ) )
        b = int ( sc.readline ( ) )
        s = sc.readline ( )
        if len ( s ) == a + b + 1 and s [ a ] == '-' :
            for i , c in enumerate ( s ) :
                if i != a and c == '-' :
                    print ( 'No' )
                    return
            print ( 'Yes' )
            return
        print ( 'No' )
