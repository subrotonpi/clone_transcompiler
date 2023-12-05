def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        a = sc.read ( )
        b = sc.read ( )
        if len ( a ) != len ( b ) :
            print ( "You will lose" )
            return
        for ca , cb in zip ( a , b ) :
            if ca != cb :
                if ca == "@" and ( cb == "a" or cb == "t" or cb == "c" or cb == "o" or cb == "d" or cb == "e" or cb == "r" ) :
                    continue
                if cb == "@" and ( ca == "a" or ca == "t" or ca == "c" or ca == "o" or ca == "d" or ca == "e" or ca == "r" ) :
                    continue
                print ( "You will lose" )
                return
        print ( "You can win" )
