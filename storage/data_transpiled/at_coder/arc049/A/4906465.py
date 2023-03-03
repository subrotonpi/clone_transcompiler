def import _main
class Main ( object ) :
    def __init__ ( self , * args , ** kwargs ) :
        print ( self.__doc__.replace ( '.{%s}' % self.__code__ , r'$0\u' ).replace ( '.{%s}' % ( self.__code__ , ) ).replace ( '.{%s}' % ( self.__code__ , ) ).replace ( '.{%s}' % ( self.__code__ , ) ) )
