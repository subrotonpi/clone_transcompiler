def import sys
class Main ( object ) :
    def __init__ ( self ) :
        sc = sys.stdin
        N = int ( sc.readline ( ) )
        kona = int ( sc.readline ( ) )
        dounatu = [ int ( i ) for i in sc.readline ( ).split ( ) ]
        kona = kona - dounatu [ 0 ]
        dounatu = [ i for i in dounatu if i not in "-" ]
        sys.stdout.write ( N + kona / dounatu [ 0 ] )
