def import import math
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        height = sc.readline ( ).strip ( )
        bmi = sc.readline ( ).strip ( )
        print ( bmi * math.pow ( height / 100 , 2 ) )
