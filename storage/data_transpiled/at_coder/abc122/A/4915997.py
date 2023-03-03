def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        b = sc.readline ( )
        data = ""
        if b == "A" :
            data = "T"
        elif b == "T" :
            data = "A"
        elif b == "C" :
            data = "G"
        elif b == "G" :
            data = "C"
        else :
            pass
        print ( data )
