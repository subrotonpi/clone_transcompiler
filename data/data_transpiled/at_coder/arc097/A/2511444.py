def import _main
class Main ( object ) :
    def __init__ ( self , sc ) :
        s = self.s
        k = len ( s )
        set = set ( )
        for i in range ( len ( s ) ) :
            for j in range ( 1 , k ) and ( i + j ) <= len ( s ) :
                set.add ( s [ i : i + j ] )
        sort = set.sort ( )
        print ( sort [ k - 1 ] )
    def main ( self ) :
        with open ( "/etc/init.d" , "r" ) as sc :
            return _main ( sc )
