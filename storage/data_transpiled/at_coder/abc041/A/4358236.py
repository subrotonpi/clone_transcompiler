def import _main
class Main ( object ) :
    def __init__ ( self ) :
        with open ( "po.txt" , "r" ) as sc :
            po = sc.read ( )
        a = len ( po )
        print ( po [ a - 1 : a ] )
