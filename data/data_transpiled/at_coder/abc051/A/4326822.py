def import _main
class Main ( object ) :
    def __init__ ( self , args ) :
        with open ( 'po.txt','r' ) as sc :
            po = sc.read ( )
        print ( po.replace ( ',' , ' ' ) )
