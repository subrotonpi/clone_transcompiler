def import _main
class Main ( object ) :
    def __init__ ( self ) :
        self.sc = sys.stdin
        str = self.sc.readline ( )
        while True :
            str = str [ : - 2 ]
            tmp1 = str [ : len ( str ) / 2 ]
            tmp2 = str [ len ( str ) / 2 : len ( str ) ]
            if tmp1 == tmp2 :
                print ( str )
                break
