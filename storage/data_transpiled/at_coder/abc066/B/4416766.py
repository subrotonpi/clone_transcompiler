def import _Scanner
class Main ( object ) :
    def __init__ ( self , sc ) :
        self.sc = sc
    def main ( self ) :
        s = self.sc.next ( )
        for i in range ( len ( s ) - 2 , 1 , - 2 ) :
            ss = s [ : i ]
            if ss [ : i // 2 ] == ss [ i // 2 : ] :
                print ( len ( ss ) )
                return
