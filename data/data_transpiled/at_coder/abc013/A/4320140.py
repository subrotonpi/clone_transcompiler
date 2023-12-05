def import _main
class Main ( object ) :
    def __init__ ( self ) :
        with open ( "/proc/main.txt" ) as sc :
            a = sc.read ( )
    p = { "A" : 1 , "B" : 2 , "C" : 3 , "D" : 4 , "E" : 5 }
    print ( p [ a ] )
