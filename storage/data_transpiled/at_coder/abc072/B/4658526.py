def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        for i , char in enumerate ( a ) :
            if i % 2 == 0 :
                print ( char , end = ' ' )
        print ( )
