def import import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = int ( sc.read ( ) )
        b = int ( sc.read ( ) )
        c = int ( sc.read ( ) )
        if a < b :
            if c < a :
                print ( b - c )
            else :
                if b > c :
                    print ( b - a )
                else :
                    print ( c - a )
        else :
            if b > c :
                print ( a - c )
            else :
                if a > c :
                    print ( a - b )
                else :
                    print ( c - b )
