def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.sn = sys.stdin
    K = len ( sys.argv )
    a , b = 1 , 1
    tmp = 0
    for i in range ( K ) :
        tmp = a + b
        b = a
        a = tmp
    sys.stdout.write ( a )
    sys.stdout.write ( ' ' )
    sys.stdout.write ( b )
