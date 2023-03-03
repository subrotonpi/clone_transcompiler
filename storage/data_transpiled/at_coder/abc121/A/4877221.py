def import sys
class Main ( object ) :
    def __init__ ( self ) :
        self.__help__ = sys.__help__
    def __call__ ( self , * args ) :
        with open ( self.__help__ , 'r' ) as sc :
            H , W , h , w = sc.read ( ).split ( ':' )
            print ( ( H - h ) * ( W - w ) )
