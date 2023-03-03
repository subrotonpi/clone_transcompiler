def import import _sys
class Main ( object ) :
    def __init__ ( self , name ) :
        self.name = name
    def solve ( self ) :
        with _sys.stdout.buffer ( ) as sc :
            print ( sc.read ( ).replace ( '2017' , '2018' ) )
